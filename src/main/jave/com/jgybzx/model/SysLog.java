package com.jgybzx.model;

import java.util.Date;

public class SysLog {
    private Integer logId;

    private String userName;

    private String operation;

    private String method;

    private String params;

    private String ip;

    private Integer isdel;

    private Date createTime;

    public SysLog(Integer logId, String userName, String operation, String method, String params, String ip, Integer isdel, Date createTime) {
        this.logId = logId;
        this.userName = userName;
        this.operation = operation;
        this.method = method;
        this.params = params;
        this.ip = ip;
        this.isdel = isdel;
        this.createTime = createTime;
    }

    public SysLog() {
        super();
    }

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}