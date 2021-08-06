package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/primeNumbers")
public class PrimeNumbersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");

        int c = 0;
        int e = 1;

        out.println("<h1 style =\"margin-left: 3%\">Prime numbers:</h1>");
        out.println("<table border=\"5\" cellspacing=\"1\" style=\"width: 50%; " +
                "height: 80%; margin-left: 3%; box-shadow: 15px 10px 20px rgba(0,0,0,0.5); border-color: black;\">");

        for (int i = 2; i < 570; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                c++;
                if(c == 1) {
                    e++;
                    out.println("<tr>");
                }
                if(e == 1) {
                    out.println("<th style=\"background-color: black; color: white;\">" + i + "</th><th></th>");
                } else {
                    out.println("<th></th><th style=\"background-color: black; color: white;\">" + i + "</th>");
                }
                if(c == 10) {
                    out.println("</tr>");
                }
            }
            if(e == 2) {
                e = 0;
            }
            if(c == 8) {
                c = 0;
            }
        }
        out.println("</table>");
    }
}
