
# Sommaire 

- [Cadrage & périmètre](#cadrage--périmètre) 
     

- [Expression fonctionnelle du besoin](#expression-fonctionnelle-du-besoin)
  - [Modélisation conceptuelle et logique des données](#modélisation-conceptuelle-et-logique-des-données)  
  - [Répartition des tâches](#répartition-des-tâches)

- [Méthodes et contraintes ](#méthode-et-contraintes) 
  -[Méthode](#méthode)
- [Délais et parties prenantes ](#délais-et-parties-prenantes) 
   - [Délais](#délais)
   - [Parties prenantes](#parties-prenantes)
- [Outils](#outils)

- [Tests](#paragraphe5)

- [Patterns de programmation](#pattern-de-programmation)

- [Conclusion](#conclusion)

- [Bibliographie ](#bibliographie)
  

# Cadrage & périmètre

L’IUT Paris Descartes a décidé de monter un réseau alumni avec ses anciennes promos, élèves / professeurs. Afin de maintenir le contact et d’organiser des événements / rencontres universitaires avec ceux-ci sous forme de réseau social. 

# Expression fonctionnelle du besoin
## Modélisation conceptuelle et logique des données 
MCD / MLD 
(image)




## Répartition des tâches
| Fonction                    | Attribution                                       | Fonctionnelle (oui/non) |Règle (secondaire) |
|:----------------------------| :-------------------------------------------------|:------------------------|:------------------|
| `Création utilisateur`      | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Connexion`                 | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Déconnexion`               | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Inscription`               | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Création d'évènements`     | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Consultation d'évènements` | [@mathieudielna](https://github.com/mathieudielna)| Oui                     |                   |
| `Modification d'évènements` | [@mathieudielna](https://github.com/mathieudielna)| En cour..               |                   |
| `Recherche d'évènements`    | [@mathieudielna](https://github.com/mathieudielna)| En cour...              |                   |
| `Jeux de Test`              | [@mathieudielna](https://github.com/mathieudielna)| **Non Fait**            |                   |
# Méthode et contraintes
## Méthode

Nous avons choisi d’utiliser la méthode Kanban pour ce projet. En effet, cette méthode nous permet de travailler de façon organisée. 

>Le kanban fait partie des méthodes agiles, il permet de rendre les processus de travail plus flexible. 
>Les tâches sont divisées en petites étapes à traiter les unes à la suite des autres.
>Cette méthode exige que chaque étape soit achevée avant qu’il ne soit possible de se consacrer à une nouvelle. 

Pour mettre en place cette méthode nous avons choisi l’outil Trello. 
![](https://github.com/mathieudielna/alumni/blob/master/documentation/Trello.PNG)

## Contraintes
Les contraintes liées aux projets sont nombreuses. Pour cela, nous pouvons les classer en catégorie.  
- Outils rédactionnels & organisationnels  : utilisation markdown, trello, git 
- Outils de Base de données : mysql
- Langage de programmation : Java, Spring
# Délais et parties prenantes
## Délais 
Le projet est à livrer le 14 mars 2022
## Parties prenantes 
| Personnes                | Fonction                                        
| :----------------------- | :---------------|
| Sabrina Sandirasegarane  | Maître d’ouvrage|
| Davia Moujabber          | Maître d’ouvrage|
| Aurore Leclerc           | Développeur     |
| Mathieu Dielna           | Développeur     | 
| Lucas Juillard           |Développeur      | 
| Vincent Boutour          |Investisseur     |
| les étudiants et professeurs de l’IUT de Paris |Utilisateurs|


# Outils
- Outils rédactionnels & organisationnels  : utilisation markdown, trello, git 
- Outils de Base de données : mysql
- Langage de programmation : java,   
- Gestion des dépendances :  maven
- Outils de programmation : débuggueur
- Framework: spring Vue.js 
- Outils diverses : documentation, internet
- Patterns de programmation : MVC
# Tests


# Pattern de programmation

L'infrastructure choisi pour cette application est le pattern de programmation MVC ( modèle vue controleur)
L'infrastruction se divise en plusieurs fichiers : 
- le repository qui  gère la liaison entre l'application et la Base de donnée. Pour chacun des objets, nous avons un repository.
- le modèle : qui represente les objets 
- le service qui permet la connexion entre le repository et le controleur 
- le controleur qui gère les affichages et les différentes liaisons : les données envoyées aux vues par le biais du service,les données que l'on va insérer dans le repository par le biais du service mais aussi par le biais du validator. lorsque l'on va soumettre un formulaire, le controleur va le soumettre au validator, si le validator indique que les conditions sont bonnes alors le code continue de s'exécuter et on est envoyé au service qui va traiter la demande et ensuite l'enregistrer dans le repository. En cas d'erreur, on a un dossier ressource qui contient en même temps, les propriétés de l'application ( type chemin pour trouver les vues etc.) et les messages d'erreur

Dans un autre dossier, nous avons le web-app qui contient plusieurs fichiers : 
-    le web-inf qui contient toutes les pages jsp 
-    Ressources : où il y a le CSS, JS etc.
-    Test afin de tester les fonctions de l'application 
-    le  target où il y a tous les fichier en .class, ce sont des exécutables 

- on a aussi un fichier pom.xml pour gérer toutes les dépendances de l'application ainsi que dans le fichier maven. 
- Application avec tous les réglages de bases 
- et enfin nous avons le securityconfig qui gère les sessions, les accès aux pages, les endroits pour la connexion etc. 

Chaque fichier ou dossier à sa propre fontionnalité, nous avons choisi ce type d'infrastructure afin de faciliter les modifcations avenirs, la compréhension et le retraitement en cas de suppression ou modification d'une fonctionnalité. 

# Conclusion 
- Problèmes rencontrés , solutions trouvées 
- Points perfectibles 
- Reste à faire 
- Points non solutionnés 
- retours personnels sur le module :
Ce projet nous a permis de montrer nos compétences mais aussi d'apprendre de nouvelles notions. 
Grâce au module, nous avons pu apprendre à mieux travailler en équipe via github.   

# Bibliographie 
- [Github](https://github.com/mathieudielna/alumni)
- [Trello](https://trello.com/b/Kce0Yf2I/alumni)
- [Aide alias de commande](https://github.com/ViBiOh/dotfiles/blob/main/symlinks/gitconfig)

- [Cours de Génie Logiciel](l3miage.fr)
- [Aide Markdown](https://github.com/InseeFrLab/utilitR/blob/master/03_Fiches_thematiques/Fiche_rmarkdown.Rmd)
- [Editeur Markdown](readme.so)


