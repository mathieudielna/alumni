
# Sommaire 

- [Cadrage & périmètre](#cadrage--périmètre) 
     

- [Expression fonctionnelle du besoin](#expression-fonctionnelle-du-besoin)
  - [Modélisation conceptuelle et logique des données](#modélisation-conceptuelle-et-logique-des-données)  
  - [Répartition des tâches](#répartition-des-tâches)

- [Méthodes et contraintes ](#méthode-et-contraintes) 
  - [Méthode](#méthode)
- [Délais et parties prenantes ](#délais-et-parties-prenantes) 
   - [Délais](#délais)
   - [Parties prenantes](#parties-prenantes)
- [Outils](#outils)

- [Tests](#paragraphe5)

- [Patterns de programmation](#pattern-de-programmation)

- [Conclusion](#conclusion)

- [Bibliographie ](#bibliographie)
  

# Cadrage & périmètre

L’IUT Paris Descartes a décidé de monter un réseau alumni avec ses anciennes promos, élèves et professeurs. Afin de maintenir le contact et d’organiser des événements et rencontres universitaires avec ceux-ci sous forme de réseau social. Nous avons choisi ce sujet car nous avons aimé cette idée et nous trouvons ce projet particulièrement intéressant et potentiellement utile à l'avenir.  

# Expression fonctionnelle du besoin

## Modélisation conceptuelle et logique des données 
Afin de schématiser nos données et leurs liens entre elles, nous avons choisi de les représenter sous forme de MCD/MLD.  
#### Modèle conceptuel des données 
![](https://github.com/mathieudielna/alumni/blob/master/documentation/mcd%20(1).png)

#### Modèle logique des données  
![](https://github.com/mathieudielna/alumni/blob/master/documentation/mld%20(1).png)




## Répartition des tâches

#### Fonctionnalité 
| Fonction                    | Attribution                                       | Fonctionnelle (oui/non) |Règle (secondaire) |
|:----------------------------| :-------------------------------------------------|:------------------------|:------------------|
| `Création utilisateur`      | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Connexion`                 | [@auroreLeclerc](https://github.com/auroreLeclerc)| Oui                     |                   |
| `Déconnexion`               | [@Lucas Juillard](https://github.com/Backqu)       | Oui                     |                   |
| `Inscription`               | [@auroreLeclerc](https://github.com/auroreLeclerc)| Oui                     |                   |
| `Création d'évènements`     | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Consultation d'évènements` | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Modification d'évènements` | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Recherche d'évènements`    | [@Lucas Juillard](https://github.com/Backqu)       | Non                    |                   |


#### Rédaction

En tant que maître d'ouvrage, nous avons suivi le projet tout au long de sa confection et avons accompagné nos développeurs dans le design, la charte graphique mais aussi les fonctionnalités de l'application. 

# Méthode et contraintes
## Méthode

Nous avons choisi d’utiliser la méthode Kanban pour ce projet. En effet, cette méthode nous permet de travailler de façon organisée. 

>Le kanban fait partie des méthodes agiles, il permet de rendre les processus de travail plus flexible. 
>Les tâches sont divisées en petites étapes à traiter les unes à la suite des autres.
>Cette méthode exige que chaque étape soit achevée avant qu’il ne soit possible de se consacrer à une nouvelle. 

Pour mettre en place cette méthode nous avons choisi l’outil Trello. 
En effet sur Trello, nous pouvons faire des user stories mais également voir ce qui a déjà été fait ou déjà été affecté à quelqu'un. Cette méthode d'organisation nous a permis de voir l'avancée du projet chaque semaine et d'adapter la quantité de tâches en cas dépassement de délai sur le développement d'une fonctionnalité par exemple.

![](https://github.com/mathieudielna/alumni/blob/master/documentation/Trello.PNG)

## Contraintes
Les contraintes liées aux projets sont nombreuses. Pour cela, nous pouvons les classer en catégorie.  
- Outils rédactionnels & organisationnels  : utilisation de Markdown, Trello et Git 
- Outils de gestion des données : MySQL
- Langage de programmation : Java, Spring
# Délais et parties prenantes
## Délais 
Le projet est à livrer le 7 mars 2022.
## Parties prenantes 
| Personnes                | Fonction                                        
| :----------------------- | :---------------|
| Sabrina Sandirasegarane  | Maître d’ouvrage|
| Davia Moujabber          | Maître d’ouvrage|
| Aurore Leclerc           | Développeuse    |
| Mathieu Dielna           | Développeur     | 
| Lucas Juillard           |Développeur      | 
| Vincent Boutour          |Investisseur     |
| les étudiants et professeurs de l’IUT de Paris |Utilisateurs|


# Outils
- Outils rédactionnels & organisationnels  : utilisation de Markdown, Trello et Git 
- Outils de Base de données : MySQL
- Langage de programmation : Java   
- Gestion des dépendances :  Maven
- Outils de programmation : IntelliJ
- Framework: Spring
- Outils diverses : documentation, internet
- Patterns de programmation : MVC
# Tests

Les tests permettent de valider qu'une fonctionnalité qui a été développée est opérationnelle. Pour cela, nous avons effectué différents tests unitaires (test sur les accès , les différentes fonctionnalités). Nous nous sommes servis de MockMVC avec le Spring test et nous avons simulé l'environnement de notre application :
##### Test sur les évènements : 
- Test GetEvenement_succes : accès à cette page avec succès 
- Test testauthentificationAjouterevenment_success() : authentification avec succès
- Test tesPostEvenement_sucess : post avec des données réelles en vérifiant qu'il n'y a pas d'erreur, on peut également tester ces champs avec des erreurs en espérant qu'il détecte l'erreur --> TestPostevenement_error 

Notre application est composée d'une base de données, alors nous avons testé nos repositories également ainsi que les fonctions qui le composent comme la création d'un évènement, l'enregistrement ou la recherche d'un évènement,vérification sur le rôle que le findRoleByName soit bon, qu'il détecte bien les erreurs.

Les tests sont assez répétitifs pour les autres entités telles que les utilisateurs, etc...

# Pattern de programmation

L'infrastructure choisi pour cette application est le pattern de programmation MVC (Modèle Vue Controleur)
L'infrastructure se divise en plusieurs fichiers : 
- le repository qui  gère la liaison entre l'application et la base de données. Pour chacun des objets, nous avons un repository.
- le modèle represente les objets.
- le service permet la connexion entre le repository et le controleur.
- le controleur gère les affichages et les différentes liaisons : les données envoyées aux vues par le biais du service, les données que l'on va insérer dans le repository par le biais du service mais aussi par le biais du validator. Lorsque l'on va soumettre un formulaire, le controleur va le soumettre au validator, si le validator indique que les conditions sont bonnes, alors le code continuera de s'exécuter et on est envoyé au service qui va traiter la demande. Ensuite, il sera enregistré dans le repository. En cas d'erreur, on a un dossier ressource qui contient en même temps, les propriétés de l'application ( type chemin pour trouver les vues etc.) et les messages d'erreur.

Dans un autre dossier, nous avons le web-app qui contient plusieurs fichiers : 
-    le web-inf qui contient toutes les pages jsp 
-    Ressources : où il y a le CSS, JS etc.
-    Test afin de tester les fonctions de l'application 
-    le  target où il y a tous les fichier en .class, ce sont des exécutables 

- on a aussi un fichier pom.xml pour gérer toutes les dépendances de l'application ainsi que dans le fichier maven. 
- Application avec tous les réglages de bases 
- et enfin nous avons le securityconfig qui gère les sessions, les accès aux pages, les endroits pour la connexion etc. 

Chaque fichier ou dossier a sa propre fontionnalité, nous avons choisi ce type d'infrastructure afin de faciliter les modifcations avenirs, la compréhension et le retraitement en cas de suppression ou modification d'une fonctionnalité. 

# Conclusion 
- Problèmes rencontrés , solutions trouvées 
- Points perfectibles 
- Reste à faire 
- Points non solutionnés 
- retours personnels sur le module :
Ce projet nous a permis de montrer nos compétences mais aussi d'apprendre de nouvelles notions. 
Grâce au module, nous avons pu apprendre à mieux travailler en équipe via github. 

Ce projet nous a permis de mettre en place les notions théoriques à la pratique. En effet, l'utilisation du Git étant assez flou pour la plupart des membres de l'équipe a permis de mieux comprendre le fonctioennement et l'utilisation de Git. Il en est de même pour la rédaction de la documentation du projet en Markdown qui a été une nouveauté pour les maitres d'ouvrages. 

Il est toujours difficile de réaliser un travail en groupe mais nous avons pu avancer ensemble sur la réalisation de ce projet tout en respectant les méthodes d'organisation que nous avons mise en place au début du projet et nous avons atteint toutes les objectifs principaux au niveau des fonctionnalités. 

# Bibliographie 
- [Github](https://github.com/mathieudielna/alumni)
- [Trello](https://trello.com/b/Kce0Yf2I/alumni)
- [Aide alias de commande](https://github.com/ViBiOh/dotfiles/blob/main/symlinks/gitconfig)

- [Cours de Génie Logiciel](l3miage.fr)
- [Aide Markdown](https://github.com/InseeFrLab/utilitR/blob/master/03_Fiches_thematiques/Fiche_rmarkdown.Rmd)
- [Editeur Markdown](readme.so)


