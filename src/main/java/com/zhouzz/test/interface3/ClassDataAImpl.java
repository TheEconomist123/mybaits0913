package com.zhouzz.test.interface3;

public class ClassDataAImpl implements ClassDataInter {

    private Student[] students;

    public ClassDataAImpl(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudents() {
        //显示全部学生信息
        System.out.println("显示全部学生信息：");
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }

    @Override
    public void printAverageScore() {
        //显示平均分
        System.out.println("显示全班学生平均分：");
        //计算平均分
        double sum = 0;
        for (Student student : students) {
            sum += student.getScore();
        }
        double average = sum / students.length;
        System.out.println("平均分：" + average);

    }
}
