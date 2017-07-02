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
	
	<!-- Récupération du controleur et des plats-->
	
	<jsp:useBean id="platsControleur" scope="session" class="com.ipstcnam.vitameal.beans.PlatsControleur" />
	
	<section>
		<h1>Plats</h1>
		<table>
			<c:forEach var="plat" items="${platsControleur.findAllPlats()}">
				<tr>
					<td>${plat.nom}</td>
					<td>${plat.idPlat}</td>
					<td>
					
					<c:url var="urlEditerPlat" value="Plats">
						<c:param name="action" value="editer" />
						<c:param name="id" value="${plat.idPlat}" />
					</c:url>
					<a href="${urlEditerPlat}">Editer</a></td>
					
					<td><input name="supprimerPlatButton" type="button"
						value="Supprimer" ></td>
				</tr>
			</c:forEach>
		</table>

		<a href="${pageContext.request.contextPath}/Plats?action=creer">Créer un nouveau plat</a>
	</section>
</body>
</html>