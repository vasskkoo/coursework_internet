package com.example.internet.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/about.jsp").forward(req, resp);
    }
}
