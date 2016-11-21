<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean"%>

<html:html>
<head>
<title><bean:message key="logon.title" /></title>

<!-- Latest compiled and minified CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/starter-template.css" rel="stylesheet">
</head>

<body>

	<div class="container theme-showcase">
		<div class="starter-template">
			<html:errors />

			<html:form action="/logon.do" focus="username">
				<table>
					<tr>
						<th class="right"><bean:message key="prompt.username" /></th>
						<td class="left"><html:text property="username" size="16" />
						</td>
					</tr>
					<tr>
						<th class="right"><bean:message key="prompt.password" /></th>
						<td class="left"><html:password property="password" size="16" />
						</td>
					</tr>
					<tr>
						<td class="right"><html:submit>
								<bean:message key="button.submit" />
							</html:submit></td>
						<td class="right"><html:reset>
								<bean:message key="button.reset" />
							</html:reset></td>
					</tr>
				</table>

			</html:form>
		</div>
	</div>

</body>
</html:html>

