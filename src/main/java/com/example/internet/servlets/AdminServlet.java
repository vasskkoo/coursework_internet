package com.example.internet.servlets;

import com.example.internet.database.Const;
import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.AdminInfo;
import com.example.internet.items.ReviewsInfo;
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

public class AdminServlet extends HttpServlet {
    private static AdminInfo adminInfo;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getAttribute("admin") != null) {
            adminInfo = (AdminInfo) req.getAttribute("admin");
        }
        req.setAttribute("users", getUsersFromDb());
        req.setAttribute("admin", adminInfo);
        req.setAttribute("reviews", getReviewsFromDb());
        req.getRequestDispatcher("WEB-INF/view/admin.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            DatabaseHabdler.getInstance().removeFromDb(req.getParameter("firstname"), req.getParameter("secondname"));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        doGet(req, resp);

    }

    private Set<UserInfo> getUsersFromDb() {
        Set<UserInfo> userInfoList = new LinkedHashSet<>();
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        ResultSet resultSet = null;
        try {
            resultSet = db.getFromDb(Const.USER_TABLE);
            while (resultSet.next()) {
                userInfoList.add(new UserInfo(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4),
                        resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userInfoList;
    }

    private Set<ReviewsInfo> getReviewsFromDb() {
        Set<ReviewsInfo> reviewsInfoList = new LinkedHashSet<>();
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        ResultSet resultSet = null;
        try {
            resultSet = db.getFromDb(Const.REVIEWS_TABLE);
            while (resultSet.next()) {
                reviewsInfoList.add(new ReviewsInfo(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return reviewsInfoList;
    }
}