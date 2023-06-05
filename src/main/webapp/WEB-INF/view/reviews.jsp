<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="com.example.internet.items.AdminInfo" %>
<%@ page import="com.example.internet.servlets.RegisterServlet" %>
<%@ page import="com.example.internet.items.UserInfo" %>
<%@ page import="com.example.internet.items.ReviewsInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Oswald&display=swap" rel="stylesheet">
    <title>Internet</title>
    <style>
        <%@include file="../../css/admin.css" %>
    </style>
    <style>
        <%@include file="../../css/main.css" %>
    </style>
    <style>
        <%@include file="../../css/reviews.css" %>
    </style>
</head>
<body>
<% ReviewsInfo reviewsInfo = (ReviewsInfo) request.getAttribute("reviewer");%>
<div class="side_bar">
    <div class="side_bar_logo">
        <img class="side_bar_image" src="https://i.pinimg.com/750x/ab/a2/97/aba2974fd67455f9bbbdd2b4227cbf95.jpg" alt="">
    </div>
    <ul>
        <li><a href="/internet/orders">Замовлення</a></li>
        <li><a href="/internet/reviews">Відгуки</a></li>
        <li><a href="/internet/tariffs">Тарифи</a></li>
    </ul>
</div>
<div class="reviews_container">
    <form class="new_review" method="post">
        <div class="new_first_review">
            <input class="input_field" type="text" name="id" required placeholder="Введіть нове id">
            <input class="input_field" type="text" name="person" required placeholder="Введіть новий логін">
            <input class="input_field" type="text" name="textreview" required placeholder="Введіть новий відгук">
        </div>
        <div class="btn_div">
            <button class="my_button" type="submit">Надіслати</button>
        </div>
    </form>
</div>
</body>
</html>