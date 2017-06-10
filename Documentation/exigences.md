Format :  
REQ_[identifiant numerique] titre de l'exigence  
	description détaillé  
	liens : REQ_XXX, REQ_XXX, ...


REQ_100 Le systeme doit permettre de concevoire les 3 repas (petit-déjeuner, déjeuner, souper) d'une journée  
	ref: REQ_101

REQ_101 Le systeme doit permetre de concevoire un petit-déjeuner composés d'une boisson, d'un aliment cerealiée, d'un produit laitier et d'un fruit  
REQ_102 Le systeme doit permetre de rajouter aux petit dejener un un element lipidique, sucré ou protodique  
REQ_103 Le systeme doit avertir l'utilisateur de l'usage d'element non dietetique dans un petit dejeuner  
REQ_104 Le systeme doit vérifier que la frequence de l'usage d'element non dietetique des petit dejeuner ne depasse pas 3/20 repas, il avertit l'utilisateur si c'est le cas.

REQ_105 Le systeme de concevoire un déjeuner et souper composés de 4 ou cing composantes parmi : entree, plat protodique, garniture, produit, laitier desserts (selon le tableau TODO ref) + de l'eau et du pain

REQ_410 Le systeme doit permetre d'ajouter et de supprimmer des elements dans les comosant des repas
attention: certain element peuvent etre dans plusieur categorie a la fois

REQ_411 Le systeme doit permetre de revenir au liste par defaut recommande par le gouvernement

REQ_500 Le systeme doit pemetre, une fois les menus elaborer de generer un fiche de commande au format : à definir

REQ_501 Le systeme doit permetre d'afficher les menus sur un site intenet   
REQ_600 LE systeme doit gerer un cycle de validation des repas (en cours d'elaboration, en attente de validation, validé)

REQ_601 le systeme doit permetre de gerer different droit selon le type d'utilisateur  
exemple : le medecin doit pouvoir validé un menus

REQ_700 : le systeme doit afficher les menu à assembler pour un jour donnée et emmetre une ettiquette au format : à définir

REQ_701 : le systeme doit permetre de fixer une limite au prix d'un repas  
REQ_702 : le systeme doit permetre de resegner le prix des elements d'un repas  

REQ_902 Le systeme doit permetre de renseigner un profil patient comportant les élément suivants :  
- regime particulier : liste à definir  
- allergie : liste à definir  
- contre-indication : liste à definir

REQ_1000 Le systeme doit permetre de rensegner l'etat civilie d'un patient  
REQ_1001 Le systeme doit permetre de rensegner la localisation particuliere d'un patient

REQ_1002 Le systeme doit permettre de gerer les grammage de plat

REQ_1003 Le systeme doit pouvoir gerer des plateau repas de de type : sans regime particulier ou avec regime particulier

REQ_1004 Le systeme doit gerer les patients par groupes selon leur regime, exemple le groupe des intolerant au lactose  
REQ_1005 Le systeme doit permetre de generer auomatiquement les repas pour un groupe de patient particulier

REQ_1009 Le systeme doit permetre de ....
