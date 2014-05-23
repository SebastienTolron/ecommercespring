<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>


</head>
<body>
	<h1>AmaShirt</h1>
	<a href="accueilAmaShirt.jsp">Accueil AmaShirt</a>
	<a href="enregistrerClientAmaShirt.jsp">S'inscrire</a>
	<a href="panierAmaShirt.jsp">mon Panier</a>
	
	<form method="post" action="login.do">
    <p>
        <label>Login</label> : <input type="text" name="login" />
    </p>
    <p>
        <label>Password</label> : <input type="text" name="password" />
    </p>
    
    <p>
        <input type="submit" name="Se connecter" value="Se connecter"/>
    </p>
</form>


</body>
</html>