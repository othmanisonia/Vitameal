# Cas d'utilisations du logiciel Vitameal

## Diagramme général

![Use case général](https://seikomi.github.io/Vitameal/Documentation/CasDUtilisations/uc_principal.svg)

## Diagramme composer les plats

![Use case composer les plats](https://seikomi.github.io/Vitameal/Documentation/CasDUtilisations/CompositionPlat/uc_composer_un_plat.svg)

## Descriptions textuelles

[UC100 - Composer les plats](#uc100---composer-les-plats)  
[UC101 - Modifier un plat existant](#uc101---modifier-un-plat-existant)  
[UC102 - Créer un nouveau plat](#uc102---créer-un-nouveau-plat)  
[UC103 - Supprimer un plat](#uc103---supprimer-un-plat)  
[UC202 - Donner un prix à chaque repas](#uc202---donner-un-prix-à-chaque-repas)  

### UC100 - Composer les plats

**Nom:** Composer les plats  
**ID:** UC100  
**Description :** Le diététicien souhaite pouvoir élaborer les plats composant une journée (petit-déjener, déjeuner, 
souper) en renseignant leur compositions.  
**Auteur :** Nicolas SYMPHORIEN  
**Date :** 08/05/2017  
**Acteurs :** Le diététicien  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  

**Scénario principal:**  
1. Le système affiche la liste des plat déjà créer
2. L'utilisateur choisi une action :  
  a. L'utilisateur choisi de modifier un plat voir (UC101)  
  b. L'utilisateur choisi de crée un nouveau plat (UC102)  
  c. L'utilisateur choisi de supprimer un plat déjà existant (UC103)
3. Le système renvoi vers l'ecran choisi : "Modifier un plat", "Créer un plat" ou affiche une confirmation pour 
la suppression d'un plat  

**Scénario alternatif:**  
1. a Le système n'obtient pas la liste des ingrédients  

**Post-Conditions:** L'utilisateur est re-dirigé vers sa selection.

### UC101 - Modifier un plat existant

**Nom:** Modifier un plat existant  
**ID:** UC101  
**Description :** Le diététicien souhaite pouvoir modifier la composition d'un plat.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates :** 08/05/2017  
**Acteurs :** Le diététicien  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  

**Scénario principal :**  
1. Le système restaure la composition du plat sélectionner et va à l'etape 3 du cas d'utilisation "Créer un nouveau plat"  

**Scénario alternatif :**  
1. a. Le système n'obtient pas la composition du plat sélectionner

**Post-Conditions:** Le plat est modifié et la modification enregistrée

### UC102 - Créer un nouveau plat

**Nom :** Créer un nouveau plat  
**ID :** UC102  
**Description :** Le diététicien souhaite pouvoir créer la composition d'un nouveau plat de type petit-déjeuner, déjeuner ou souper.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates :** 08/05/2017  
**Acteurs :** Le diététicien  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  

**Scénarios nominal :**  
1. Le système affiche une page permettant d'entrer la composition d'un plat
2. L'utilisateur choisi le type de plat (petit-déjener, déjeuner, souper)
3. Le système propose à l'utilisateur une liste de composante à remplir en fonction du type de plat choisie
4. L'utilisateur choisi les ingrédients qu'il veut mettre dans chaque composantes
5. L'utilisateur valide son choix
6. Le système enregistre le nouveau plat dans sa liste de plats éligible a la composition des menus

**Scénarios alternatif :**  

3. a. L'utilisateur change de type de plat en cours d'elaboration  
3. b. Le système propose à l'utilisateur la liste de composante correspondante à son nouveau choix (retour etape 3.)  
3. c. Le système n'obtient pas la composition du liste des ingrédients  
5. a. L'utilisateur annule la composition du plat

**Post-Conditions:** Le plat est crée et enregistré

### UC103 - Supprimer un plat

**Nom :** Supprimer un plat  
**ID :** UC103  
**Description :** Le diététicien souhaite pouvoir supprimer un plat.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates :** 08/05/2017  
**Acteurs concernés :** Le diététicien  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  

**Scénarios nominal :**  

1. Le système affiche un message d'avertissement avant la suppression
2. L'utilisateur confirme ou non la suppression
3. Le système supprime le plat de sa liste des plats

**Scénarios alternatif :**  

3. a. Le système ne réussi pas à supprimer le plat

**Post-Conditions:** Le plat est supprimé

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
