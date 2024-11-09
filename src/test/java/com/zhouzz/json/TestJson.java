package com.zhouzz.json;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.zhouzz.BaseTest;
import com.zhouzz.pojo.Student;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-08 15:12
 * @desc
 */
public class TestJson extends BaseTest {


    @Test
    public void testJson() {

        Student student = new Student();
        student.setName("张三");
        student.setAge("20");
        student.setBirthday(new Date());

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("retCode", "000000");
        jsonObject.put("retMsg", "查询数据成功!");
        jsonObject.put("retData", null);

        JSONObject retData = jsonObject.getJSONObject("retData");
        System.out.println("retData.name" + retData.get("name"));


    }
}
