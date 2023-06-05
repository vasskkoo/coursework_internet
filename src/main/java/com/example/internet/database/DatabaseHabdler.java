package com.example.internet.database;

import com.example.internet.items.ReviewsInfo;
import com.example.internet.items.TariffsInfo;
import com.example.internet.items.UserInfo;

import java.sql.*;

public class DatabaseHabdler extends Configs {
    private static DatabaseHabdler instance;
    private Connection dbConnection;

    private DatabaseHabdler() {}

    public static DatabaseHabdler getInstance() {
        if (instance == null)
            instance = new DatabaseHabdler();
        return instance;
    }

    public Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                + dbPort + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);
        return dbConnection;
    }

    public void writeInDb(UserInfo userInfo) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_FIRSTNAME + "," + Const.USER_SECONDNAME + "," + Const.USER_EMAIL + "," +
                Const.USER_PHONE + "," + Const.USER_ADRESS + "," + Const.USER_DATA + "," +
                Const.USER_DATA_TIME + "," + Const.USER_SERVICE + "," + Const.USER_ADDITION + ")" + "VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement =  getDbConnection().prepareStatement(insert);
        preparedStatement.setString(1, userInfo.getFirstName());
        preparedStatement.setString(2, userInfo.getSecondName());
        preparedStatement.setString(3, userInfo.getEmail());
        preparedStatement.setString(4, userInfo.getPhoneNumber());
        preparedStatement.setString(5, userInfo.getAdress());
        preparedStatement.setString(6, userInfo.getData());
        preparedStatement.setString(7, userInfo.getData_time());
        preparedStatement.setString(8, userInfo.getService());
        preparedStatement.setString(9, userInfo.getAdditionText());
        preparedStatement.executeUpdate();
    }

    public void writeInDbReview(ReviewsInfo reviewsInfo) throws SQLException, ClassNotFoundException {
        String insert = "INSERT INTO " + Const.REVIEWS_TABLE + "(" +
                Const.REVIEWS_ID + "," + Const.REVIEWS_PERSON + "," +
                Const.REVIEWS_TEXTREVIEW + ")" + "VALUES(?,?,?)";
        PreparedStatement preparedStatement =  getDbConnection().prepareStatement(insert);
        preparedStatement.setString(1, reviewsInfo.getId());
        preparedStatement.setString(2, reviewsInfo.getPerson());
        preparedStatement.setString(3, reviewsInfo.getTextreview());
        preparedStatement.executeUpdate();
    }
    public void writeInDbTariffs(TariffsInfo tariffsInfo) throws SQLException, ClassNotFoundException {
        String insert = "UPDATE " + Const.TARIFFS_TABLE + " " + "SET " + Const.TARIFFS_FIRST_PRICE + "= " + "?" + ", "
                + Const.TARIFFS_SECOND_PRICE + "= " + "?" + ", " + Const.TARIFFS_THIRD_PRICE + "= " + "?" + ";";
        PreparedStatement preparedStatement =  getDbConnection().prepareStatement(insert);
        preparedStatement.setString(1, tariffsInfo.getFirst_price());
        preparedStatement.setString(2, tariffsInfo.getSecond_price());
        preparedStatement.setString(3, tariffsInfo.getThird_price());
        preparedStatement.executeUpdate();
    }
    public void writeInDbTime(UserInfo userInfo) throws SQLException, ClassNotFoundException {
        String insert = "UPDATE " + Const.USER_TABLE + " " + "SET " + Const.USER_DATA + "= " + "?" + ", " + Const.USER_DATA_TIME + "= "
        + "?" + "WHERE " + Const.USER_SECONDNAME + "= " + "?" + ";";
        PreparedStatement preparedStatement =  getDbConnection().prepareStatement(insert);
        preparedStatement.setString(1, userInfo.getData_time());
        preparedStatement.setString(2, userInfo.getData());
        preparedStatement.setString(3, userInfo.getSecondName());
        preparedStatement.executeUpdate();
    }
    public ResultSet getFromDb(String tablename) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = null;
        String select = "SELECT * FROM " + tablename;
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(select);
        resultSet = preparedStatement.executeQuery();
        return resultSet;
    }

    public void removeFromDb(String firstName, String secondName) throws SQLException, ClassNotFoundException {
        String delete = "DELETE FROM " + Const.USER_TABLE + " WHERE " +
                Const.USER_FIRSTNAME + "=? AND " + Const.USER_SECONDNAME + "=?";
        PreparedStatement preparedStatement = getDbConnection().prepareStatement(delete);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, secondName);
        preparedStatement.executeUpdate();
    }


}
