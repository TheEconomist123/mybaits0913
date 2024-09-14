package com.zhouzz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhouzz.mapper")
public class Mybatis0901Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis0901Application.class, args);
    }

}
