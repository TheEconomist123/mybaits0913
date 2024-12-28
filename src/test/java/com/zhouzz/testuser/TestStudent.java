package com.zhouzz.testuser;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cursor.Cursor;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * @author zhouzz
 * @date 2024年12月27日20:23:41
 * @description 测试关于学生的数据迁移使用
 */

@Slf4j
public class TestStudent extends BaseTest {
    //批量处理的大小
    private static final int BATCH_SIZE = 1000;

    /**
     * 数据迁移方法
     */
    @Test
    public void migrateData() {
        //计时器
        long startTime = System.currentTimeMillis();
        try {
            log.info("开始数据迁移...");
            //清空表
            studentMapper.truncateTable();
            //获取源数据
            //设置分页参数
            PageHelper.startPage(1, BATCH_SIZE);
            //获取学生数据
            List<Student> students = studentMapper.querySourceDataStudent();
            //获取总记录数
            PageInfo<Student> studentPageInfo = new PageInfo<>(students);
            String jsonString = JSON.toJSONString(studentPageInfo);
            System.out.println("jsonString = " + jsonString);
            Long totalCount = studentPageInfo.getTotal();
            int totalPages = studentPageInfo.getPages();
            log.info("总数据量: {}, 总页数: {}", totalCount, totalPages);
            //分页处理数据
            int processedCount = 0;  // 成功处理的数量
            int failedCount = 0;     // 失败的数量
            int totalProcessed = 0;  // 总处理数量
            for (int pageNum = 1; pageNum <= totalPages; pageNum++) {
                PageHelper.startPage(pageNum, BATCH_SIZE);
                List<Student> pageData = studentMapper.querySourceDataStudent();
                if (pageData != null && pageData.size() > 0) {
                    //处理这批次数据
                    int[] result = processBatchData(pageData);
                    processedCount += result[0];  // 成功数
                    failedCount += result[1];     // 失败数
                    totalProcessed += pageData.size();
                    //虽然那个数据最终没有插入成功，但是也是经过处理了，也要算处理数量统计进去
                    log.info("第 {} 页处理完成 - 成功: {} 条, 失败: {} 条, 总处理: {}/{} 条",pageNum, result[0], result[1], totalProcessed, totalCount);
                }
            }
            log.info("数据迁移完成 - 总成功: {} 条, 总失败: {} 条, 总数据量: {} 条, 耗时: {} 毫秒", processedCount, failedCount, totalCount,(System.currentTimeMillis() - startTime) );
        } catch (Exception e) {
            e.printStackTrace();
            log.error("数据迁移失败", e);
            throw new RuntimeException("数据迁移失败", e);
        }


    }

    @Transactional(rollbackFor = Exception.class)
    public int[] processBatchData(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return new int[]{0,0};
        }
        int successCount = 0;
        int failedCount = 0;
        //尝试批量插入这条数据
        try {
            studentMapper.batchInsertStudents(students);
            successCount = students.size();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("批量插入失败，开始逐条处理");
            for (Student student : students) {
                try {
                    int i = studentMapper.batchInsertStudents(Collections.singletonList(student));
                    successCount++;
                    log.info("逐条插入数据成功" + student.getName());
                } catch (Exception e1) {
                    failedCount++;
                    e1.printStackTrace();
                    log.error("数据插入失败, name: {}", student.getName());
                }
            }

        }
        return new int[]{successCount, failedCount};

    }

}
