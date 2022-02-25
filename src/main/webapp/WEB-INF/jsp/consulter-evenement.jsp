<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page session="true"%>

<!DOCTYPE HTML>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>Evenements Alumni</title>
    <link href="<c:url value='/css/header.css' />" rel="stylesheet">
    <link href="<c:url value='/css/tableau.css' />" rel="stylesheet">

</head>

<body>
<jsp:include page="template/header.jsp"></jsp:include>

<div class="table-wrapper">
<table class="fl-table">
    <thead>
    <tr>
        <th>Id</th>
        <th>Nom</th>
        <th>Date</th>
        <th>Heure</th>
        <th>Lieu</th>
        <th>Nombres de personnes</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="evenement" items="${evenements}">
        <tr>
            <td>${evenement.idEvent}</td>
            <td>${evenement.nomEvent}</td>
            <td>${evenement.dateEvent}</td>
            <td>${evenement.heureEvent}</td>
            <td>${evenement.lieuEvent}</td>
            <td>${evenement.nbPersonneMax}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>

