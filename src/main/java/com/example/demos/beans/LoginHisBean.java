package com.example.demos.beans;

import java.util.Date;

public class LoginHisBean {
    private String id;
    private String userId;
    private String ip;
    private String addr;
    private String browName;
    private String browVer;
    private String accountType;
    private String clientType;
    private String osName;
    private String osVer;
    private String flag;
    private Date createTime;
    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public String getBrowName() {
        return browName;
    }
    public void setBrowName(String browName) {
        this.browName = browName;
    }
    public String getBrowVer() {
        return browVer;
    }
    public void setBrowVer(String browVer) {
        this.browVer = browVer;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getClientType() {
        return clientType;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }
    public String getOsName() {
        return osName;
    }
    public void setOsName(String osName) {
        this.osName = osName;
    }
    public String getOsVer() {
        return osVer;
    }
    public void setOsVer(String osVer) {
        this.osVer = osVer;
    }
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }



    public LoginHisBean(String userId, String ip, String addr, String browName, String browVer, String accountType, String clientType, String osName, String osVer, String flag, Date createTime, Date updateTime) {
        this.userId = userId;
        this.ip = ip;
        this.addr = addr;
        this.browName = browName;
        this.browVer = browVer;
        this.accountType = accountType;
        this.clientType = clientType;
        this.osName = osName;
        this.osVer = osVer;
        this.flag = flag;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
    public  LoginHisBean(){
        super();
    }
    public LoginHisBean(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "LoginHisBean{" +
                "userId='" + userId + '\'' +
                ", ip='" + ip + '\'' +
                ", addr='" + addr + '\'' +
                ", browName='" + browName + '\'' +
                ", browVer='" + browVer + '\'' +
                ", accountType='" + accountType + '\'' +
                ", clientType='" + clientType + '\'' +
                ", osName='" + osName + '\'' +
                ", osVer='" + osVer + '\'' +
                ", flag='" + flag + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
