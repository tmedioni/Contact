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
			<h1>
				<bean:message key="main.title" />
			</h1>
		</div>

		<!-- Add Contact -->
		<button property="create" class="btn btn-primary" data-toggle="modal"
			data-target="#addContact" data-backdrop="static">
			<bean:message key="main.add.contact.button" />
		</button>
		<!-- Contact modal -->
		<div id="addContact" class="modal fade" role="dialog">
			<div class="modal-dialog modal-lg">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">
							<bean:message key="main.add.contact.title" />
						</h4>
					</div>
					<div class="modal-body">
						<html:form styleClass="form-horizontal" action="/addContact">
							<div class="form-group">
								<label class="control-label col-sm-3" for="firstname"><bean:message
										key="main.add.contact.firstname" />:</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="firstname"
										placeholder=<bean:message key="main.add.contact.firstname.placeholder"/> />
								</div>
							</div>
							<div class="form-group">
                                <label class="control-label col-sm-3" for="lastname"><bean:message
                                        key="main.add.contact.lastname" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="lastname"
                                        placeholder=<bean:message key="main.add.contact.lastname.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="email"><bean:message
                                        key="main.add.contact.email" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="email"
                                        placeholder=<bean:message key="main.add.contact.email.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="mobile"><bean:message
                                        key="main.add.contact.mobile" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="mobile"
                                        placeholder=<bean:message key="main.add.contact.mobile.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="fixe"><bean:message
                                        key="main.add.contact.fixe" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="fixe"
                                        placeholder=<bean:message key="main.add.contact.fixe.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="bureau"><bean:message
                                        key="main.add.contact.bureau" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="bureau"
                                        placeholder=<bean:message key="main.add.contact.bureau.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="street"><bean:message
                                        key="main.add.contact.street" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="street"
                                        placeholder=<bean:message key="main.add.contact.street.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="city"><bean:message
                                        key="main.add.contact.city" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="city"
                                        placeholder=<bean:message key="main.add.contact.city.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="country"><bean:message
                                        key="main.add.contact.country" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="country"
                                        placeholder=<bean:message key="main.add.contact.country.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="zipcode"><bean:message
                                        key="main.add.contact.zipcode" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="zipcode"
                                        placeholder=<bean:message key="main.add.contact.zipcode.placeholder"/> />
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label col-sm-3" for="siret"><bean:message
                                        key="main.add.contact.siret" />:</label>
                                <div class="col-sm-9">
                                    <input type="text" class="form-control" id="siret"
                                        placeholder=<bean:message key="main.add.contact.siret.placeholder"/> />
                                </div>
                            </div>
						
					</div>
					<div class="modal-footer">
					<html:button styleClass="btn btn-success" property="add"><bean:message key="main.submit"/></html:button>
					</html:form>
						<button type="button" class="btn btn-dfault" data-dismiss="modal">
							<bean:message key="main.cancel" />
						</button>
					</div>
				</div>
			</div>
		</div>

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