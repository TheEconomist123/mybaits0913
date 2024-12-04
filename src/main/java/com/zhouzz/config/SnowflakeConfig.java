package com.zhouzz.config;

import com.zhouzz.util.SnowflakeIdGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnowflakeConfig {

    @Value("${snowflake.machine-id}")
    private long machineId;

    @Value("${snowflake.data-center-id}")
    private long dataCenterId;

    @Bean
    public SnowflakeIdGenerator snowflakeIdGenerator() {
        return new SnowflakeIdGenerator(machineId, dataCenterId);
    }
}
