<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true"%>

<!DOCTYPE HTML>

<html>

<head>
    <meta charset="UTF-8"/>
    <title>Connexion</title>
    <link href="<c:url value="/css/form.css" />" rel="stylesheet">

</head>

<body>

<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Connexion </h2>

        <a href="/inscription"><h2 class="inactive underlineHover">Inscription </h2></a>
        <!-- Icon -->
        <!-- <div class="fadeIn first">
             <img src="" id="icon" alt="User Icon"/>
         </div>-->
        <form name="loginForm" action="connexion" method="post">

            <input type="text" id="login" class="fadeIn second" name="login" placeholder="identifiant">

            <input type="password" id="password" class="fadeIn third" name="password" placeholder="mot de passe">

            <input type="submit" class="fadeIn fourth" value="Connexion">

            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

        </form>
            <!--Erreur-->
        <div class="alert alert-error">
                <c:if test="${param.error}" > Login ou mot de passe invalide! </c:if>
            </div>
        <div class="alert alert-error">
                <c:if test="${param.logout}"> Vous avez été deconnecté! </c:if>
        </div>

    </div>
</div>
</body>

</html>
