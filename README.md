# Projet Vitameal

Bienvenue sur le projet Vitamean. Ce projet est réaliser dans le cadre de la première année de formation de l'Ipst-Cnam de Toulouse.

## Problème

L’élaboration de menu dans un hôpital pour la restauration des patients est une tâche complexe, et doit tenir compte des différentes pathologies rencontrées. Faute de moyens (temps et argent) seules quelques grandes lignes de restauration sont retenues ; alors qu’idéalement, chaque patient devrait pourvoir avoir un repas adapté à sa pathologie.

## Solution envisagée 

Mise en place d’un outil informatique permettant d’élaborer les menus des patients en fonction des profils diététiques, paramétré par le corps médical.

## Equipe projet

|Nom       |Prenom    |Compétences|Rôle              |Mail                        |
|----------|----------|-----------|------------------|----------------------------|
|Othamani  |Sonia     |BP PM      |`TODO` *à définir*|oth.sonia@gmail.com         |
|Symphorien|Nicolas   |SI PG DO   |`TODO` *à définir*|nicolas.symphorien@gmail.com|
|Benitez   |Jean-Félix|PM PG      |`TODO` *à définir*|jeanfelix.benitez@gmail.com |


**BP** : Métier **PM** : Gestion / Animation **SI** : Processus d'informatisation **PG** : Programmation **DO** : Documentation / Outils  

## Outils et techniques

- Base de données : `TODO` *technologie à définir*
- Back-end : JavaEE `TODO` *à debattre*
- Front-end : `TODO` *technologie à définir*

## Cas d’utilisation

- Enregistrement d’un nouveau patient
- Modification d’un patient
- Retrait d’un patient
- Enregistrement d’un nouveau profil diététique
- Modification d’un profil diététique
- Retrait d’un profil diététique
- Enregistrement d’un plat
- Modification d’un plat
- Retrait d’un plat
- Génération des menus
- Liste des achats, pour les menus générés
- Liste des plats à préparer
- Liste des menus par patients

---

## Infomations complémentaires

### Diététique

#### Profil patient

Il est renseigné par le dététicien sous les directives du médecin.
- Allergies
- Affections (induisant une diététique particulière)
  - Contre-indications (repas sans …)
    - Gluten
    - Produits laitiers
    - Oeufs
    - Arachide
    - Sel
    - Alcool
    - Iode
  - Traitement en cours: si cortisone --> régime sans sel.
- Aliments sous forme
  - Liquide
  - Mixé
  - Solide
  - Liquide et solide
  - Chaud
  - Froid
  - Boissons gélifiées (fausse route)
- Repas
  - Hyper / hypo protéiné
  - Hyper / hypo calorique
- Physique (pour évaluer le besoin énergétique)
  - Poids
  - Taille
  - Age
  - Sexe
- Tempérament (Manifestement pas utilisé...)
  - Nerveux (sec et froid) est dominé par l'élément de la terre.
  - Bileux (sec et chaud) est dominé par l'élément du feu.
  - Sanguin (humide et chaud) est dominé par l'élément de l'air.
  - Lymphatique (humide et froid) est dominé par l'élément de l'eau.
	
#### Nutriments

Il semblerait que nous n'ayons pas besoin de rentrer dans ces considérations là.
- Protéines
- Lipides (Corps gras) : 1 g de lipides procure 9 kcal, soit 38 kJ 
- Glucides (Sucres) : 1 g de glucides procure 4 kilocalories (kcal), soit 17 kilojoules (kJ)
- Protides (Acides aminés) : 1 g de protides procure 4 kcal, soit 17 kJ
- Vitamines
- Minéraux
  - Calcium
  - Phosphore
  - Potassium
  - Chlore
  - Sodium
  - Magnésium
- Oligo-éléments
  - Fer
  - Zinc
  - Cuivre
  - Manganèse
  - Iode
  - Molybdène
- Fibres alimentaires

#### Plats

- Catégorie
  - Entrée
  - Plat
  - Dessert
- Composition (liste et proportion des ingrédients)
- Forme solide ou liquide
- Chaud ou Froid
- Nombre de calories pour 100g (la quantité délivrée devrait, dans la mesure du possible, pouvoir être variable).
- Analyse en termes de nutriments.
- Aliments de saison : il faudra connaitre par saisons la liste des aliments disponibles

#### Repas

Devrait être composé de :
- Lipides : 35% à 40% des calories totales.
- Glucides : < 55 % des calories totales.
Gouter matin / après-midi.

#### Sources

https://fr.wikipedia.org/wiki/Diététique  
https://fr.wikipedia.org/wiki/Nutriment  
https://fr.wikipedia.org/wiki/Tempérament_(psychologie)  
https://fr.wikipedia.org/wiki/Nutrition  
https://fr.wikipedia.org/wiki/Protide  
