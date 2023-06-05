<%@ page import="com.example.internet.items.ReviewsInfo" %>
<%@ page import="com.example.internet.items.UserInfo" %>
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
        <%@include file="../../css/index.css" %>
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
    <section class="main_content">
        <div class="start_div">
            <div class="img_div">
                <img class="main_img" src="https://limnet.com.ua/wp-content/uploads/elementor/thumbs/LimNet_%D1%80%D0%BE%D0%B1%D0%BE%D1%82_%D1%80%D0%B0%D0%B4%D0%BE%D1%81%D1%82%D1%8C-oxvko68o3zci7fh0rbst38e4x6qinfdw4n2m9edmww.png">
            </div>
            <div class="info_div">
                <h1>SpaceNet</h1>
                <h2>Ваш найкращий інтернет-провайдер</h2>
                <p class="main_p">Замовте підключення прямо зараз</p>
                <a href="/internet/order" class="button-link">
                    <div class="trybutton">Замовити</div>
                </a>
                <div class="social_media">
                    <a href="https://www.instagram.com/vasko.mp3/">
                        <img class="social_img_menu" src="https://www.nicepng.com/png/full/23-230042_instagram-logo-black-borders-png-transparent-background-instagram.png">
                    </a>
                    <a href="https://t.me/SpaceNetworkVIPChannel">
                        <img class="social_img_menu" src="https://th.bing.com/th/id/R.ebde6db9f4a2fc50afd71b417459eced?rik=NMOuQOOGogtGUw&riu=http%3a%2f%2fpluspng.com%2fimg-png%2ftelegram-logo-png-open-2000.png&ehk=7fx6AXa8wrDf%2bOaPJ73oukUYX0C1NdQXecUm1kSenBg%3d&risl=&pid=ImgRaw&r=0">
                    </a>
                </div>
            </div>
        </div>
        </div>
    </section>
    <section class="advantages">
        <div class="advantages_text"><h1>Наші переваги</h1></div>
        <div class="advantages_div">
            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/f6/16/de/f616de9dfeb09515c6b3a0310cff2c85.jpg">
                    <p>швидкий інтернет</p>
                </div>
            </div>

            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/de/d5/ca/ded5cae3c8cd557fbd7592b03c792bbb.jpg">
                    <p>лояльні ціни</p>
                </div>
            </div>
            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/e0/4b/92/e04b9257d08deae22ef67ed5585312e0.jpg">
                    <p>підтримка 24/7</p>
                </div>
            </div>
        </div>
        <div class="advantages_div">
            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/11/ce/ad/11cead37323962163e8f1a4634a1c436.jpg">
                    <p>стабільність</p>
                </div>
            </div>

            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/9a/31/cf/9a31cfc9710d40c1e06bc12160aee6ff.jpg">
                    <p>комфортне підключення</p>
                </div>
            </div>
            <div class="header_new_advantages">
                <div class="new_advantages">
                    <img class="img_advantages" src="https://i.pinimg.com/750x/49/e7/0c/49e70c05c74c74804cfbe4c80fe3460a.jpg">
                    <p>нове обладнання</p>
                </div>
            </div>
        </div>
    </section>
    <section class="news">
        <div class="news_text"><h1>Новини</h1></div>
        <div class="news_div">
            <div class="new_div">
                <div class="header_new_div"><h1>Важлива Інформація!</h1></div>
                <div class="text_new_div">
                    <p>З 20.05.2023 буде проводитися діагностика мереж.</p>
                    <p>протягом доби можливі перебої.</p>
                    <p>Перепрошуємо за тимчасові незручності!</p>
                </div>
            </div>
            <div class="new_div">
                <div class="header_new_div"><h1>Разом до перемоги!</h1></div>
                <div class="text_new_div">
                    <p>В такий тяжкий для нашої держави час</p>
                    <p>дуже важливо бути на зв'язку з рідними,</p>
                    <p>тому ціни на послуги були знижені на 10%.</p>
                    <p>і 20% з послуг підуть на допомогу ЗСУ.</p>
                </div>
            </div>
            <div class="new_div">
                <div class="header_new_div"><h1>Збір коштів!</h1></div>
                <div class="text_new_div">
                    <p>Ми збираємо кошти на F-16 для НВР "Правий Сектор"</p>
                    <p>Багато наших співробітників мають родичів та друзів там</p>
                    <p>Тому ми вирішили створити моно-банку для збору коштів</p>
                    <p><a href="https://send.monobank.ua/jar/7TSGPqYd8J" class="button-link">
                        <div class="trybutton_new_div">Посилання</div>
                    </a></p>
                </div>
            </div>
            <div class="new_div">
                <div class="header_new_div"><h1>Працевлаштування!</h1></div>
                <div class="text_new_div">
                    <p>Наша компанія в пошуках людей для роботи "Кабельщик"</p>
                    <p>Робота для чоловіків до 50 років, готові взяти студента</p>
                    <p>Переходьте за посиланням для заповнення заявки</p>
                    <p><a href="https://forms.gle/Kc1uyg32Fqnh52cu8" class="button-link">
                        <div class="trybutton_new_div">Посилання</div>
                    </a></p>
                </div>
            </div>
        </div>
    </section>
    <div class="news_text"><h1>Відгуки</h1></div>
    <section class="reviews">
        <div class="reviews_div">
            <c:forEach var="reviews" items="${requestScope.reviews}">
            <div class="review">
                <div class="img_rew">
                    <img class="author_img" src="https://cdn.onlinewebfonts.com/svg/img_304500.png">
                    <div class="author">
                        <h1><c:out value="${reviews.person}"/></h1>
                    </div>
                </div>
                <div class="text_rew">
                    <p><c:out value="${reviews.textreview}"/></p>
                </div>
            </div>
            </c:forEach>
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