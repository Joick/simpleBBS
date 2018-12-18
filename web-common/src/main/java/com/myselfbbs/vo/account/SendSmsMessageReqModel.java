package com.myselfbbs.vo.account;

/**
 * 请求发送验证码数据模型
 */
public class SendSmsMessageReqModel {
    private String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
