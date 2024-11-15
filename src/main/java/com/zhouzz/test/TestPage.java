package com.zhouzz.test;

import com.zhouzz.pojo.Emp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-12 9:33
 * @desc  根据list集合，根据传递条件模糊查找,然后根据分页信息，返回分页数据
 */
public class TestPage {

    public static void main(String[] args) {


        List<Emp> emps = List.of(
                new Emp(1, "狗蛋"),
                new Emp(2, "小明"),
                new Emp(3, "小红"),
                new Emp(4, "李三"),
                new Emp(5, "张三"),
                new Emp(10, "张三"),
                new Emp(16, "张三"),
                new Emp(64, "张三"),
                new Emp(63, "张三"),
                new Emp(65, "张三"),
                new Emp(66, "张三"),
                new Emp(67, "张三"),
                new Emp(68, "张三"),
                new Emp(69, "张三"),
                new Emp(70, "张三")
        );

        //模糊查找
        String name = "";
        int pageNum = 1;
        int pageSize = 5;
        List<Emp> empList = emps.stream().filter(emp -> emp.getEname().contains("")).toList();
        System.out.println(empList);
         //计算总记录数，跟总页数
        int totalRecords = empList.size();
        int totalPages = (int) Math.ceil((double) totalRecords / pageSize);
        System.out.println("总记录数：" + totalRecords);
        System.out.println("总页数：" + totalPages);
        //根据pageSize和pageNum提取当前页数据
        int fromIndex = (pageNum - 1) * pageSize;
        int toIndex = Math.min(fromIndex + pageSize, totalRecords);
        List<Emp> paginatedList = new ArrayList<>();
        if (fromIndex < totalRecords) {
            paginatedList = empList.subList(fromIndex, toIndex);
        }

        System.out.println("paginatedList = " + paginatedList);


        System.out.println("ssafasfs".contains(""));

    }
}
