<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Vitameal</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/Logging.css">
</head>
<body>
	<form method="post" action="connexion"> <!-- j_security_check -->
		<fieldset>
			<legend>Vitameal Connexion</legend>
			Nom ............ : <input type="text" name="j_username"><br>
			Mot de passe : <input type="password" name="j_password"><br>
			<input type="submit" value="Valider">
		</fieldset>
	</form>
</body>
</html>