package com.zhouzz.test;

import java.math.BigDecimal;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-12-18 17:23
 * @desc
 */
public class Statis {
    private String type;        // 类型
    private int count;          // 数量
    private BigDecimal amt;         // 金额
    private String updateTime;  // 更新时间，格式为yyyyMMddHHmmss

    public Statis() {
    }

    public Statis(String type, int count, BigDecimal amt, String updateTime) {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
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
        return "Statis{" +
                "type='" + type + '\'' +
                ", count=" + count +
                ", amt=" + amt +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
