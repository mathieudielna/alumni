<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Home</title>
    <%--<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>--%>

    <link href="<c:url value="/css/.css" />" rel="stylesheet">
</head>
<body>
<h1>Welcome</h1>
<h2>${message}</h2>


<a href="${pageContext.request.contextPath}/personList">Person List</a>

</body>

</html>