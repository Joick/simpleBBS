package com.myselfbbs.po;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Long id;

    private String account;

    private String nickName;

    private String phone;

    private String idCard;

    private String password;

    private String payPassword;

    private String headImage;

    private Integer gender;

    private String region;

    private String signature;

    private Date registerTime;

    private String registerIp;

    private Integer registerChannel;

    private String grade;

    private Integer fans;

    private BigDecimal effectivePercent;

    private Date createTime;

    private BigDecimal averageIncome;

    private Boolean push;

    public User(Long id, String account, String nickName, String phone, String idCard, String password, String payPassword, String headImage, Integer gender, String region, String signature, Date registerTime, String registerIp, Integer registerChannel, String grade, Integer fans, BigDecimal effectivePercent, Date createTime, BigDecimal averageIncome, Boolean push) {
        this.id = id;
        this.account = account;
        this.nickName = nickName;
        this.phone = phone;
        this.idCard = idCard;
        this.password = password;
        this.payPassword = payPassword;
        this.headImage = headImage;
        this.gender = gender;
        this.region = region;
        this.signature = signature;
        this.registerTime = registerTime;
        this.registerIp = registerIp;
        this.registerChannel = registerChannel;
        this.grade = grade;
        this.fans = fans;
        this.effectivePercent = effectivePercent;
        this.createTime = createTime;
        this.averageIncome = averageIncome;
        this.push = push;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage == null ? null : headImage.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Integer getRegisterChannel() {
        return registerChannel;
    }

    public void setRegisterChannel(Integer registerChannel) {
        this.registerChannel = registerChannel;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public BigDecimal getEffectivePercent() {
        return effectivePercent;
    }

    public void setEffectivePercent(BigDecimal effectivePercent) {
        this.effectivePercent = effectivePercent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAverageIncome() {
        return averageIncome;
    }

    public void setAverageIncome(BigDecimal averageIncome) {
        this.averageIncome = averageIncome;
    }

    public Boolean getPush() {
        return push;
    }

    public void setPush(Boolean push) {
        this.push = push;
    }
}