package com.zhouzz.test.abstract3;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 16:25
 * @desc 写一个升级版本的 抽象了实现的模板方法模式
 */
public class Test {
    public static void main(String[] args) {

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("------------------------------");

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();


    }
}
