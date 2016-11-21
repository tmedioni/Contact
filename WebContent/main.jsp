<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html:html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><bean:message key="main.title" /></title>

<!-- Latest compiled and minified CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/starter-template.css" rel="stylesheet">

</head>
<body role="document">
	<div class="container theme-showcase" role="main">
        <div class="page-header">
            <h1><bean:message key="main.title" /></h1>
        </div>  
        
		<!-- Add Contact -->
		<html:button property="create" styleClass="btn btn-primary">
			<bean:message key="main.add.contact" />
		</html:button>
		<br />

		<!-- Quick Contact Search -->
		<a href="ResearchContact.jsp">rechercher contact</a> <br />
		<html:form>

		</html:form>

		<!-- Add Group -->
		<a href="CreateGroup.jsp">creer groupe</a> <br /> <a
			href="UpdateContact.jsp">update contact</a> <br /> <a
			href="DeleteContact.jsp">delete contact</a> <br />
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="js/bootstrap.min.js"></script>
</body>
</html:html>