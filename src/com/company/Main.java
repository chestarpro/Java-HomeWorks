package com.company;
import com.company.model.UserModel;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        UserModel userModel = new UserModel();
        userModel.setPassword("123");
        userModel.setLogin("login1");
        userModel.setEmail("login1@mail.ru");

        try {
            userService.register(userModel);
        }catch (Exception e) {
            System.out.println(e);
        }

        try {
            userService.authorize();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

//        try {
//            userService.unBlock();
//        } catch (IllegalArgumentException e) {
//            System.out.println(e);
//        }
    }
}
