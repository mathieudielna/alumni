<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Accueil</title>
    <%--<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>--%>
    <link href="<c:url value="" />" rel="stylesheet">
</head>

<body>

<div>Ok Acceuil</div>
<div>${message}</div>

<a href="${pageContext.request.contextPath}/inscription">Inscription</a>

</body>

</html>