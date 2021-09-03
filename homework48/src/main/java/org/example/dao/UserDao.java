package org.example.dao;

import org.example.model.UserModel;

public interface UserDao {
    UserModel getByName(String name);
}
