package com.zhouzz.test.summary;

import java.math.BigDecimal;

public class Student {

    private String type;
    private Integer count;
    private BigDecimal amt;
    private String updateTime; // 格式：yyyyMMddHHmmss


    public Student() {
    }

    public Student(String type, Integer count, BigDecimal amt, String updateTime) {
        this.type = type;
        this.count = count;
        this.amt = amt;
        this.updateTime = updateTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "type='" + type + '\'' +
                ", count=" + count +
                ", amt=" + amt +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
