<%@ page import="com.example.internet.items.TariffsInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
        <%@include file="../../css/services.css" %>
    </style>
    <style>
        <%@include file="../../css/main.css" %>
    </style>
</head>
<body>
<header>
    <a href="/internet/" class="logo"><img class="image" src="https://i.pinimg.com/750x/ab/a2/97/aba2974fd67455f9bbbdd2b4227cbf95.jpg" alt=""></a>
    <ul class="mnu_top">
        <li><a href="/internet/services">Послуги</a></li>
        <li><a href="/internet/register">Кабінет</a></li>
        <li><a href="/internet/about">Про нас</a></li>
    </ul>
</header>
<main>
    <section class="services_section">
    <c:forEach var="tariffs" items="${requestScope.tariffs}">
        <div class="main_text"><h1>Послуги</h1></div>
        <div class="services_div">
            <div class="service">
                <div class="service_name"><h1>Інтернет</h1></div>
                <div class="line"></div>
                <div class="service_info">
                    <p>Висока швидкість</p>
                    <p>Безперебійний сигнал</p>
                    <p>Цілодобова підтримка</p>
                </div>
                <div class="service_cost"><h1><c:out value="${tariffs.first_price}"/></h1></div>
                <a href="/internet/order" class="button-link"><div class="trybutton">Замовити</div></a>
            </div>
            <div class="service">
                <div class="service_name"><h1>Інтернет + телебачення</h1></div>
                <div class="line"></div>
                <div class="service_info">
                    <p>Висока якість сигналу</p>
                    <p>Висока швидкість</p>
                    <p>Швидке підключення</p>
                    <p>Безперебійний сигнал</p>
                    <p>Цілодобова підтримка</p>
                </div>
                <div class="service_cost"><h1><c:out value="${tariffs.second_price}"/></h1></div>
                <a href="/internet/order" class="button-link"><div class="trybutton">Замовити</div></a>
            </div>
            <div class="service">
                <div class="service_name"><h1>Хостинг</h1></div>
                <div class="line"></div>
                <div class="service_info">
                    <p>Надійність</p>
                    <p>Лояльні ціни</p>
                    <p>Нове обладнання</p>
                </div>
                <div class="service_cost"><h1><c:out value="${tariffs.third_price}"/></h1></div>
                <a href="/internet/order" class="button-link"><div class="trybutton">Замовити</div></a>
            </div>
        </div>
    </c:forEach>
    </section>
</main>
<footer>
    <div class="logo_footer">
        <img class="fotter_img" src="https://i.pinimg.com/750x/ab/a2/97/aba2974fd67455f9bbbdd2b4227cbf95.jpg ">
    </div>
    <nav>
        <a href="/internet/">Головна</a>
        <a href="/internet/services">Послуги</a>
        <a href="/internet/about">Про нас</a>
    </nav>
    <div class="contacts">
        <p>Зв'яжіться з нами</p>
        <p>098 939 55 37</p>
        <p>050 115 66 12</p>
    </div>
</footer>
</body>
</html>
