<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creer un article</title>

</head>
<body>
	<h1>AmaShirt</h1>
	<a href="accueilAmaShirt.jsp">Accueil AmaShirt</a>
	<form method="post">
		<p>
			<label>Id</label> : <input type="text" name="id" />
		</p>
		<p>
			<label>Nom</label> : <input type="text" name="nom" />
		</p>

		<p>
			<label>Prix</label> : <input type="text" name="prix" />
		</p>
		<p>
			<label>TailleFr</label> : <input type="text" name="taillefr" />
		</p>
		<p>
			<label>TailleUK</label> : <input type="text" name="tailleuk" />
		</p>
		
		<input type="button" name="EnregistrerArticle" value="Enregistrer" />
	</form>
</body>
</html>