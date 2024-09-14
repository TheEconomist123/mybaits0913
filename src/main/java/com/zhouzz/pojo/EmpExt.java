package com.zhouzz.pojo;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-02 22:33
 * @desc
 */
public class EmpExt extends EmpTest {

    private String dname;
    private String loc;


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                "} " + super.toString();
    }
}
