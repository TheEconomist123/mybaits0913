package com.zhouzz.test.word;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * author: zhouzz
 * date: 2024年12月20日11:37:22
 * @desc 基于FreeMarker的Word文档生成器 这种需求应该不会很多
 */

public class WordTemplateTest {

    public static void main(String[] args) {
        try {
            // 创建FreeMarker配置
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_31);
            cfg.setDirectoryForTemplateLoading(new File("src/main/resources/templates"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

            // 获取模板
            Template template = cfg.getTemplate("test_template.ftl");

            // 准备数据
            Map<String, Object> data = new HashMap<>();
            data.put("name", "张三");
            data.put("age", 25);
            data.put("date", LocalDate.now().toString());
            data.put("hobbies", Arrays.asList("读书", "游泳", "编程"));

            // 生成文档
            File outputFile = new File("test_output.doc");
            try (FileOutputStream fos = new FileOutputStream(outputFile);
                 OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
                template.process(data, writer);
            }

            System.out.println("Word文档已生成：" + outputFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
