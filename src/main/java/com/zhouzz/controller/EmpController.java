package com.zhouzz.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhouzz.common.CommonResult;
import com.zhouzz.mapper.EmpMapper;

import com.zhouzz.mapper.EmpMapperTest;
import com.zhouzz.mapper.EmployeeDataMapper;
import com.zhouzz.mapper.StudentMapper;
import com.zhouzz.pojo.Emp;
import com.zhouzz.pojo.EmployeeData;
import com.zhouzz.pojo.RequestUserParam;
import com.zhouzz.pojo.Student;
import com.zhouzz.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 13:41
 * @desc
 */
@RestController
@RequestMapping("/emp")
@CrossOrigin(origins = "*")
public class EmpController {
    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private EmployeeDataMapper employeeDataMapper;

    @Autowired
    private AsyncService asyncService;

    @Autowired
    private EmpMapperTest empMapperTest;

    @Autowired
    private StudentMapper studentMapper;


    @RequestMapping("/list")
    public CommonResult getEmpList(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                   @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo,
                                   @RequestParam String username) {
        System.out.println("username = " + username);
        CommonResult commonResult = new CommonResult();
        commonResult.setCode("000000");
        commonResult.setMsg("success" + getCurrentTime());
        PageHelper.startPage(pageNo, pageSize);
        // 查询所有员工
        List<Emp> emps = empMapper.selectByExample(null);
        // 封装数据
        commonResult.setData(new PageInfo<Emp>(emps));
        return commonResult;

    }

    //获取当前时间精确到毫秒工具方法按照yyyy-MM-dd HH:mm:ss.SSS格式输出
    public String getCurrentTime() {

        //获取当前时间
        LocalDateTime now = LocalDateTime.now();
        //格式化输出
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }


    //获取员工data表
    @RequestMapping("/listData")
    public CommonResult getEmpListData(@RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                       @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //入参加入分页参数默认值
        //计算时间
        long start = System.currentTimeMillis();
        CommonResult commonResult = new CommonResult();
        commonResult.setCode("000000");
        commonResult.setMsg("success");
        // 查询所有员工

        System.out.println("pageSize:" + pageSize + " pageNo:" + pageNo);
        PageHelper.startPage(pageNo, pageSize);
        List<EmployeeData> emps = employeeDataMapper.selectByExample(null);
        // 封装数据
        long end = System.currentTimeMillis();
        System.out.println("查询数据耗时：" + (end - start) + "毫秒");
        commonResult.setData(new PageInfo<EmployeeData>(emps));

        return commonResult;
    }

    //写一个异步操作的接口
    @RequestMapping("/async1")
    public CommonResult testAsync(@RequestBody RequestUserParam requestUserParam, @RequestParam String username) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("requestUserParam = " + requestUserParam);

        System.out.println("请求来了....................");
        asyncService.processInBackground();
        CommonResult commonResult = new CommonResult();
        commonResult.setCode("000000");
        commonResult.setMsg("此操作是异步操做，你已经请求成功！");
        return commonResult;
    }

    //写一个根据部门所在Location获取员工的接口
    @RequestMapping("/getEmpListByCity")
    public CommonResult getEmpListByCity(@RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                                         @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNo) {
        CommonResult commonResult = new CommonResult();
        commonResult.setCode("000000");
        commonResult.setMsg("success");
        PageHelper.startPage(pageNo, pageSize);
        String[] locs = {"NEW YORK", "DALLAS"};
        List<Emp> emps = empMapperTest.selectEmpByLocs(locs);
        commonResult.setData(new PageInfo<Emp>(emps));
        return commonResult;

    }


}
