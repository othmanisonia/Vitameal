## Les branches avec Git

### Que signifie créer une banche avec Git ?

Créer une branche signifie diverger de la ligne principale de développement et continuer à travailler sans se préoccuper de cette ligne principale.

![Git branches](https://seikomi.github.io/Vitameal/Documentation/Guide/image/git_branch.png)

### Créer une nouvelle branche

Créer une nouvelle branche permet de diverger de la branche principale (par convention `master`) pour faire évoluer le code sans impacter le travail des autres collaborateurs.  

```
$ git branch testing
```

### Basculer entre les branches

Basculer entre les branches permet de travailler à la fois sur son évolution et sur le tronc commun.

```
$ git checkout testing
```

### Fusions (Merge)

Une fois votre travail terminer, vient le temps de l'ajouter à la branche principale. Il faut, dans un premier temps, se positionner sur la branche principal. Puis, lancer la fusion avec votre branche. Il peut se produire durant cette étape des conflits de fusions.

```
$ git checkout master
Switched to branch 'master'
$ git merge testing
```

### Conflits de fusions (Merge conflicts)

```
$ git merge testing
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
```

Git n’a pas automatiquement créé le commit de fusion. Il a arrêté le processus le temps que vous résolviez le conflit. Vous pouvez voir les fichiers en conflit avec la commande `git status`

```
$ git status
On branch master
You have unmerged paths.
  (fix conflicts and run "git commit")

Unmerged paths:
  (use "git add <file>..." to mark resolution)

    both modified:      index.html

no changes added to commit (use "git add" and/or "git commit -a")
```

Les conflits se présente sous la forme suivante dans le fichier :

```
<<<<<<< HEAD:index.html
<div id="footer">contact : email.support@github.com</div>
=======
<div id="footer">
 please contact us at support@github.com
</div>
>>>>>>> testing:index.html
```

De `<<<<<<< HEAD:index.html` à `=======` on a la version de la branche principale et de `=======` à 
`>>>>>>> testing:index.html` on a notre version. A vous de voir quel versions est la bonne ou bien de faire 
une fusion manuelle des deux contenus.

```
$ git commit
```

Valide la fusion.

![Git merge](https://seikomi.github.io/Vitameal/Documentation/Guide/image/git_merge.png)

### Pousser les branches

Lorsque vous souhaitez partager une branche avec le reste du monde, vous devez la pousser sur un serveur distant sur lequel vous avez accès en écriture. Vos branches locales ne sont pas automatiquement synchronisées sur les serveurs distants — vous devez pousser explicitement les branches que vous souhaitez partager. De cette manière, vous pouvez utiliser des branches privées pour le travail que vous ne souhaitez pas partager et ne pousser que les branches sur lesquelles vous souhaitez collaborer.

Si vous possédez une branche nommée `testing` sur laquelle vous souhaitez travailler avec d’autres, vous pouvez la poussez de la même manière que vous avez poussé votre première branche. Lancez `git push (serveur distant) (branche)`.

### Sources

 Ce guide est une simplification de la partie sur les branche du livre Pro Git book accessible en ligne et en francais à l'adresse suivante : https://git-scm.com/book/fr/v2