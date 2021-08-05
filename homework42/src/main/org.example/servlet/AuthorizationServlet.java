package org.example.servlet;

import org.example.dao.impl.UserDaoImpl;
import org.example.model.UserLogModel;
import org.example.model.UserModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out1 = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");

        String login =  req.getParameter("login");
        String password = req.getParameter("password");
        boolean result;

        if(login == null || login.isEmpty() || password == null || password.isEmpty()) {
            String msg = "Поле не заполненно!";
            out1 = resp.getWriter();
            out1.println("<h1 align=\"center\">" + msg + "</h1>");
        } else {
            UserModel userDb = new UserDaoImpl().getByUsername(login);
            if (userDb != null) {
                UserLogModel userLog = new UserLogModel();
                userLog.setUserId(userDb.getId());
                result = userDb.getPassword().equals(password);
                userLog.setSuccess(result);
                new UserDaoImpl().createUserLog(userLog);
                if(result) {
                    req.setAttribute("result", "Привет " + userDb.getLogin());
                    req.getRequestDispatcher("/pages/userPage.jsp").forward(req, resp);
                } else {
                    String msg = "Не верные данные!";
                    out1 = resp.getWriter();
                    out1.println("<h1 align=\"center\">" + msg + "</h1>");
                }
            } else {
                String msg = "Пользователь не найден!";
                out1 = resp.getWriter();
                out1.println("<h1 align=\"center\">" + msg + "</h1>");
            }
        }
    }
}
