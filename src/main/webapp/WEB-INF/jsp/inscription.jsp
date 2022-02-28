<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Inscription</title>
        <link href="<c:url value="/css/form.css" />" rel="stylesheet">
        <link href="<c:url value='/css/header.css' />" rel="stylesheet">
    </head>

    <body>

    <jsp:include page="template/header.jsp"></jsp:include>

    <div class="wrapper fadeInDown">
        <div id="formContent">

            <div class="fadeIn first">
                <img src="https://upload.wikimedia.org/wikipedia/fr/b/b2/Universite_Paris_logo_horizontal.jpg" id="icon" alt="univ icon"/>
            </div>

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