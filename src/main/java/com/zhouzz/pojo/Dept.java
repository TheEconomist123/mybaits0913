package com.zhouzz.pojo;

import java.util.List;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-09-05 21:27
 * @desc
 */
public class Dept {
    private int deptno;
    private String dname;
    private String loc;
    private List<EmpTest> emps;

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

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

    public List<EmpTest> getEmps() {
        return emps;
    }

    public void setEmps(List<EmpTest> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
