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
    <link href="<c:url value="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" />" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"/>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>

<body>

<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Nom</th>
        <th scope="col">Heure</th>
        <th scope="col">Lieu</th>
        <th scope="col">Modifier l'événement</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="evenement" items="${evenements}">
        <c:url value="/evenement/modification/${evenement.idEvent}" var="url" />
        <tr>
            <td scope="row">${evenement.idEvent}</td>
            <td>${evenement.nomEvent}</td>
            <td>${evenement.heureEvent}</td>
            <td>${evenement.lieuEvent}</td>
            <td>
                <p><a href="<c:url value="${url}" />">Modifier Evenement</a></p>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>

