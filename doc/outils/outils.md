# L'usine logicielle de Vitameal

L'usine logicielle de Vitameal répond aux exigences suivantes :

* respecter les régles de qualitées ;
* avoir une documentation claire et intégrée au projet ;
* gerer les erreurs et assurer leurs suivies ;
* versionnionner le code source et la documentation ;
* avoir un espace commun accessible à distance ;
* gérer un espace de livraison génerant des indicateurs de santé sur le projet ;
* avoir un outil de conception UML couvrant la methode minimal UML ;
* gérer la planification du projet.

## Outils utilisés

Les outils utilisées par l'usine logicielle de Vitameal se sépare en deux catégories :

* Le côté poste de développement qui correspond aux outils installés par chaque développeur sur sa machine ;
* Le côté espace d'integration continue qui correspond aux outils composant l'espace communs de collaborations.

La documentation du projet est assuré par l'utilisation de la syntaxe *markdown* integré à l'outil *GitHub* et le language de génération des livrables est *LaTex*.

Le language cible de cette usine est Java, mais elle peut facilement être adapté à d'autre language.

### Côté poste de développement

* **Eclipse** comme IDE pour écrire/éditer le code de l'application ;
* **Maven** comme constructeur du projet (gestion des dépendances, automatisation de la construction
* **JUnit** pour ecrire les tests unitaires de l'application et **Codertura** pour analyser la couverture du projet par
 ces tests ;
* **Git** pour versionner les sources du projet ;
* **StarUML** pour modéliser selon le standart UML le projet ;
* **GanttProject** pour plannifier le projet avec un diagramme de Gantt ;
* **TEXMaker** pour éditer les fichiers`.tex` avec un comportement proche des *WYSIWYG* (optionnel).

### Côté espace d'integration continue

* **GitHub** comme gestionnaire à distance du repositorie Git principal, comme tracker de bug et comme affichage visuel
 des taches à faire ;
* **Jenkins** comme serveur d'intégration continue ;
* **SonarQube** comme analyseur de qualité du code.

## Schema de fonctionnement

![Usine logicielle de Vitameal](https://seikomi.github.io/Vitameal/doc/outils/usine_vitameal.svg)

## Installation des outils du poste développeur

`TODO`
