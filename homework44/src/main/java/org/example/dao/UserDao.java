package org.example.dao;

import org.example.model.UserModel;

public interface UserDao {
    UserModel createUser(UserModel userModel);
    UserModel getByUsername(String username);
    UserModel getByUserEmail(String userEmail);
}
