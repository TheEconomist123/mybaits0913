package com.zhouzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@MapperScan("com.zhouzz.mapper")
@EnableAsync // 启用异步任务支持
public class Mybatis0901Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis0901Application.class, args);
    }



}
