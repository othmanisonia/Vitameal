Vitameal Application
====================

Environnement logiciel:
-----------------------
[Eclipse Neon.3 IDE for Java EE Developers](http://www.eclipse.org/downloads/eclipse-packages/)  
[Serveur Tomcat 8.5.15](http://tomcat.apache.org/download-80.cgi#8.5.15)  

Archives:
---------
VitApp.zip: Projet Eclipse  
VitApp.war: Application Tomcat. Utilisation:  
- placer l'archive dans le dossier "webapps" de Tomcat.  
- lancer le serveur: "bin/startup.bat"  
- avec le navigateur aller à l'URL: localhost:8080/VitApp/index.html

Périmètre:
----------
Logging utilisateurs et accès à la page de travail.  
Utilisateur reconnus:
- VitaDiet --> mdp: vitadiet
- VitaMed  --> mdp: vitamed
- Nicolas  --> mdp: nicolas
- Sonia    --> mdp: sonia
- Jean-Félix --> mdp: jean-félix  

Pour le moment, ces  informations ce trouvent en dur dans le code, voir "ConnexionForm.java".
