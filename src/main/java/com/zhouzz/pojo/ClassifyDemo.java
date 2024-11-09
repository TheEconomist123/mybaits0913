package com.zhouzz.pojo;

import java.io.Serializable;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-25 15:12
 * @desc
 */
public class ClassifyDemo implements Serializable {
    private String  dataClass;
    private String   totalAmt;
    private String   totalCount;
    private String desc ;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ClassifyDemo() {
    }

    public ClassifyDemo(String dataClass, String totalAmt, String totalCount) {
        this.dataClass = dataClass;
        this.totalAmt = totalAmt;
        this.totalCount = totalCount;
    }

    public String getDataClass() {
        return dataClass;
    }

    public void setDataClass(String dataClass) {
        this.dataClass = dataClass;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "ClassifyDemo{" +
                "dataClass='" + dataClass + '\'' +
                ", totalAmt='" + totalAmt + '\'' +
                ", totalCount='" + totalCount + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
