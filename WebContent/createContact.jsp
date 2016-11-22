<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/starter-template.css" rel="stylesheet">


</head>
<body>
<!--  
	<form method="post" action="CreateContactServlet">
		prenom : <br /> <input type="text" name="prenom"><br /> nom :
		<br /> <input type="text" name="nom"><br /> mail : <br /> <input
			type="text" name="mail"><br /> rue:<br /> <input type="text"
			name="street"> city: <input type="text" name="city">
		code postal: <input type="text" name="zip"> country: <input
			type="text" name="country"> <br /> tel mobile: <br /> <input
			type="text" name="mobile"><br /> tel fixe:<br /> <input
			type="text" name="fixe"><br /> tel bureau:<br /> <input
			type="text" name="bureau"><br /> groupe:<br /> <input
			type="text" name="groupe"><br /> siret:<br /> <input
			type="text" name="siret"><br /> <input type="submit"
			value="valider"> <input type="reset" value="reset">
	</form>
-->


	<h4 class="modal-title">
		<bean:message key="main.add.contact.title" />
	</h4>


	<html:form styleClass="form-horizontal" action="/addContact">
		<div class="form-group">
			<label class="control-label col-sm-3"><bean:message
					key="main.add.contact.firstname" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="firstname" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="lastname"><bean:message
					key="main.add.contact.lastname" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="lastname" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="email"><bean:message
					key="main.add.contact.email" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="email" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="mobile"><bean:message
					key="main.add.contact.mobile" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="mobile" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="fixe"><bean:message
					key="main.add.contact.fixe" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="fixe" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="bureau"><bean:message
					key="main.add.contact.bureau" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="bureau" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="street"><bean:message
					key="main.add.contact.street" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="street" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="city"><bean:message
					key="main.add.contact.city" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="city" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="country"><bean:message
					key="main.add.contact.country" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="country" />
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="zipcode"><bean:message
					key="main.add.contact.zipcode" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="zipcode" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-3" for="siret"><bean:message
					key="main.add.contact.siret" />:</label>
			<div class="col-sm-9">
				<html:text styleClass="form-control" property="siret" />
			</div>
		</div>



		<html:submit styleClass="btn btn-success" property="add">
			<bean:message key="main.submit" />
		</html:submit>
	</html:form>




</body>
</html>