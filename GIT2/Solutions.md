#Solutions

1 - Clonez un ancien TP de programmation, ou utilisez ce lien : 
https://github.com/elaelheni/test

2 - 
```sh
git checkout -b "uneBranche"
vim src/main/java/<fichier> --Ajout des commentaires
git add src/main/java/<fichier>
git commit -m "Ajout commentaire"
git push -u origin uneBranche
```

3-
```sh
git checkout master
git diff
git status
```

4-

```sh
git checkout master --Si vous n'y êtes pas déjà
git merge uneBranche
git push
```

5-
```sh
git checkout -b "uneBranche"
vim src/main/java/<fichier> --Modifications
git add src/main/java/<fichier>
git commit -m "Modifications"
git push -u origin uneBranche
git checkout master
git merge uneBranche
```

6-
```sh
git checkout -b "uneBranche"
vim src/main/java/<fichier> --Modifications
git log --all --pretty=online 
-- Prendre le # du commit
git checkout master 
git cherry-pick <COMMIT>
git push
```

7-
**Exemples faits au labo**











**RQ:** Pour supprimer une branche :
```sh
git checkout -b "premiereBranche"
vim src/main/java/<fichier> --Modifications
git push -u origin premiereBranche
git checkout -b "deuxiemeBranche"
vim src/main/java/<fichier> --Modifications
git push -u origin deuxiemeBranche
git checkout master
git push origin --delete premiereBranche
git push origin :premiereBranche --Équivalent à la commande précedante
git branch -d premiereBranche -- option -D si la branche n'a pas été fusionnée
git branch -d deuxiemeBranche
```

