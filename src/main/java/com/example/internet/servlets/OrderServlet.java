package com.example.internet.servlets;

import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class OrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        UserInfo userInfo = new UserInfo(req.getParameter("firstname"), req.getParameter("secondname"), req.getParameter("email"),
                req.getParameter("phone"), req.getParameter("adress"), req.getParameter("date"),
                req.getParameter("time"),req.getParameter("serviceType"), req.getParameter("textarea"));
        try {
            db.writeInDb(userInfo);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("submited");
    }
}
