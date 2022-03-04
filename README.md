## Authors

- [@Mathieu Dielna](https://github.com/mathieudielna)
- [@Sabrina Sandirasegarane](https://github.com/sabrinasandi)
- [@Lucas Juillard](https://github.com/Backqu)
- [@Aurore Leclerc](https://github.com/auroreLeclerc)
- [@Davia Moujabber](https://github.com/Moujabber)


# Cahier des charges : 

### Cadrage & périmètre :

- L’IUT Paris Descartes a décidé de monter un réseau alumni avec ses anciennes promos, élèves / professeurs. Afin de maintenir le contact et d’organiser des événements / rencontres universitaires avec ceux-ci sous forme de réseau social. 

![Logo](https://iutparis-seine.u-paris.fr/wp-content/uploads/sites/3/2020/12/UniversiteParis_IUTParis-RdS.jpg)

## Running Application

1. Configurer le fichier  ``` application.properties``` avec votre configuration de base de donnée

2. Executer le script de base de donnée ```ressources/db/create-db.sql``` dans votre système de base de donnée (ici script mysql)

3. Run 
```bash
  mvn install
```
4. Creer les roles ```ROLE_ADMIN```et ```ROLE_USER```en base de donnée dans la table ```role ```
5. Run votre application et inscrire votre premier utilisateur ```localhost:(port)/inscription```
6. Ajouter le role admin à votre utilisateur 
    
    6.1. Soit ajouter le role via base de donnée via la table ```utilisateur_role```
    
    6.2 Soit dans le ```service/UtilisateurServiceImpl``` decommenter la ligne de la fonction ```ajouterUtilisateur```
