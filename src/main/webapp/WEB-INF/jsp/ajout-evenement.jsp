<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ajouter-événement</title>
        <link href="<c:url value="/css/form.css" />" rel="stylesheet">
    </head>
</html>

<body>
<div class="wrapper fadeInDown">
    <div id="formContent">

        <div class="fadeIn first">
            <img src="https://upload.wikimedia.org/wikipedia/fr/b/b2/Universite_Paris_logo_horizontal.jpg" id="icon" alt="User Icon"/>
        </div>

        <h2 class="active ">Ajouter un événement </h2>

        <form:form method="POST" action="ajouter" modelAttribute="evenementForm">

            <form:input path="dateEvent"  placeholder="Date Evenement*"/>
            <br>
            <form:errors path="dateEvent" cssClass="error"  id="error"/>

            <form:input path="nomEvent" placeholder="Nom Evenement*"/>
            <br>
            <form:errors path="nomEvent" cssClass="error"  id="error"/>

            <form:input path="heureEvent" placeholder="Heure Evenement*"/>
            <br>
            <form:errors path="heureEvent" cssClass="error"  id="error"/>

            <form:input path="lieuEvent" placeholder="Lieu Evenement*" />
            <br>
            <form:errors path="lieuEvent" cssClass="error" id="error"/>

            <form:input path="nbPersonneMax"/>
            <br>
            <form:errors path="nbPersonneMax" cssClass="error" id="error"/>

            <input type="submit" class="fadeIn fourth" value="AJOUTER EVENEMENT">

        </form:form>
        </div>
    </div>
</body>