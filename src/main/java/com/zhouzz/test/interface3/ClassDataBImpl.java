package com.zhouzz.test.interface3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassDataBImpl implements ClassDataInter {

    private Student[] student;

    public ClassDataBImpl(Student[] student) {
        this.student = student;
    }

    @Override
    public void printAllStudents() {
        //分别打印男生和女生的信息，分开打印
        for (Student s : student) {
            if (s.getSex().equals("男")) {
                System.out.println("Male student: " + s.getName() + " " + s.getScore());
            } else if (s.getSex().equals("女")) {
                System.out.println("Female student: " + s.getName() + " " + s.getScore());
            }
        }
        //统计男生跟女生的人数
        int countMale = 0;
        int countFemale = 0;
        for (Student s : student) {
            if (s.getSex().equals("男")) {
                countMale++;
            } else if (s.getSex().equals("女")) {
                countFemale++;
            }
        }
        System.out.println("Male student count: " + countMale);
        System.out.println("Female student count: " + countFemale);


    }

    @Override
    public void printAverageScore() {
        //去掉学生中的最高分和最低分，然后在计算所有徐学生的平均分
        List<Student> list = Arrays.asList(student);

        //使用流来区分最高分跟最低分
        double maxScore = list.stream().mapToDouble(Student::getScore).max().orElse(Double.NaN);
        double minScore = list.stream().mapToDouble(Student::getScore).min().orElse(Double.NaN);

        //过滤掉最高分跟最低分
        List<Double> validScores = list.stream().map(Student::getScore).filter(score -> score != maxScore && score != minScore).collect(Collectors.toList());

        //计算平均分
        double averageScore = validScores.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        System.out.println("Average score: " + averageScore);

    }
}
