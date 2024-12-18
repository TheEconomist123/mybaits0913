package com.zhouzz.test.summary;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author zhouzz
 * @date 2024-12-18 22:08:02
 * @description 测试汇总统计
 * 需求：
 * 1. 统计每种类型学生的总人数、总金额、最新更新时间
 * 2. 统计结果按照更新时间倒序排列
 * 3. 统计结果按照类型排序
 * 4. 统计结果按照金额从小到大排序
 * 5. 统计结果按照人数从大到小排序
 * 6. 统计结果按照类型、金额、人数排序
 * 7. 统计结果按照类型、金额、人数、更新时间排序
 */
public class TestSummary {
    public static void main(String[] args) {
        // 创建测试数据
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 10, new BigDecimal("100.50"), "20240315123000"));
        students.add(new Student("A", 20, new BigDecimal("200.50"), "20240315123100"));
        students.add(new Student("B", 15, new BigDecimal("150.75"), "20240315123200"));
        students.add(new Student("B", 25, new BigDecimal("250.75"), "20240315123300"));
        students.add(new Student("C", 25, new BigDecimal("250.75"), "20240315123360"));
        // 执行统计
        List<Student> result = aggregateByType(students);
        for (Student student : result) {
            System.out.println(student);
        }
    }

    public static List<Student> aggregateByType(List<Student> students) {
        if (students == null || students.isEmpty()) {
            return new ArrayList<>();
        }
        try {
            // 步骤1：找出最大更新时间
            String maxUpdateTime = students.stream().map(Student::getUpdateTime).max(String::compareTo).orElse("");
            // 步骤2：按type分组
            Map<String, List<Student>> groupByType = students.stream().collect(Collectors.groupingBy(Student::getType));
            // 步骤3：对每个分组进行统计汇总
            List<Student> result = new ArrayList<>();
            for (Map.Entry<String, List<Student>> entry : groupByType.entrySet()) {
                String type = entry.getKey();
                List<Student> group = entry.getValue();
                // 计算count总和
                int totalCount = group.stream().mapToInt(Student::getCount).sum();
                // 计算amt总和
                BigDecimal totalAmt = group.stream().map(Student::getAmt).reduce(BigDecimal.ZERO, BigDecimal::add);
                // 创建汇总结果
                result.add(new Student(type, totalCount, totalAmt, maxUpdateTime));
            }
            return result;
        } catch (Exception e) {
            System.err.println("聚合处理发生异常: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
