<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Accueil</title>
    <%--<link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>--%>
    <link href="<c:url value="" />" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/accueils.css"/>
</head>

<body>

    <!-- <div>Ok Acceuil</div>
    <div>${message}</div>

    <a href="${pageContext.request.contextPath}/inscription">Inscription</a> -->


    <nav>
        <aside><img src="" alt="Logo Université de Paris"/></aside>
        <div>Evenements</div>
        <div>Contacts</div>
    </nav>

    <section>
        <article>
            <h1>Le réseau</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse finibus ipsum at tellus hendrerit, quis maximus urna ultrices. Quisque quis enim elit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus turpis felis, faucibus non auctor vel, mattis quis est. Cras finibus urna vitae faucibus dapibus. Etiam arcu enim, elementum tincidunt sem non, tristique sollicitudin tortor. Maecenas euismod enim orci, et dictum felis tincidunt vitae.</p>
        </article>
        <article>
            <a href="${pageContext.request.contextPath}/inscription">Inscription</a>
            <a href="${pageContext.request.contextPath}/connexion">Connexion</a>
        </article>
    </section>

</body>

</html>