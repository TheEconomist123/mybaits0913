package com.zhouzz.test;

import java.io.*;
import java.util.*;

/**
 * @author zhouzz
 * @version 1.0
 * @date 2024年12月9日15:08:49
 */

public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "E:\\data.txt";  // 文件路径
        List<DataEntity> dataEntities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // 使用空格分割每行数据
                String[] fields = line.split("\\s+");  // \\s+ 表示匹配一个或多个空格

                if (fields.length == 5) {  // 确保每行有5个字段
                    DataEntity entity = new DataEntity();
                    entity.setField1(fields[0]);  // 第一个字段为 String
                    entity.setField2(fields[1]);  // 第二个字段为 Long
                    entity.setField3(fields[2]);  // 第三个字段为 Double
                    entity.setField4(fields[3]);  // 第四个字段为 Long
                    entity.setField5(fields[4]);  // 第五个字段为 Long
                    dataEntities.add(entity);  // 将实体对象添加到列表中
                } else {
                    System.out.println("Skipping invalid line: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 打印所有读取到的实体对象
        for (DataEntity entity : dataEntities) {
            System.out.println("cc:"+entity);
        }
    }
}
