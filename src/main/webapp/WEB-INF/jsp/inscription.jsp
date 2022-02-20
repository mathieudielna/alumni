<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="ISO-8859-1"/>
        <title>Inscription</title>
    </head>
    <body>
    <div>Inscription</div>
      <form:form method="POST" action="inscription" modelAttribute="utilisateurForm">
        <table>
            <tr>
                <spring:bind path="login">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <td><form:label path="login">Login</form:label></td>
                        <td><form:input path="login" placeholder="login" /></td>
                        <td><form:errors path="login" cssClass="error" /></td>
                    </div>
                </spring:bind>
            </tr>
            <tr>
                <spring:bind path="prenom">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <td><form:label path="nom">Nom</form:label></td>
                        <td><form:input path="nom" placeholder="nom" /></td>
                        <td><form:errors path="nom" cssClass="error" /></td>
                    </div>
                </spring:bind>
            </tr>
            <tr>
                <spring:bind path="prenom">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <td><form:label path="prenom">Prenom</form:label></td>
                        <td><form:input path="prenom" placeholder="prenom" /></td>
                        <td><form:errors path="prenom" cssClass="error" /></td>
                    </div>
                </spring:bind>
            </tr>
            <tr>
                <spring:bind path="anneePromotion">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <td><form:label path="anneePromotion">Année de la promotion</form:label></td>
                        <td><form:input type="text" path="anneePromotion" placeholder="anneePromotion" /><em>jj/mm/aaaa</em></td>
                        <td><form:errors path="anneePromotion" cssClass="error" /></td>
                    </div>
                </spring:bind>
            </tr>
            <tr>
                <spring:bind path="password">
                    <div class="form-group ${status.error ? 'has-error' : ''}">
                        <td><form:label path="password">Mot de passe</form:label></td>
                        <td><form:password path="password" placeholder="password" /></td>
                        <td><form:errors path="password" cssClass="error" /></td>
                    </div>
                </spring:bind>
            </tr>
            <tr>
                <td><form:button>inscription</form:button></td>
            </tr>
        </form:form>

        <!--Erreur-->
        <div class="alert alert-error">
            <c:if test="${param.error}" >Informations incomplètes et/ou erronées</c:if>
        </div>
        <div class="alert alert-error">
            <c:if test="${param.success}">Votre compte a été correctement crée</c:if>
        </div>

    </body>
</html>