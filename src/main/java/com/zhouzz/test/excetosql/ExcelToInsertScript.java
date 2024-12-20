package com.zhouzz.test.excetosql;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

/**
 * @author zhouzz
 * @date 2024年12月20日14:57:43
 * @description 读取Excel并生成INSERT语句
 */

public class ExcelToInsertScript {

    // 读取Excel并生成INSERT语句
    public static void generateInsertScript(String excelFilePath, String tableName, String outputFilePath) throws Exception {
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

            // 生成值部分
            List<String> values = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
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

    public static void main(String[] args) {
        try {
            // 输入Excel文件路径，输出SQL文件路径
            String excelFilePath = "D:\\emp.xlsx";
            String tableName = "empbak";  // 填写目标Oracle表名
            String outputFilePath = "output_insert_script.sql";

            // 生成INSERT语句脚本
            generateInsertScript(excelFilePath, tableName, outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
