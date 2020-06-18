# INF2050 ETE2020
Correction des laboratoires d'INF2050 G20

## Enregistrement des laboratoires:

**Seance 2** : https://uqam-my.sharepoint.com/:f:/g/personal/cc191089_ens_uqam_ca/EuLu_Z-QBt5PmDpwrYVKx5wB5_Auxp6Fd7EbhG53DOeZGQ?e=RWukLh

**Seance 3** : https://drive.google.com/file/d/1prAZxtK383PNSy8LHOe8kTYkH0qvMp1n/view?usp=sharing

**Seance 4** : https://drive.google.com/file/d/1JxLadYEweAeU3O0cwflSh9EgtdHhAbkK/view?usp=sharing

**Seance 5** : https://drive.google.com/file/d/1JV0tBV9XQGFcsSGZ-LJQQQj4vObVQ9iS/view?usp=sharing

**Seance 6** : https://drive.google.com/file/d/1cD0SvxTeqaqUgJPUC1TJ-hdfK6eKex3b/view?usp=sharing 

**Seance 7** : https://drive.google.com/file/d/1__kIYyLIkoVRnoRHyx6u9k_J3fufh9-y/view?usp=sharing


## Note pour le TP1 

Je vous conseillerai de cloner les dépôts distants et de copier votre travail dedans avant de faire vos push.
Ça prend la commande `git colne "URL"` 
*RQ:* Lors du clonage, l'URL prend l'extension `.git`


Si vous vous êtes déjà créer un dépôt en local avec `git init` et que vous essayez de fusionner les deux avec `git remote add origin "URL"` (dans ce cas l'URL ne prend pas l'extension `.git`) et que ça ne marche pas, c’est parce que vous essayez de fusionner deux «branches» qui n’ont pas une base commune, donc pas d’historique commun, je vous conseillerai dans ce cas cette commande : `git pull origin master --allow-unrelated-histories`  (ou un `git fetch origin` + `git merge --allow-unrelated-histories ` ) avant de faire vos `git push` (le premier push devra ressembler à ça : `git push -u origin master`)  

*PS*: Si vous ne voulez pas souffrir, clonez le dépôt distant.
Si le problème persiste avec l'une ou l'autre des solutions contactez moi via Slack ou par courriel.
*Bon courage à tous.*
