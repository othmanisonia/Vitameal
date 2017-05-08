## Diagramme général

![Use case général](https://seikomi.github.io/Vitameal/Documentation/CasDUtilisations/uc_principal.svg)

## Diagramme afficher les menus générés 

![Use case afficher les menus générés](https://seikomi.github.io/Vitameal/Documentation/CasDUtilisations/AfficherMenu/uc_afficher_menu.svg)

## Descriptions textuelles

[UC200 - Afficher les menus générés](#uc200---afficher-les-menus-générés)  
[UC201 - Générér le bon de commande](#uc201---générés-le-bon-de-commande)  
[UC202 - Supprimer un plat](#uc202---donner-un-prix-chaque-repas)  
[UC203 - Exporter le menu affiché au format XML](#uc203---exporter-le menu-affiché-au-format-xml)

### UC200 - Afficher les menus générés

**Nom :** Modifier un plat existant  
**ID :** UC200  
**Description :** Le service restauration souhaite pouvoir voir le menu généré et selon son choix imprimer un bon  
de commande et/ou exporter le menu sous un autre format.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 08/05/2017  
**Acteurs :** Le service restauration, par heritage, le diététicien et le médecin  
**Pré-condition :** L'utilisateur doit être identifié  

**Scénario principal :**  
1. Le système affiche un menu pour un groupe de patient donné 
2. L'utilisateur peut choisir de générer et voir le bon de commande associé au menu affiché et l'utilisateur peut choisir de 
exporter le menu (pour un usage par une tierce application)

**Scénario alternatif :**  
1.a L'utilisateur peut changer de groupe de patient
1.b Le système n'arrive pas à récupérer les menu générés
1.c Le système ne possède pas de menu généré, il affiche un message d'information à l'utilisateur

**Post-Conditions:** Le menu est affiché. Un bon de commande est produit. Un export est produit.

### UC201 - Générér le bon de commande

**Nom :** Générér le bon de commande  
**ID :** UC201  
**Description :** Le service restauration souhaite pouvoir imprimer un bon de commande du menu affiché  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 08/05/2017  
**Acteurs :** Le service restauration, par heritage, le diététicien et le médecin  
**Pré-condition :** L'utilisateur doit être identifié  

**Scénario principal :**  
1. Le système propose la génération du menu si le prix de chaque plat a été renseigné  

**Scénario alternatif :**  
1. a. Le prix de chaque plat n'a pas été renseigné  

**Post-Conditions:** Le bon de commande et généré et affiché.

### UC202 - Donner un prix à chaque repas

**Nom :** Donner un prix à chaque repas  
**ID :** UC202  
**Description :** Le service restauration souhaite pouvoir donnée le pris de chaque plat composant un menu  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 08/05/2017  
**Acteurs :** Le service restauration, par heritage, le diététicien et le médecin  
**Pré-condition :** L'utilisateur doit être identifié  

**Scénario principal :**  
1. Le système propose de renseigner le prix du plat

**Scénario alternatif :** aucun 

**Post-Conditions:** Le prix du plat est renseigné

### UC203 - Exporter le menu affiché au format XML

**Nom :** Exporter le menu affiché au format XML  
**ID :** UC203  
**Description :** Le service restauration souhaite pouvoir exporté le menu affiché pour un usage dans une tierce 
application (comme le site internet de l'hopital par exemple)  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 08/05/2017  
**Acteurs :** Le service restauration, par heritage, le diététicien et le médecin  
**Pré-condition :** L'utilisateur doit être identifié  

**Scénario principal :**  
1. Le système exporte le menu affiché en XML

**Scénario alternatif :** échec de l'export 

**Post-Conditions:** Le menu est exportée au format XML
