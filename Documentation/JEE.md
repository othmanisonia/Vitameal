Vitameal Application
====================

Environnement logiciel:
-----------------------
[Eclipse Neon.3 IDE for Java EE Developers](http://www.eclipse.org/downloads/eclipse-packages/)  
[Serveur Tomcat 8.5.15](http://tomcat.apache.org/download-80.cgi#8.5.15)  
[Pilote JDBC Oracle](http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html)  
[Hibernate Version 5.2.10.Final](http://hibernate.org/orm/)  
[MAVEN 3.5.0](https://maven.apache.org/download.cgi)  

Archives:
---------
VitApp.war: Application Tomcat. Utilisation:  
- placer l'archive dans le dossier "webapps" de Tomcat.  
- lancer le serveur: "bin/startup.bat"  
- avec le navigateur aller à l'URL: localhost:8080/VitApp/index.html

Installation du pilote JDBC Oracle:
-----------------------------------
* Télécharger "ojdbc6.jar" depuis le lien précédent.  
* déplacer ce fichier dans: <chemin d'accès au jre>\lib\ext\ojdbc6.jar  
* Dans Eclipse, faire un clic droit sur le projet, puis sélectionner: Build Path / Configure Build Path / onglet "Libraries" / Add Library / Connectivity Driver Definition / New Driver Definition / Vendor Filter / Oracle / Oracle Thin Driver | system version 11 / JAR list tab / ojdbc?.jar / Edit JAR / Select ojdbc6.jar / Properties tab /  
    * Catalog: USER  
    * Connection URL: jdbc:oracle:thin:@localhost:1521:xe  
    * Database Name: xe  
    * Driver Class: oracle.jdbc.OracleDriver  

puis "OK".  
Window -> Preferences -> Validation, JPA Validator, turn off for Build.

MAVEN:
------
Ajouter le chemin d'accès à MAVEN dans le "PATH": <chemin maven>\apache-maven-3.5.0\bin  
Puis taper, en ligne de commande:  
mvn install:install-file -Dfile=<chemin d'accès au jre>\lib\ext\ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar

Oracle:
-------
En "_SQL command line_":  
create user VitUse identified by xxxxxxx;

grant CREATE SESSION, ALTER SESSION, CREATE DATABASE LINK, -
  CREATE MATERIALIZED VIEW, CREATE PROCEDURE, CREATE PUBLIC SYNONYM, -
  CREATE ROLE, CREATE SEQUENCE, CREATE SYNONYM, CREATE TABLE, - 
  CREATE TRIGGER, CREATE TYPE, CREATE VIEW, UNLIMITED TABLESPACE -
  to VitUse;

_Pour remplacer le port 8080 (en confli avec Tomcat):_  
connect;  
SYSTEM + mdp  
Exec DBMS_XDB.SETHTTPPORT(3010);  

Périmètre:
----------
Logging utilisateurs et accès à la page de travail.  
Utilisateur reconnus:
- VitaDiet --> mdp: vitadiet
- VitaMed  --> mdp: vitamed
- Nicolas  --> mdp: nicolas
- Sonia    --> mdp: sonia
- Jean-Felix --> mdp: jeanfelix  

Pour le moment, ces  informations ce trouvent en dur dans le code, voir "ConnexionForm.java".

Le formulaire de saisie du profil patient est disponible. Pour le moment le résultat de la saisie est renvoyé dans la console Eclipse.
