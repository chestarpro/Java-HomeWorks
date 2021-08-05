package org.example.servlet;

import org.example.dao.impl.UserDaoImpl;
import org.example.model.UserLogModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listLog")
public class AllLogsListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out1 = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");

        List<UserLogModel> userLogModels = new UserDaoImpl().getAllUsersLogs();

        for (int i = 0; i < userLogModels.size(); i++) {
            out1 = resp.getWriter();
            out1.println("<li><u>" + userLogModels.get(i) + "</u></li>");
        }
    }
}
