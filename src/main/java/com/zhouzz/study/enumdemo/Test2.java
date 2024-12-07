package com.zhouzz.study.enumdemo;

public class Test2 {


    public static void main(String[] args) {


        //这是一种常量的定义方式
        //getDirection(Constant.DOWN);
        //通过枚举调用
        getDirection(Direction.UP);


    }
    //创建枚举判断方向方法

    public static void getDirection(Direction direction) {
        switch (direction) {
            case UP:
                System.out.println("向上");
                break;
            case DOWN:
                System.out.println("向下");
                break;
            case LEFT:
                System.out.println("向左");
                break;
            case RIGHT:
                System.out.println("向右");
                break;
            default:
                System.out.println("未知方向");
                break;
        }
    }


    public static void getDirection(int direction) {
        switch (direction) {
            case 0:
                System.out.println("向上");
                break;
            case 1:
                System.out.println("向下");
                break;
            case 2:
                System.out.println("向左");
                break;
            case 3:
                System.out.println("向右");
                break;
            default:
                System.out.println("未知方向");
                break;
        }
    }
}
