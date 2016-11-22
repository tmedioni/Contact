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


<html:form action="listContact">
	Param :
	<html:text property="param"/><br/>
	Choix : <html:text property="choix"/><br/>
	<html:submit>Valider</html:submit>
</html:form>

<c:if test="${not empty error}"><h1>${error}</h1></c:if>
	<c:choose>
	    <c:when test="${empty contact}"><h1>La liste est vide</h1></c:when>
	    <c:otherwise>
	      <table class="table table-hover">
    		<thead>
    			<tr>
    			<th>id</th>
		        <th>Firstname</th>
		        <th>Lastname</th>
		        <th>Email</th>
		      </tr>
		    </thead>
		    <tbody>
	    	<c:forEach items="${contact}" var="element">
	    	<tr>
				<td>${element.id}</td>
				<td>${element.firstName} </td>
				<td>${element.lastName} </td>
				<td>${element.email} </td>
			</tr>
			</c:forEach>
			 </tbody>
  		</table>
		</c:otherwise>
	</c:choose>
</body>
</html>