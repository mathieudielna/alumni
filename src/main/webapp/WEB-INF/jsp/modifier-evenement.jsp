<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>Modifier-événement</title>
    <link href="<c:url value="/css/form.css" />" rel="stylesheet">
    <link href="<c:url value='/css/header.css' />" rel="stylesheet">
</head>
</html>

<body>

<jsp:include page="template/header.jsp"></jsp:include>

<div class="wrapper fadeInDown">
    <div id="formContent">

        <div class="fadeIn first">
            <img src="https://upload.wikimedia.org/wikipedia/fr/b/b2/Universite_Paris_logo_horizontal.jpg" id="icon" alt="univ icon"/>
        </div>

        <h2 class="active ">Modifier un événement </h2>

        <c:url value="/evenement/modification/${evenement.idEvent}" var="url" />

        <form:form method="POST" action="${url}" modelAttribute="evenement">

            <form:hidden path="idEvent" />

            <form:input path="dateEvent"  placeholder="Date Evenement*"/>
            <br>
            <form:errors path="dateEvent" cssClass="error"  id="error"/>

            <form:input path="nomEvent" placeholder="Nom Evenement*"/>
            <br>
            <form:errors path="nomEvent" cssClass="error"  id="error"/>

            <form:input path="heureEvent" placeholder="Heure Evenement*"/>
            <br>
            <form:errors path="heureEvent" cssClass="error"  id="error" />

            <form:input path="lieuEvent" placeholder="Lieu Evenement*" />
            <br>
            <form:errors path="lieuEvent" cssClass="error"  id="error" />

            <form:input path="nbPersonneMax"/>
            <br>
            <form:errors path="nbPersonneMax" cssClass="error"  id="error"/>

            <input type="submit" class="fadeIn fourth" value="MODIFIER EVENEMENT">

        </form:form>
    </div>
</div>
</body>