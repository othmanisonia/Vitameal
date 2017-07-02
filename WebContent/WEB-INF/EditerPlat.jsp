<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Vitameal</title>
	<link rel="stylesheet" type="text/css" href="css/Vitameal.css">
</head>
<body>
	<jsp:include page="/WEB-INF/Fragments/Header.jsp" />
	<jsp:include page="/WEB-INF/Fragments/Navigation.jsp" />
	
	<!-- Récupération du controleur et des information sur le plat en cas d'édition -->
	
	<jsp:useBean id="platsControleur" scope="session" class="com.ipstcnam.vitameal.beans.PlatsControleur" />	
	<c:if test="${platsControleur.isEditerMode()}">
		<c:set var="plat" value="${platsControleur.findPlat(platsControleur.idPlat)}" />
		<c:set var="composantPlat" value="${platsControleur.findComposantPlat(platsControleur.idPlat)}" />
	</c:if>
	
	<section>
	
		<!-- Formulaire en mode création -->
		
		<c:choose>
			<c:when test="${platsControleur.isCreerMode()}">
				<h1>Crée un nouveau plats</h1>
				
				<form method="post">
					<label for="nomPlat">Nom du nouveau plat:</label>
					<input type="text" id="nomPlat" name="p_nomPlat" required />
					
					<br>
					
					<fieldset>
						<legend>Création des ingrédients</legend>
				
						<label for="nomIngredient">Nom :</label>
						<input type="text" id="nomIngredient" name="p_nomIngredient" required>
				
						<label for="quantiteIngredient">Quantité :</label>
						<input type="text" id="quantiteIngredient" name="p_quantiteIngredient" required>
				
						<label for="uniteIngredient">Unité :</label>
						<select id="uniteIngredient" name="p_uniteIngredient">
							<option value="kg"/>
							<option value="g"/>
							<option value="mg"/>
						</select>

					</fieldset>
			
					<input type="submit" value="Valider">
				</form>
			</c:when>
			
			<!-- Formulaire en mode édition -->
			
			<c:when test="${platsControleur.isEditerMode()}">
				<h1>Editer le plat ${plat.nom}</h1>
				
				<form method="post">
					<label for="nomPlat">Nom du nouveau plat:</label>
					<input type="text" id="nomPlat" name="p_nomPlat" value="${plat.nom}" required />
					
					<br>
					
					<fieldset>
						<legend>Modification des ingrédients</legend>
				
						<label for="nomIngredient">Nom :</label>
						<input type="text" id="nomIngredient" name="p_nomIngredient" value="${composantPlat.composantPlatId.ingredient.nom}" required>
				
						<label for="quantiteIngredient">Quantité :</label>
						<input type="text" id="quantiteIngredient" name="p_quantiteIngredient" value="${composantPlat.quantite}" required>
				
						<label for="uniteIngredient">Unité :</label>
						<select id="uniteIngredient" name="p_uniteIngredient">
							<option value="kg"/>
							<option value="g" />
							<option value="mg"/>
						</select>

					</fieldset>
			
					<input type="submit" value="Valider">
				</form>
			</c:when>
		</c:choose>
		
	</section>
</body>
</html>