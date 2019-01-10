package com.myselfbbs.vo;

public class ServiceResponse<T> {
    private String code;
    private String msg;
    private T data;

    public ServiceResponse() {
    }

    public void success(){
        this.setCode("000");
        this.setMsg("处理成功");
    }

    public void success(T data) {
        this.setCode("000");
        this.setMsg("处理成功");
        this.setData(data);
    }

    public void fail(String message) {
        this.setCode("500");
        this.setMsg(message);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
