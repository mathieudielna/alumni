<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Inscription</title>
        <link href="<c:url value="/css/form.css" />" rel="stylesheet">
    </head>

    <body>
    <div class="wrapper fadeInDown">
        <div id="formContent">
            <a href="/connexion"><h2 class="inactive underlineHover">Connexion </h2></a>
            <h2 class="active"> Inscription </h2>
            <form:form method="POST" action="inscription" modelAttribute="utilisateurForm">
                <form:input path="login" placeholder="identifiant*" />
                <br>
                <form:errors path="login" cssClass="error" id="error" />

                <form:input path="nom" placeholder="nom*" />
                <br>
                <form:errors path="nom" cssClass="error" id="error" />

                <form:input path="prenom" placeholder="prenom*" />
                <br>
                <form:errors path="prenom" cssClass="error" id="error" />

                <form:input type="text" path="anneePromotion" placeholder="année(promotion)* jj/mm/aaaa" />
                <br>
                <form:errors path="anneePromotion" cssClass="error" id="error" />

                <form:password path="password" placeholder="mot de passe*" />
                <br>
                <form:errors path="password" cssClass="error" id="error" />

                <input type="submit" class="fadeIn fourth" value="inscription">
                <%--<form:button type="submit" class="fadeIn fourth">inscription</form:button>--%>

            </form:form>

        </div>
    </div>

    </body>
</html>