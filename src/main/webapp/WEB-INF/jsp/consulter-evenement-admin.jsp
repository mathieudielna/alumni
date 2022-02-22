<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page session="true"%>

<!DOCTYPE HTML>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>Consulter Evenement</title>
    <link href="<c:url value="" />" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>

<body>

<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Date</th>
        <th scope="col">Lien</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="evenement" items="${evenements}">
        <c:url value="/evenement/modification/${evenement.idEvent}" var="url" />
        <tr>
            <td scope="row">${evenement.idEvent}</td>
            <td>${evenement.nomEvent}</td>
            <td>
                <p><a href="<c:url value="${url}" />">Modifier Evenement</a></p>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>

