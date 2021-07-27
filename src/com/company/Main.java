package com.company;

import com.company.dao.UserDao;
import com.company.dao.impl.UserDaoImpl;
import com.company.model.UserModel;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserModel userModel = new UserModel();
        userModel.setPassword("123");
        userModel.setLogin("login1");
        userModel.setEmail("login1@mail.ru");

//        try {
//            userService.register(userModel);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            userService.authorize();
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }

        try {
            userService.unBlock();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
