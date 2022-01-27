<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Home</title>
    <%--<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>--%>
    <link href="<c:url value="/css/login.css" />" rel="stylesheet">
</head>
<body>
<h1>Welcome</h1>
<h2>${message}</h2>

<form action="login" method="post">

    <input type="text" id="login" class="fadeIn second" name="login" placeholder="login">

    <input type="password" id="password" class="fadeIn third" name="password" placeholder="Mot de passe">

    <input type="submit" class="fadeIn fourth" value="Connexion">

    <!--Erreur-->
    <%--        <div th:if="${param.error}" class="alert alert-error">
                Login ou mot de passe invalide!
            </div>

            <div th:if="${param.logout}" class="alert alert-error">
                Vous avez été deconnecté!
            </div>
--%>
</form>

<a href="${pageContext.request.contextPath}/personList">Person List</a>

</body>

</html>