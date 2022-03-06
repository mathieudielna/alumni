<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page session="true"%>

<!DOCTYPE HTML>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>Consulter Evenement</title>
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
        <th>Max personnes</th>
        <th>Modifier</th>
        <th>Supprimer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="evenement" items="${evenements}">
        <c:url value="/evenement/modification/${evenement.idEvent}" var="url" />
        <c:url value="/evenement/supprimer/${evenement.idEvent}" var="url2" />
        <tr>
            <td>${evenement.idEvent}</td>
            <td>${evenement.nomEvent}</td>
            <td>${evenement.dateEvent}</td>
            <td>${evenement.heureEvent}</td>
            <td>${evenement.lieuEvent}</td>
            <td>${evenement.nbPersonneMax}</td>
            <td>
                <p><a href="<c:url value="${url}" />">Modifier</a></p>
            </td>
            <td>
                <p><a href="<c:url value="${url2}" />">Supprimer</a></p>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>

