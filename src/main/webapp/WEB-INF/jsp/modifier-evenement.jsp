<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier-événement</title>
    <link href="<c:url value="/css/form.css" />" rel="stylesheet">
</head>
</html>

<body>
<div class="wrapper fadeInDown">
    <div id="formContent">
        <h2 class="active ">Modifier un événement </h2>

        <c:url value="/evenement/modification/${evenement.idEvent}" var="url" />

        <form:form method="POST" action="${url}" modelAttribute="evenement">

            <form:hidden path="idEvent" />

            <form:input path="dateEvent"  placeholder="Date Evenement*"/>
            <br>
            <form:errors path="dateEvent" cssClass="error" />

            <form:input path="nomEvent" placeholder="Nom Evenement*"/>
            <br>
            <form:errors path="nomEvent" cssClass="error" />

            <form:input path="heureEvent" placeholder="Heure Evenement*"/>
            <br>
            <form:errors path="heureEvent" cssClass="error" />

            <form:input path="lieuEvent" placeholder="Lieu Evenement*" />
            <br>
            <form:errors path="lieuEvent" cssClass="error" />

            <form:input path="nbPersonneMax"/>
            <br>
            <form:errors path="nbPersonneMax" cssClass="error" />

            <input type="submit" class="fadeIn fourth" value="AJOUTER EVENEMENT">

        </form:form>
    </div>
</div>
</body>