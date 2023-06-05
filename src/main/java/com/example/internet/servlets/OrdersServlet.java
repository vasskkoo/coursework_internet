package com.example.internet.servlets;

import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.UserInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

public class OrdersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", getUserFromDb() );
        req.getRequestDispatcher("WEB-INF/view/orders.jsp").forward(req, resp);
    }
    private Set<UserInfo> getUserFromDb(){
        Set<UserInfo> userInfoList = new LinkedHashSet<>();
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        ResultSet resultSet = null;
        try {
            resultSet = db.getFromDb("users");
            while (resultSet.next()){
                userInfoList.add(new UserInfo(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3)
                        , resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),
                        resultSet.getString(7), resultSet.getString(8), resultSet.getString(9)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userInfoList;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        UserInfo userInfo = new UserInfo(req.getParameter("firstname"), req.getParameter("secondname"), req.getParameter("email"),
                req.getParameter("phone"), req.getParameter("adress"), req.getParameter("data"),
                req.getParameter("data_time"),req.getParameter("service"), req.getParameter("addition"));
        try {
            db.writeInDbTime(userInfo);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("orders");
    }
}
