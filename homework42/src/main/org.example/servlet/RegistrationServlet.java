package org.example.servlet;

import org.example.dao.impl.UserDaoImpl;
import org.example.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");
        UserModel userModel = new UserModel(req.getParameter("login"), req.getParameter("email"), req.getParameter("password"));
        UserModel userDbLogin = new UserDaoImpl().getByUsername(userModel.getLogin());
        UserModel userDbEmail = new UserDaoImpl().getByUserEmail(userModel.getEmail());

        if(userModel.getLogin() == null || userModel.getLogin().isEmpty()) {
            String msg = "Поле не заполненно!";
            out = resp.getWriter();
            out.println("<h1 align=\"center\">" + msg + "</h1>");
        } else {
            if (userDbLogin != null) {
                String msg = "Такой логин уже есть!";
                out = resp.getWriter();
                out.println("<h1 align=\"center\">" + msg + "</h1>");
            }
            if(userDbEmail != null) {
                String msg = "Такая почта уже есть!";
                out = resp.getWriter();
                out.println("<h1 align=\"center\">" + msg + "</h1>");
            }
            if(userDbLogin == null && userDbEmail == null){
                userModel = new UserDaoImpl().createUser(userModel);
                if (userModel.getId() != null) {
                    req.setAttribute("result", "Вы зарегистрированы!");
                    req.getRequestDispatcher("/pages/userPage.jsp").forward(req, resp);
                } else {
                    String msg22 = "Ошибка базы данных";
                    out.println("<h1 align=\"center\">" + msg22 + "</h1>");
                }
            }
        }
    }
}
