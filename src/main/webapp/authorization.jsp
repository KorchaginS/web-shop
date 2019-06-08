<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@page import="java.util.ArrayList"%>
<%@page import ="com.Shop.InternetShop.Model.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8" %>
<html>
    <meta charset="utf-8" />
    <link href="style.css" rel="stylesheet" type="text/css">
    <body>

        <h2>Авторизация</h2>
                <form name="Authorization" method="get">
                <p>Логин:<input type="text" name="login" /></p>
                <p>Пароль:<input type="password" name="password" /></p>
                <p><input type="submit" name="submit" value="Войти" /></p>
                </form>

                <% if (request.getAttribute("message") != null) {%>
                <% String message = (String) request.getAttribute("message"); %>
                <c:set var="warning" value="<%=message.toString()%>"/>
                <h3>${warning}</h3>
                <%}%>

            <br>

                <h2>Регистрация</h2>
                <form name="Registration" method="post">
                    <p>Логин:<input type="text" name="regLogin" /></p>
                    <p>Пароль:<input type="password" name="regPassword" /></p>
                    <p><input type="submit" name="submit" value="Регистрация" /></p>
                </form>

                <% if (request.getAttribute("regMessage") != null) {%>
                    <% String messageReg = (String) request.getAttribute("regMessage"); %>
                    <c:set var="regWarning" value="<%=messageReg.toString()%>"/>
                    <h3>${regWarning}</h3>
                <%}%>

    </body>
</html>