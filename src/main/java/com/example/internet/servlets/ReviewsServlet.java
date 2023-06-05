package com.example.internet.servlets;

import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.ReviewsInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
public class ReviewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/reviews.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        ReviewsInfo reviewsInfo = new ReviewsInfo(req.getParameter("id"), req.getParameter("person"), req.getParameter("textreview"));
        try {
            db.writeInDbReview(reviewsInfo);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("reviews");
    }

}
