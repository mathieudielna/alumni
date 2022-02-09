<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>

<html>

<head>
    <meta charset="UTF-8"/>
    <title>Login Page</title>

    <%--
    Help
    - https://mkyong.com/spring-boot/spring-boot-hello-world-example-jsp/
    --%>
    <%--<link href="/css/login.css" rel="stylesheet">--%>
    <link href="<c:url value="/css/login.css" />" rel="stylesheet">
</head>

<body>
<div class="wrapper fadeInDown">
    <div id="formContent">
        <!-- Tabs Titles -->
        <h2 class="active"> Connexion </h2>

        <!--        <h2 class="inactive underlineHover">Sign Up </h2>-->

        <!-- Icon -->
        <!-- <div class="fadeIn first">
             <img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon" alt="User Icon"/>
         </div>-->

        <!-- Login Form -->
        <%--        <form name="f" action="@{/login}" method="post">--%>
        <form name="f" action="/perform_login" method="post">

            <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">

            <input type="password" id="password" class="fadeIn third" name="password" placeholder="Mot de passe">

            <input type="submit" class="fadeIn fourth" value="Connexion">

            <!--Erreur-->
            <div class="alert alert-error">
                <c:if test="${param.error}" > Login ou mot de passe invalide! </c:if>
            </div>

            <div class="alert alert-error">
                <c:if test="${param.logout}"> Vous avez été deconnecté! </c:if>
            </div>

        </form>

        <!-- Remind Passowrd -->
        <!--        <div id="formFooter">-->
        <!--            <a class="underlineHover" href="#">Forgot Password?</a>-->
        <!--        </div>-->

    </div>
</div>
</body>

</html>
