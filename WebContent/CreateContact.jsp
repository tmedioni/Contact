<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="CreateContactServlet">
	identifiant : <br/>
	<input type="text" name="id"><br/>
	prenom : <br/>
	<input type="text" name="prenom"><br/>
	nom : <br/>
	<input type="text" name="nom"><br/>
	mail : <br/>
	<input type="text" name="mail"><br/>
	
	<input type="submit" value="valider">
</form>


</body>
</html>