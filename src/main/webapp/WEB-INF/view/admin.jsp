<%@ page import="com.example.internet.items.ReviewsInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</head>
<body>
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
<div class="container">
  <div class="header_container">
    <div class="nav_header">
      <div class="user_header">
        <a href="/internet" class="button_user">Головна</a>
        <div class="user_img">
          <img src="https://cdn-icons-png.flaticon.com/512/1/1247.png" alt="">
        </div>
      </div>
    </div>
  </div>
  <div class="ii_content"></div>
</div>>
</body>
</html>