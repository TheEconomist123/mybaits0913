package com.zhouzz.test.excetosql;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * @author zhouzz
 * @date 2024年12月20日14:58:43
 * @description 读取Excel并生成INSERT语句 带有序列生成主键ID。
 */

public class ExcelToInsertScriptWithSequence {

    // 读取Excel并生成INSERT语句，主键ID通过序列生成
    public static void generateInsertScriptWithSequence(String excelFilePath, String tableName, String sequenceName, String outputFilePath) throws Exception {
        // 打开Excel文件
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // 获取列名（假设第一行是列名）
        Row headerRow = sheet.getRow(0);
        int columnCount = headerRow.getPhysicalNumberOfCells();
        List<String> columns = new ArrayList<>();
        for (int i = 0; i < columnCount; i++) {
            Cell cell = headerRow.getCell(i);
            columns.add(cell.getStringCellValue().trim());
        }

        // 打开输出文件
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        // 遍历每一行数据并生成INSERT语句
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");

            // 生成列名部分
            sql.append(String.join(", ", columns));
            sql.append(") VALUES (");

            // 生成主键ID部分，使用序列生成主键
            sql.append(sequenceName + ".nextval, ");  // 这里使用 Oracle 序列生成 ID

            // 生成值部分
            List<String> values = new ArrayList<>();
            for (int j = 1; j < columnCount; j++) {  // 从第二列开始，跳过主键ID
                Cell cell = row.getCell(j);
                String cellValue = getCellValue(cell);
                values.add(cellValue);
            }

            sql.append(String.join(", ", values));
            sql.append(");");

            // 写入到文件
            writer.write(sql.toString());
            writer.newLine();
        }

        // 关闭资源
        writer.close();
        fis.close();

        System.out.println("SQL script generated successfully.");
    }

    // 获取单元格的值，处理不同类型的单元格
    private static String getCellValue(Cell cell) {
        if (cell == null) {
            return "NULL";
        }
        switch (cell.getCellType()) {
            case STRING:
                return "'" + cell.getStringCellValue().replace("'", "''") + "'";
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return "'" + cell.getDateCellValue() + "'";
                } else {
                    return String.valueOf(cell.getNumericCellValue());
                }
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "NULL";
        }
    }

    public static void generateInsertScriptWithBatch(String excelFilePath, String tableName, String sequenceName, String outputFilePath, int batchSize) throws Exception {
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        Row headerRow = sheet.getRow(0);
        int columnCount = headerRow.getPhysicalNumberOfCells();
        List<String> columns = new ArrayList<>();
        for (int i = 0; i < columnCount; i++) {
            Cell cell = headerRow.getCell(i);
            columns.add(cell.getStringCellValue().trim());
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        // 生成批量插入的SQL
        writer.write("INSERT ALL\n");

        int count = 0;
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            StringBuilder sql = new StringBuilder("    INTO " + tableName + " (");

            sql.append(String.join(", ", columns));
            sql.append(") VALUES (");

            // 添加主键ID（通过序列生成）
            sql.append(sequenceName + ".nextval, ");

            // 获取列数据
            List<String> values = new ArrayList<>();
            for (int j = 1; j < columnCount; j++) {  // 跳过主键ID列
                Cell cell = row.getCell(j);
                String cellValue = getCellValue(cell);
                values.add(cellValue);
            }

            sql.append(String.join(", ", values));
            sql.append(");\n");

            writer.write(sql.toString());
            count++;

            // 如果达到了批量大小，生成一个COMMIT并重置批次
            if (count >= batchSize) {
                writer.write("COMMIT;\n");
                count = 0;
                writer.write("INSERT ALL\n");
            }
        }

        // 如果有剩余的未提交的批次，写入COMMIT
        if (count > 0) {
            writer.write("COMMIT;\n");
        }

        writer.close();
        fis.close();

        System.out.println("SQL script with batch inserts generated successfully.");
    }


    public static void main(String[] args) {
        try {
            // 输入Excel文件路径，输出SQL文件路径
            String excelFilePath = "D:\\emp.xlsx";
            String tableName = "empbak";  // 填写目标Oracle表名
            String sequenceName = "empbak_seq";  // 填写你的Oracle序列名
            String outputFilePath = "output_insert_script.sql";

            // 生成INSERT语句脚本，主键ID通过序列生成
           generateInsertScriptWithSequence(excelFilePath, tableName, sequenceName,outputFilePath );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
