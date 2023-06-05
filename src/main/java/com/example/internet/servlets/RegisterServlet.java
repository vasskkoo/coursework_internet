package com.example.internet.servlets;

import com.example.internet.database.Const;
import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.AdminInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class RegisterServlet extends HttpServlet {
    private String message;
    private boolean isAuthorize;

    @Override
    public void init() throws ServletException {
        message = " ";
        isAuthorize = false;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("unauthorize") != null) {
            isAuthorize = false;
            req.getRequestDispatcher("").forward(req, resp);
        }
        if (!isAuthorize){
            message = " ";
            req.setAttribute("message", message);
            req.getRequestDispatcher("WEB-INF/view/register.jsp").forward(req, resp);
        }else {
            req.getRequestDispatcher("WEB-INF/view/admin.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AdminInfo admin = register(req.getParameter("login"), req.getParameter("password"));
        if (admin != null){
            isAuthorize = true;
            req.setAttribute("admin", admin);
            doGet(req, resp);
        }else{
            message = "Невірний логін або пароль";
            req.setAttribute("message", message);
            req.getRequestDispatcher("WEB-INF/view/register.jsp").forward(req, resp);
        }
    }

    private AdminInfo register(String login, String password){
        AdminInfo res = null;
        Set<AdminInfo> admins = new HashSet<>();
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        try {
            ResultSet rs = db.getFromDb(Const.ADMIN_TABLE);
            while (rs.next()){
                admins.add(new AdminInfo(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (AdminInfo ad : admins) {
            if (ad.getLogin().equals(login) && ad.getPassword().equals(password))
                res = ad;
        }
        return res;
    }
}
