package org.example.dao;

import org.example.model.UserLogModel;
import org.example.model.UserModel;

import java.util.List;

public interface UserDao {
    boolean createUser(UserModel userModel);
    UserLogModel createUserLog(UserLogModel userLogModel);
    UserModel getByUsername(String username);

    List<UserLogModel> getAllUsersLogs();
}
