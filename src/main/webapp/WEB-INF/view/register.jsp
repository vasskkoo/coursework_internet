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
        <%@include file="../../css/register.css" %>
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
    <section class="register">
        <div class="register_form">
            <form method="post">
                <div class="text"><h1>Вхід</h1></div>
                <div class="line"></div>
                <div class="item_div">
                    <div class="title_div"><p>Логін</p></div>
                    <div class="input_div">
                        <input class="input_field" type="text" name="login">
                    </div>
                </div>
                <div class="item_div">
                    <div class="title_div"><p>Пароль</p></div>
                    <div class="input_div">
                        <input class="input_field" type="password" name="password">
                    </div>
                </div>
                <% String errMessage = (String) request.getAttribute("message"); %>
                <div class="error_message"><p><%= errMessage %></p></div>
                <div class="btn_div">
                    <button class="my_button" type="submit">Авторизація</button>
                </div>
            </form>
        </div>
    </section>
</main>
<footer>
    <div class="logo_footer">
        <img class="fotter_img" src="https://i.pinimg.com/750x/ab/a2/97/aba2974fd67455f9bbbdd2b4227cbf95.jpg">
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
