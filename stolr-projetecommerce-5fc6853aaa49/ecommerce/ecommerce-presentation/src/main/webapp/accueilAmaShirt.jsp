<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:directive.page import="ecommerce.classemetier.Client" />
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Accueil AmaShirt</title>
</head>
<body>
	<h1>AmaShirt</h1>
	<jsp:useBean id="client" class="ecommerce.classemetier.Client" scope="request"/>
       Bonjour <jsp:getProperty name="client" property="pseudo" />
       </br>
	<a href="connexionAmaShirt.jsp">connexion</a>
	<a href="enregistrerClientAmaShirt.jsp">S'inscrire</a>
	<a href="panier.do">mon Panier</a>
	<a href="afficherCatalogue.jsp">Rechercher un produit</a>
</body>
</html>