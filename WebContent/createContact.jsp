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
	prenom : <br/>
	<input type="text" name="prenom"><br/>
	nom : <br/>
	<input type="text" name="nom"><br/>
	mail : <br/>
	<input type="text" name="mail"><br/>
	
	rue:<br/>
	<input type="text" name="street">
	city:
	<input type="text" name="city">
	code postal:
	<input type="text" name="zip">
	country:
	<input type="text" name="country"> 
	<br/>
	
	tel mobile: <br/>
	<input type="text" name="mobile"><br/>
	tel fixe:<br/>
	<input type="text" name="fixe"><br/>
	tel bureau:<br/>
	<input type="text" name="bureau"><br/>
	groupe:<br/>
	<input type="text" name="groupe"><br/>
	
	siret:<br/>
	<input type="text" name="siret"><br/>
	
	<input type="submit" value="valider">
	<input type="reset" value="reset">
</form>


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
                        <html:submit styleClass="btn btn-success" property="add">
                            <bean:message key="main.submit" />
                        </html:submit>
                        </html:form>
                
                        <button type="button" class="btn btn-dfault" data-dismiss="modal">
                            <bean:message key="main.cancel" />
                        </button>
                    </div>
         

</body>
</html>