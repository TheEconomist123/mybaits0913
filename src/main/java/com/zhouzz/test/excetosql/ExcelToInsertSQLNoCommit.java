package com.zhouzz.test.excetosql;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class ExcelToInsertSQLNoCommit {

    public static void generateInsertScript(String excelFilePath, String tableName, String sequenceName, String outputFilePath) throws Exception {
        // 读取Excel文件
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        // 获取表头
        Row headerRow = sheet.getRow(0);
        int columnCount = headerRow.getPhysicalNumberOfCells();
        List<String> columns = new ArrayList<>();
        for (int i = 0; i < columnCount; i++) {
            Cell cell = headerRow.getCell(i);
            columns.add(cell.getStringCellValue().trim());
        }

        // 写入SQL文件
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

        // 遍历每一行数据，生成对应的INSERT语句
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");

            // 拼接列名
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

            // 写入当前行SQL
            writer.write(sql.toString());
        }

        // 关闭文件流
        writer.close();
        fis.close();

        System.out.println("SQL script with individual inserts generated successfully.");
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "NULL";  // 如果单元格为空，返回NULL

        switch (cell.getCellType()) {
            case STRING:
                return "'" + cell.getStringCellValue().replace("'", "''") + "'";
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case BLANK:
                return "NULL";
            default:
                return "NULL";
        }
    }

    public static void main(String[] args) {
        //耗时
        Long start = System.currentTimeMillis();
        // 输入Excel文件路径，输出SQL文件路径
        String excelFilePath = "D:\\emp.xlsx";
        String tableName = "empbak";  // 填写目标Oracle表名
        String sequenceName = "empbak_seq";  // 填写你的Oracle序列名
        String outputFilePath = "output_insert_script.sql";
        try {
            // 调用生成方法，指定文件路径、表名、序列名、输出路径
            generateInsertScript(excelFilePath, tableName, sequenceName, outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();

        }
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }
}
