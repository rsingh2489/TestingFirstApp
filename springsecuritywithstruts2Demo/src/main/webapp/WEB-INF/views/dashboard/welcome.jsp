<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<h3>Welcome Page</h3>
	Welcome ${pageContext.request.userPrincipal.name}
	<br>
	<s:a namespace="/dashboard" action="logout">Logout</s:a>

</body>
</html>