package com.example.internet.servlets;

import com.example.internet.database.Const;
import com.example.internet.database.DatabaseHabdler;
import com.example.internet.items.TariffsInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;
import java.util.Set;

public class TariffsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/view/tariffs.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        TariffsInfo tariffsInfo = new TariffsInfo(req.getParameter("first_price"), req.getParameter("second_price"), req.getParameter("third_price"));
        try {
            db.writeInDbTariffs(tariffsInfo);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("tariffs");
    }
    private Set<TariffsInfo> getTariffsFromDb(){
        Set<TariffsInfo> tariffsInfoList = new LinkedHashSet<>();
        DatabaseHabdler db = DatabaseHabdler.getInstance();
        ResultSet resultSet = null;
        try {
            resultSet = db.getFromDb(Const.TARIFFS_TABLE);
            while (resultSet.next()){
                tariffsInfoList.add(new TariffsInfo(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3)));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tariffsInfoList;
    }
}
