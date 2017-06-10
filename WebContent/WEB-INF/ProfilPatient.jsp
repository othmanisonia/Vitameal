<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vitameal</title>
<link rel="stylesheet" type="text/css" href="css/Vitameal.css">
</head>
<body>
	<jsp:include page="/WEB-INF/Fragments/Header.jsp"/>
	<jsp:include page="/WEB-INF/Fragments/Navigation.jsp"/>
	<section>
		<h1>Profil Patient</h1>
		<form method="post" action="ProfilPatient">
			<fieldset>
				<legend>Identitée</legend>
				<label for="prenom">Prénom :</label><input type="text" name="p_prenom" id="prenom" required><br>
				<label for="nom">Nom :</label><input type="text" name="p_nom" id="nom" required><br>
				<label for="sexe">Sexe :</label><input type="text" list="sexes" name="p_sexe" id="sexe" required><br>
				<datalist id="sexes">
					<option value="Homme"/>
					<option value="Femme"/>
				</datalist>
			</fieldset>
			<fieldset>
				<legend>Diététique</legend>
				<label for="age">Age :</label><input type="number" min="18" max="70" name="p_age" id="age" required><br>
				<label for="poids">Poids :</label><input type="number" min="10" name="p_poids" id="poids" required><br>
				<label for="taille">Taille :</label><input type="number" min="50" name="p_taille" id="taille" title="en cm !" required><br> <!-- en cm ! -->
				<label for="allergies">Allergies :</label><input type="text" name="p_allergies" title="séparés par des virgules" id="allergies"><br> <!-- séparées par une virgule -->
				<label for="contreIndications">Contre indications :</label><input type="text" name="p_contreIndications" title="séparés par des virgules" id="contreIndications"><br> <!-- séparées par une virgule -->
			</fieldset>
			<fieldset>
				<legend>Affections</legend>
				<input type="checkbox" name="p_diabete"> Diabète<br>
				<input type="checkbox" name="p_colesterol"> Colestérol<br>
				<input type="checkbox" name="p_hypertension"> Hypertension<br>
			</fieldset>
			<input type="submit" value="Valider">
		</form>
	</section>
</body>
</html>