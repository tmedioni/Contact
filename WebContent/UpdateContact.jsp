<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<html:form action="/updateContact">
	identifiant : <br/>
	<html:text property="id"/><br/>
	prenom : <br/>
	<html:text property="firstname"/><br/>
	nom : <br/>
	<html:text property="lastname"/><br/>
	mail : <br/>
	<html:text property="mail"/><br/>
	
	<html:submit value="valider" />
</html:form>


</body>
</html>