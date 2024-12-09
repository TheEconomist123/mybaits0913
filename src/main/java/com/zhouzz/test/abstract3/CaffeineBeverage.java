package com.zhouzz.test.abstract3;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 16:28
 * @desc
 */
public abstract class CaffeineBeverage {

    //模板类方法定义准备饮料的步骤

    final void prepareRecipe() {

        //烧水
        boildWater();
        //冲咖啡还是茶
        brew();
        //倒入杯子
        pourInCup();

        if (customerWantsCondiments()) {
            addCondiments();
        }

    }

    //抽象方法，子类必须实现
    abstract void addCondiments();

    abstract void brew();

    void pourInCup() {
        System.out.println("倒入杯子..");
    }

    void boildWater() {
        System.out.println("烧水..");
    }

    //钩子方法，子类可以选择实现或者不实现

    boolean customerWantsCondiments() {
        return true;
    }

}
