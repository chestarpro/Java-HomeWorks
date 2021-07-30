package com.company.dao;

import com.company.model.UserLogModel;
import com.company.model.UserModel;

import java.sql.Timestamp;

public interface UserDao {
    UserModel createUser(UserModel userModel);
    UserModel getByUsername(String username);
    UserModel getByEmail(String userEmail);
    void writeLog(UserLogModel userLog);
    int getCountFalseLog(int id);
    void deleteFalseLog(int id);
    Timestamp getLastFalseLogTime();
}
