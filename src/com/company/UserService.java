package com.company;

import com.company.dao.UserDao;
import com.company.dao.impl.UserDaoImpl;
import com.company.model.UserLogModel;
import com.company.model.UserModel;

import java.util.Scanner;

public class UserService {
    private final UserDao userDao = new UserDaoImpl();

    public void register(UserModel userModel) throws Exception {
        if (userModel.getLogin() == null || userModel.getLogin().isEmpty()) {
            throw new IllegalArgumentException("Неверные параметры");
        }

        UserModel userDb = userDao.getByUsername(userModel.getLogin());
        if (userDb != null) {
            throw new Exception("Такой логин уже есть");
        }

        userModel = userDao.createUser(userModel);

        if (userModel.getId() != null) {
            System.out.println("Вы зарегистрированы!");
        } else System.out.println("Error!");
    }

    public void authorize() throws IllegalArgumentException {
        System.out.println("Введите логин:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите пароль:");
        String password = new Scanner(System.in).nextLine();
        boolean result;
        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Invalid password");
        }

        UserModel userDb = userDao.getByUsername(login);
        if (userDb != null) {
            UserLogModel userLog = new UserLogModel();
            userLog.setUserId(userDb.getId());
            result = userDb.getPassword().equals(password);
            userLog.setSuccess(result);

            if (userDao.getCountFalseLog(userDb.getId()) < 3 && result) {
                userDao.deleteFalseLog(userDb.getId());
            }
            if(userDao.getCountFalseLog(userDb.getId()) == 3) {
                System.out.println("Вы заблокированны!");
            } else {
                userDao.writeLog(userLog);
                if (result) {
                    System.out.println("Вы авторизованы!");
                } else System.out.println("Не верные данные!");
            }
        } else System.out.println("Пользователь не найден!");
    }

    public void unBlock() throws IllegalArgumentException {
        System.out.println("Введите логин:");
        String login = new Scanner(System.in).nextLine();
        System.out.println("Введите почту:");
        String email = new Scanner(System.in).nextLine();

        if (login == null || login.isEmpty()) {
            throw new IllegalArgumentException("Invalid login");
        }

        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Invalid email");
        }

        UserModel userDb = userDao.getByUsername(login);

        if (userDb != null) {
            if (userDb.getEmail().equals(email)) {
                userDao.deleteFalseLog(userDb.getId());
                System.out.println("Вы разблокированны!");
            }
        } else System.out.println("Пользователь не найден!");
    }
}
