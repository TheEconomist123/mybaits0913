package com.zhouzz.test.abstract2;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-09 15:35
 * @desc 模版方法设计模式
 */
public abstract class People {

    //模版方法 加上final 防止子类重写。
    public final void write() {
        System.out.println("\t <<我的爸爸>>");
        //写正文
        writeMain();
        System.out.println("作文写结束了..........");
    }

    public abstract void writeMain();
}
