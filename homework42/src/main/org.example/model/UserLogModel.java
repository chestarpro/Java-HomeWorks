package org.example.model;

import java.sql.Timestamp;

public class UserLogModel {
    private Integer id;
    private Boolean isSuccess;
    private Integer userId;
    private Timestamp timeLog;

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

    public Timestamp getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(Timestamp timeLog) {
        this.timeLog = timeLog;
    }

    @Override
    public String toString() {
        return String.format("id: %s, isSuccess: %s, user id: %s, time log: %s", this.id, this.isSuccess, this.userId, this.timeLog);
    }
}
