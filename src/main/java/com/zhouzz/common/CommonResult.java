package com.zhouzz.common;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-10-13 17:05
 * @desc
 */
public class CommonResult {
    private String code;
    private String msg;
    private Object data;

    public CommonResult() {
    }

    public CommonResult(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
