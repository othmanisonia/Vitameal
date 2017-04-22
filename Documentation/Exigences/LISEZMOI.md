EXIGENCES
=========
Composition
-----------
Chaque exigence est composée de 10 champs:
- **numéro:** formé comme suit REQ_xxxx, où x est un chiffre de 0 à 9
- **Titre:** titre ou description courte; **Obligatoire**
- **Corps:** expression de l'exigence; **Obligatoire**
- **Type:** type de l'exigence; **Obligatoire**
  - Utilisateur
  - Métier
  - Technique
  - Fonctionnelle
  - Non fonctionnelle
  - Contrainte
  - Ergonomie
  - Robustesse
  - Performance
  - Sécurité
- **Origine:** D'où vient une exigence ? (Quel besoin cette exigence couvre-t-elle ? Pourquoi a-t-on conçu la solution de cette manière et quelles étaient les autres possibilités ?)
- **Version:** ou niveau de maturité, voir [Capability Maturity Model](http://users.polytech.unice.fr/~hugues/GL/CMM/cmm.html)
  - Initial
  - Reproductible
  - Défini
  - Maîtrisé
  - Optimisé
- **Priorité:** priorité selon la méthode MoSCoW
  - Must
  - Should
  - Could
  - Won't
- **Validée:** l'exigences a-t-elle été validée ? (Oui / Non)
- **Lien:** il peut y en avoir plusieurs; ils sont regroupés dans l'élément "Liens".
- **Test:** Définition du test qui validera l'exigence.

Edition
-------
Elle peut ce faire avec "Eclipse", qui permet la validation (par rapport au schéma) au fur et à mesure de la saisie.
Une commodité dans "Eclipse" est la liste des énumération disponible sur un élément, en tapant Ctrl + Espace dans l'élément.

Extraction
----------
Elle ce fait à l'aide du script XSLT "Exigences.xsl", lequel génère le fichier "Exigences.tex" qui sera inclu automatiquement dans le rapport du projet.
J'utilise le processeur XSLT de "[Saxonica](http://www.saxonica.com/download/opensource.xml)" qui fonctionne avec Java. Le fichier "gen.cmd" permet de lancer la génération; avant il faut mettre à jour la variable d'environnement "XsltProcPath" avec le chemin d'accès au processeur "Saxon".
Le processeur Saxon ne s'installe pas, il suffit juste de le désarchiver dans un dossier.
