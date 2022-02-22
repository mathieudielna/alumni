
<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Accueil</title>
    <link href="<c:url value='/css/accueil.css' />" rel="stylesheet">
</head>

<body>

    <!-- <div>Ok Acceuil</div>
    <div>${message}</div>

<a href="${pageContext.request.contextPath}/inscription">Inscription</a>
<a href="${pageContext.request.contextPath}/connexion">Connexion</a>
=======
    <a href="${pageContext.request.contextPath}/inscription">Inscription</a> -->


    <nav>
        <img src="https://upload.wikimedia.org/wikipedia/fr/b/b2/Universite_Paris_logo_horizontal.jpg" alt="Logo Université de Paris"/>
        <div class="void"></div>
        <div>Evenements</div>
        <div>Contacts</div>
    </nav>

    <section><div>
        <article>
            <h1>Le réseau</h1>
            <p>
                <span class="bold">Bienvenue dans la communauté des alumni de l'Université de Paris !</span></br>
                Totalement pluridisciplinaire, ce réseau compte près de 600 000 membres à travers le monde.</br>
                Dans les mois à venir, mes chers alumni,  le réseau de L'université de Paris va vous proposer des évènements et des opportunités qui vous correspondront !</br>
                En tant qu'alumni d'Université de Paris, vous êtes désormais ambassadeurs et ambassadrices de votre université</br>
            </p>
        </article>
        <article>
            <h1>A propos de</h1>
            <p>
                Les diplômés de la Faculté de Paris, c’est potentiellement un réseau d’entraide de 600 00 anciens. Le temps de réunir nos forces et de bâtir une communauté solide et dynamique est arrivé !
            </p>
            <p>Alors si tu veux nous rejoindre, n’hésite plus et</p>
            <p>
                <a class="bold" href="${pageContext.request.contextPath}/connexion">Connecte toi</a>
                ou
                <a class="bold" href="${pageContext.request.contextPath}/inscription">Inscription</a>
            </p>
        </article>
    </div></section>
</body>

</html>