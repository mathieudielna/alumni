<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8"/>
        <title>Inscription</title>
    </head>
    <body>
        <form action="@{/acountCreation}" method="post">
            <input type="text" id="login" class="fadeIn second" name="login" placeholder="pseudo">
            <input type="text" id="prenom" class="fadeIn second" name="prenom" placeholder="prenom">
            <input type="text" id="nom" class="fadeIn second" name="nom" placeholder="nom">
            <input type="number" id="anneePromotion" class="fadeIn second" name="anneePromotion" placeholder="anneePromotion">
            <input type="password" id="password" class="fadeIn third" name="password" placeholder="Mot de passe">

            <input type="submit" class="fadeIn fourth" value="inscription">
        </form>

        <!--Erreur-->
        <div class="alert alert-error">
            <c:if test="${param.error}" >Informations incomplètes et/ou erronées</c:if>
        </div>
        <div class="alert alert-error">
            <c:if test="${param.success}">Votre compte a été correctement crée</c:if>
        </div>
    </body>
</html>