package com.zhouzz.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-01 11:44
 * @desc
 */
public class ClientEmp {

    public static void main(String[] args) {

        //泛型不起作用
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer i = map.get(3);
        System.out.println(i);


    }

}
