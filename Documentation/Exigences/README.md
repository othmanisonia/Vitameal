EXIGENCES
=========

Elles sont stockées dans un fichier XML dont la structure est décrite
ci-dessous.

Composition
-----------

Chaque exigence est composée de 10 champs:

numero:

:   Numéro formé comme suit: REQ\_xxxxx, où x est un chiffre de 0 à 9

titre:

:   Titre ou description courte

corps:

:   Expression de l’exigence

type:

:   Type de l’exigence: Utilisateur - Métier - Technique -
    Fonctionnelle - Non fonctionnelle - Contrainte - Ergonomie -
    Robustesse - Performance - Sécurité

origine:

:   D’où vient une exigence ? (Quel besoin cette exigence couvre-t-elle
    ? Pourquoi a-t-on conçu la solution de cette manière et quelles
    étaient les autres possibilités ?)

version:

:   ou niveau de maturité, voir [Capability Maturity
    Model](http://users.polytech.unice.fr/~hugues/GL/CMM/cmm.html) -
    Initial - Reproductible - Défini - Maîtrisé - Optimisé

priorite:

:   Priorité selon la méthode MoSCoW - Must - Should - Could - Won’t

validee:

:   L’exigences a-t-elle été validée ? (Oui / Non)

lien:

:   il peut y en avoir plusieurs; ils sont regroupés dans l’élément
    “Liens”.

test:

:   Définition du test qui validera l’exigence.

Edition
-------

Elle peut ce faire avec “Eclipse”, qui permet la validation (par rapport
au schéma) au fur et à mesure de la saisie. Une commodité dans “Eclipse”
est la liste des énumération disponible sur un élément, en tapant Ctrl +
Espace dans l’élément.

Extraction
----------

L’export des informations contenues dans le fichier XML ce fait à l’aide
de scripts XSLT:

Exigences.xsl:

:   génère le fichier “Exigences.tex” qui sera inclu automatiquement
    dans le rapport du projet.

Exigences\_csv.xsl:

:   génère le fichier “Exigences.csv” qui peut être lu par n’importe
    quel tableur.

Exigences\_html.xsl:

:   génère le fichier “Exigences.html” qui peut être lu par n’importe
    quel navigateur internet.

J’utilise le processeur XSLT de
[Saxonica](http://www.saxonica.com/download/opensource.xml). Ce
processeur fonctionne avec Java et ne s’installe pas, il suffit juste de
le désarchiver dans un dossier.

Le fichier “gen.cmd” permet de lancer la génération; avant il faut
mettre à jour la variable d’environnement “XsltProcPath” avec le chemin
d’accès au processeur “Saxon”.
