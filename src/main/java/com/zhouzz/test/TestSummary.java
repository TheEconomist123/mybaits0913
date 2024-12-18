package com.zhouzz.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-18 17:22
 * @desc
 */
public class TestSummary {

    public static void main(String[] args) {
        List<Statis> statisList = Arrays.asList(
                new Statis("A", 20, new BigDecimal("100.00"), "20211218172503"),
                new Statis("B", 15, new BigDecimal("80.00"), "20211218172504"),
                new Statis("A", 30, new BigDecimal("120.00"), "20211218172505"),
                new Statis("B", 25, new BigDecimal("110.00"), "20211218172506")

        );
        //获取最时间
        String maxTime = statisList.stream().map(Statis::getUpdateTime).max(String::compareTo).get();


        List<Statis> summaryList = new ArrayList<>();
        statisList.stream().collect(Collectors.groupingBy(Statis::getType))
                .forEach((type, list) -> {
                    Statis summary = new Statis();
                    summary.setType(type);
                    summary.setCount(list.stream().mapToInt(Statis::getCount).sum());
                    summary.setAmt(list.stream().map(Statis::getAmt).reduce(BigDecimal.ZERO, BigDecimal::add));
                    summaryList.add(summary);
                });

        System.out.println(summaryList.size());
        for (Statis statis : summaryList) {
            statis.setUpdateTime(maxTime);
        }

        for (Statis statis : summaryList) {
            System.out.println("statis = " + statis);
        }

    }

}
