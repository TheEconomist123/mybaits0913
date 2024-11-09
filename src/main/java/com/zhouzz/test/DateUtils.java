package com.zhouzz.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
 * 日期工具类
 * 功能：
 * 1. 获取指定日期所在月份的月初和月末日期
 * 2. 输入日期格式为 yyyyMMdd
 * 3. 返回结果格式为 Integer
 * 4. 示例：
 *    输入：20240215
 *    输出：
 *      Month Start: 20240201
 *      Month End: 20240229
 * 注意：
 * 1. 输入日期必须为合法日期，否则会抛出 IllegalArgumentException 异常
 * 2. 月末日期为当月最后一天，即 20240229
 * 3. 月初日期为当月第一天，即 20240201
 * 4. 月末日期的计算方法为：当月最后一天的日期减 1 天，即 20240229 - 1 = 20240228
 * 5. 月初日期的计算方法为：当月第一天的日期减 1 天，即 20240201 - 1 = 20240131
 * 6. 示例中使用的 LocalDate 类来解析和格式化日期，该类提供了丰富的 API 来操作日期
 * 7. 示例中使用的 DateTimeFormatter 类来指定日期格式，该类提供了丰富的 API 来指定日期格式
 * 8. 示例中使用的 List 类来存储结果，该类提供了丰富的 API 来操作列表
 * @author zhouzz
 * @date 2024年10月31日10:12:14
 * @version 1.0.0
 */
public class DateUtils {

    public static List<Integer> getMonthStartAndEnd(Integer date) {
        // 将输入的 Integer 转换为字符串，并解析为 LocalDate
        String dateString = String.valueOf(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.parse(dateString, formatter);

        // 获取月初和月末日期
        LocalDate firstDayOfMonth = localDate.withDayOfMonth(1);
        LocalDate lastDayOfMonth = localDate.withDayOfMonth(localDate.lengthOfMonth());

        // 将结果转换为 Integer 格式
        List<Integer> result = new ArrayList<>();
        result.add(Integer.parseInt(firstDayOfMonth.format(formatter)));
        result.add(Integer.parseInt(lastDayOfMonth.format(formatter)));

        return result;
    }

    public static void main(String[] args) {
        Integer date = 20240215; // 示例日期
        List<Integer> monthRange = getMonthStartAndEnd(date);
        System.out.println("Month Start: " + monthRange.get(0));
        System.out.println("Month End: " + monthRange.get(1));
    }
}
