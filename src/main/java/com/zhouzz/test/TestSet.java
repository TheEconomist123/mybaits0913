package com.zhouzz.test;

import com.zhouzz.pojo.ClassifyDemo;
import com.zhouzz.pojo.Dept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-09 15:29
 * @desc
 */
public class TestSet {
    public static void main(String[] args) {

        List<ClassifyDemo> arrayList = new ArrayList<>();

        ClassifyDemo cd1 = new ClassifyDemo("1", "张三", "20");
        ClassifyDemo cd2 = new ClassifyDemo("2", "王五", "30");
        ClassifyDemo cd3 = new ClassifyDemo("3", "王五2", "30");

        arrayList.add(cd1);
        arrayList.add(cd2);
        arrayList.add(cd3);

        for (ClassifyDemo classifyDemo : arrayList) {
            if (classifyDemo.getTotalAmt().equals("王五")) {
                classifyDemo.setDesc("你是王五吧");
            }

        }
        System.out.println(arrayList);


    }
}
