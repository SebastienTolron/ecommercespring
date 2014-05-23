<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistrer client</title>
</head>
<body>
	<h1>AmaShirt</h1>
	<a href="accueilAmaShirt.jsp">Accueil AmaShirt</a>
	<a href="panierAmaShirt.jsp">mon Panier</a>
	<a href="afficherCatalogue.jsp">Rechercher un produit</a>
	<form method="post" action="sinscrire.do">
		<p>
			<label>Nom</label> : <input type="text" name="nom" required/>
		</p>
		<p>
			<label>Prénom</label> : <input type="text" name="prenom" required/>
		</p>
		<p>
			<label>Login</label> : <input type="text" name="login" required/>
		</p>
		<p>
			<label>mot de passe</label> : <input type="password" name="mp" required/>
		</p>
		<p>
			<label>adresse mail</label> : <input type="text" name="email" required/>
		</p>
		<input type="submit" name="EnregistrerClient" value="Enregistrer"/>
	</form>
</body>
</html>