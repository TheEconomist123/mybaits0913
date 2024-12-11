package com.zhouzz.test;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouzz
 * @date 2024年12月11日13:59:52
 * @description 生成CURD代码  通过读取配置文件生成代码，执行main方法即可
 */
public class GenerateCURD {

    public static void main(String[] args) {


        try {
            // 指定generatorConfig.xml的路径
            File configFile = new File("src/main/resources/generatorConfig.xml");

            // 解析配置文件
            List<String> warnings = new ArrayList<>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);

            // 生成代码
            boolean overwrite = true; // 是否覆盖已存在的文件
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);

            // 输出生成的警告信息
            for (String warning : warnings) {
                System.out.println(warning);
            }
            System.out.println("CURD代码生成完成。");

        } catch (IOException | XMLParserException | InvalidConfigurationException | InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
