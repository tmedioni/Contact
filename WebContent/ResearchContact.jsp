<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<html:form action="researchContact">
	identifiant : <br/>
	<html:text property="id"/><br/>
	
	<html:submit>Valider</html:submit>
</html:form>

<c:if test="${not empty error}"><h1>${error}</h1></c:if>
<c:if test="${not empty id}">
	<c:choose>
	    <c:when test="${empty contact}"><h1>Le contact ${id} n'existe pas</h1></c:when> 	      
	    <c:otherwise>
			<h1>Contact ${contact.id} found</h1>
			<p>FirstName : ${contact.firstName} </p>
			<p>LastName : ${contact.lastName} </p>
			<p>Email : ${contact.email} </p>
		    
		    <p>Address : ${contact.add.street} ${contact.add.city} ${contact.add.zip} ${contact.add.country} </p>
			 <%--
			<c:forEach items="${contact.phones}" var="element">
			  	<p>${element.phoneKind} : ${element.phoneNumber}</p>  
			</c:forEach>
			--%>
			<c:forEach items="${contact.books}" var="element">
			  	<p>Groups : ${element.groupName}</p>  
			</c:forEach> --%>
		</c:otherwise>
	</c:choose>
</c:if>

</body>
</html>