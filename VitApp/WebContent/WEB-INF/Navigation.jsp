<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vitameal</title>
<link rel="stylesheet" type="text/css" href="css/Navigation.css">
</head>
<body>
	<header>
		<h1>Vitameal</h1>
		<%=session.getAttribute("utilisateur") %>
	</header>
	<nav>
		<a href="WEB-INF/Navigation.jsp">Profil patient</a><br>
		<a href="WEB-INF/Navigation.jsp">Plats</a><br>
	</nav>
	<section>
		<p>Corps de la page</p>
	</section>
</body>
</html>