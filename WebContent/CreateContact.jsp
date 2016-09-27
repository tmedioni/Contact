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
	addresse : <br/>
	<input type="text" name="addresse"><br/>
	tel mobile: <br/>
	<input type="text" name="mobile"><br/>
	tel fixe:<br/>
	<input type="text" name="fixe"><br/>
	tel bureau:<br/>
	<input type="text" name="bureau"><br/>
	groupe:<br>
	<input type="text" name="groupe"><br/>
	
	<input type="submit" value="valider">
	<input type="reset" value="reset">
</form>


</body>
</html>