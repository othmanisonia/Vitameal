# Guide

## Installer le projet dans eclipse

* Cloner le projet : `File > Import... > Git > Projects from Git` ;
* Sélectionner `Clone URI` et copier l'adresse suivante : `https://github.com/Seikomi/Vitameal.git` ;
* Entrer votre login et mot de passe Github, puis sélectionner toutes les branches du projet ;
* Sélectionner le dossier de votre système de fichier dans lequel vous voulez cloner le repository ;
* Sélectionner `Import as general projects`
* Séléctioner le projet dans le package explorer et 

## Optenir un rendu Github des .md avec eclipse

Les .md sont des fichiers mardown respectant la syntaxe ` TODO GitHub Flavored Markdown link`. Eclipse permet d'optenir un rendu 
correcte de ces fichiers avec le plugin *GitHub Flavored Markdown viewer*.  
Cliquer sur le fichier que vous voulez voir et sélectionner `Show on GFM view`.

#### Lien d'installation du plugin :

![GitHub Flavored Markdown viewer](https://marketplace.eclipse.org/sites/default/files/styles/ds_medium/public/egit-github-marketplace-logo-GFM.png?itok=1j-O1GVq)

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=900708" class="drag" title="Drag to your running Eclipse workspace."><img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace." /></a>


## Activer la coloration syntaxique des `.tex` dans eclipse

Pour activer la coloration syntaxique des `.tex`, installer le plugin eclipse *TeXclispe*.

#### Lien d'installation du plugin :

![TeXclispe](http://marketplace.eclipse.org/sites/default/files/styles/ds_medium/public/default_images/default_2.png?itok=hA89-j9Y)

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=139"" class="drag" title="Drag to your running Eclipse workspace."><img class="img-responsive" src="http://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace." /></a>


## Inclure des images dans les fichiers .md sur Github

Respecter la syntaxe suivante : 

```
![alt text](https://seikomi.github.io/Vitameal/ + path to the image on github)
```
Exemple:

```markdown
![Diagramme de cas d'utilisation](https://seikomi.github.io/Vitameal/doc/UseCaseDiagram.svg)
```

## Utiliser pandoc pour convertir les fichiers .md en .tex

Lancer la commande suivante :

```
pandoc -o [nom du fichier source].md [nom du fichier destination].tex
```

Vous pouver ensuite éditer le `.tex` généré pour une meilleure présentation.

