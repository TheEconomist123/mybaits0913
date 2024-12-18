package com.zhouzz.test.interface3;

public class Test {
    public static void main(String[] args) {


        Student[] students = new Student[10];
        Student stu0 = new Student("Alice", "男", 90);
        Student stu1 = new Student("Bob", "女", 80);
        Student stu2 = new Student("Charlie", "男", 95);
        Student stu3 = new Student("David", "女", 85);
        Student stu4 = new Student("Eve", "女", 80);
        Student stu5 = new Student("Frank", "男", 90);
        Student stu6 = new Student("Grace", "女", 85);
        Student stu7 = new Student("Henry", "男", 95);
        Student stu8 = new Student("Isabella", "女", 80);
        Student stu9 = new Student("Jack", "男", 90);
        students[0] = stu0;
        students[1] = stu1;
        students[2] = stu2;
        students[3] = stu3;
        students[4] = stu4;
        students[5] = stu5;
        students[6] = stu6;
        students[7] = stu7;
        students[8] = stu8;
        students[9] = stu9;
        //提供接口的实现类
        // 第一套实现类:打印所有学生信息,以及平均成绩
        // 第二套实现类:打印所有学生信息（男生、女生）,以及平均成绩（去掉最低分和最高分）
        ClassDataInter a = new ClassDataAImpl(students);
        ClassDataInter b = new ClassDataBImpl(students);

        a.printAllStudents();
        System.out.println("--------------------------------------------");
        a.printAverageScore();
        System.out.println("--------------------------------------------");
        b.printAllStudents();
        System.out.println("--------------------------------------------");
        b.printAverageScore();
        System.out.println("--------------------------------------------");
        System.out.println("0.0d / 0.0 = " + 0.0d / 0.0);


    }
}
