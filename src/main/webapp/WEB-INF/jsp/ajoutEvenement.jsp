<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Ajout événement</title>
    </head>
</html>
<body>

<div>Ajout evenement</div>

<form:form name="loginForm" method="POST" action="/evenement/ajouter" modelAttribute="evenementForm">
    <table>
        <tr>
            <td><form:label path="dateEvent">Date de l'évenement</form:label></td>
            <td><form:input path="dateEvent" /></td>
            <td><form:errors path="dateEvent" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="nomEvent">Date de l'évenement</form:label></td>
            <td><form:input path="nomEvent" /></td>
            <td><form:errors path="nomEvent" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="heureEvent">Date de l'évenement</form:label></td>
            <td><form:input path="heureEvent" /></td>
            <td><form:errors path="heureEvent" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="lieuEvent">Date de l'évenement</form:label></td>
            <td><form:input path="lieuEvent" /></td>
            <td><form:errors path="lieuEvent" cssClass="error" /></td>
        </tr>
        <tr>
            <td><form:label path="nbPersonne">Date de l'évenement</form:label></td>
            <td><form:input path="nbPersonne" /></td>
            <td><form:errors path="nbPersonne" cssClass="error" /></td>
        </tr>
        <td><form:button>AJOUTER EVENEMENT</form:button></td>

    </table>
</form:form>
</body>