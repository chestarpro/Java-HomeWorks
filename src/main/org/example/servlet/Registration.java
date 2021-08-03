package org.example.servlet;

import org.example.dao.UserDao;
import org.example.dao.impl.UserDaoImpl;
import org.example.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class Registration extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        UserModel userModel = new UserModel(req.getParameter("login"), req.getParameter("email"), req.getParameter("password"));
        UserModel userDb = new UserDaoImpl().getByUsername(userModel.getLogin());
        if (userDb != null) {
            req.setAttribute("result", "Такое имя уже есть!");
            req.getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
        } else {
            boolean result = new UserDaoImpl().createUser(userModel);
            if (result) {
                req.setAttribute("result", "Вы зарегистрированы!");
                req.getRequestDispatcher("/pages/userPage.jsp").forward(req, resp);
            } else
                req.setAttribute("result", "Error");
                req.getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
        }
    }
}
