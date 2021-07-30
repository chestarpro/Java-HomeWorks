package com.company.model;

import java.sql.Timestamp;

public class UserLogModel {
    private Integer id;
    private Boolean isSuccess;
    private Integer userId;
    private Timestamp timLog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Timestamp getTimLog() {
        return timLog;
    }

    public void setTimLog(Timestamp timLog) {
        this.timLog = timLog;
    }
}
