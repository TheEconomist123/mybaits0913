package com.zhouzz.test.abstract3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 16:41
 * @desc
 */
public class Tea extends CaffeineBeverage {


    @Override
    void addCondiments() {
        //加柠檬
        System.out.println("Adding Lemon");
    }

    @Override
    void brew() {
        //烘焙茶叶
        System.out.println("Steeping the tea");
    }

    @Override
    boolean customerWantsCondiments() {
        //覆盖钩子函数 提供自定义逻辑
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        //获取用户输入
        try {
            System.out.println("would you like lemon with your tea? (y/n)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "n";
        }

    }

}
