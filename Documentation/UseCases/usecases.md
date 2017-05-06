# Cas d'utilisations du logiciel Vitameal

## Diagramme général

![Use case général](https://seikomi.github.io/Vitameal/Documentation/UseCases/image/UC_main.svg)

## Diagramme composer les plats

![Use case général](https://seikomi.github.io/Vitameal/Documentation/UseCases/image/UC_composer_un_plat.svg)

## Descriptions textuelles

### UC100 - Composer les plats

**Acteurs concernés :** Le diététicien  
**Description :** Le diététicien souhaite pouvoir élaborer les plats composant une journée (petit-déjener, déjeuner, 
souper) en renseignant leur compositions.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 06/05/2017 (première version)  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  
**Démarrage :** L'utilisateur demande la page "Composition de plat"

#### Scénarios nominal

1. Le système affiche la liste des plat déjà créer
2. L'utilisateur choisi une action :  
  a. L'utilisateur choisi de modifier un plat voir (UC101)  
  b. L'utilisateur choisi de crée un nouveau plat (UC102)  
  c. L'utilisateur choisi de supprimer un plat déjà existant (UC103)
3. Le système renvoi vers l'ecran choisi : "Modifier un plat", "Créer un plat" ou affiche une confirmation pour 
la suppression d'un plat 

#### Scénarios d'exception

1. z Le système n'obtient pas la liste des ingrédients


### UC101 - Modifier un plat existant

**Acteurs concernés :** Le diététicien  
**Description :** Le diététicien souhaite pouvoir modifier la composition d'un plat.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 06/05/2017 (première version)  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  
**Démarrage :** L'utilisateur demande la page "Modification d'un plat"

#### Scénarios nominal

1. Le système restaure la composition du plat sélectionner et va à l'etape 3 du cas d'utilisation "Créer un nouveau plat"


#### Scénarios d'exception

3. z Le système n'obtient pas la composition du plat sélectionner


### UC102 - Créer un nouveau plat

**Acteurs concernés :** Le diététicien  
**Description :** Le diététicien souhaite pouvoir créer la composition d'un nouveau plat de type petit-déjeuner, déjeuner ou souper.
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 06/05/2017 (première version)  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  
**Démarrage :** L'utilisateur demande la page "Création d'un plat"

#### Scénarios nominal

1. Le système affiche une page permettant d'entrer la composition d'un plat
2. L'utilisateur choisi le type de plat (petit-déjener, déjeuner, souper)
3. Le système propose à l'utilisateur une liste de composante à remplir en fonction du type de plat choisie
4. L'utilisateur choisi les ingrédients qu'il veut mettre dans chaque composantes
5. L'utilisateur valide son choix
6. Le système enregistre le nouveau plat dans sa liste de plats éligible a la composition des menus

#### Scénarios alternatif

3. a. L'utilisateur change de type de plat en cours d'elaboration  
3. b. Le système propose à l'utilisateur la liste de composante correspondante à son nouveau choix (retour etape 3.)  
5. a. L'utilisateur annule la composition du plat

#### Scénarios d'exception

3. z Le système n'obtient pas la composition du liste des ingrédients

### UC103 - Supprimer un plat

**Acteurs concernés :** Le diététicien  
**Description :** Le diététicien souhaite pouvoir supprimer un plat.  
**Auteur :** Nicolas SYMPHORIEN  
**Dates(s) :** 06/05/2017 (première version)  
**Pré-condition :** L'utilisateur doit être identifié en tant que diététicien (Voir cas d'utilisation "S'autentifier")  
**Démarrage :** L'utilisateur veut supprimer un plat préalablement sélectionner

#### Scénarios nominal

1. Le système affiche un message d'avertissement avant la suppression
2. L'utilisateur confirme ou non la suppression
3. Le système supprime le plat de sa liste des plats

#### Scénarios d'exception

3. z Le système ne réussi pas à supprimer le plat