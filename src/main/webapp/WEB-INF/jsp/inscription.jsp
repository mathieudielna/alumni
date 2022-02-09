<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="ISO-8859-1"/>
        <title>Inscription</title>
    </head>
    <body>
    <div>Inscription</div>

      <form:form method="POST" action="ajoutuser" modelAttribute="utilisateur">

        <table>
            <tr>
                <td><form:input path="login" placeholder="login" /></td>
            </tr>
            <tr>
                <td><form:input path="nom" placeholder="nom" /></td>
            </tr>
            <tr>
                <td><form:input path="prenom" placeholder="prenom" /></td>
            </tr>
            <tr>
                <td><form:input path="anneePromotion" placeholder="anneePromotion" /></td>
            </tr>
            <tr>
                <td><form:password path="password" placeholder="password" /></td>
            </tr>
            <tr>
                <td><form:input path="role" placeholder="role" /></td>
            </tr>
            <tr>
                <td><form:button>inscription</form:button></td>
            </tr>
        </form:form>

        <!--Erreur-->
  <%--          <div class="alert alert-error">
                <c:if test="${param.error}" >Informations incomplètes et/ou erronées</c:if>
            </div>
            <div class="alert alert-error">
                <c:if test="${param.success}">Votre compte a été correctement crée</c:if>
            </div>--%>
    </body>
</html>