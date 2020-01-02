<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home Page</title>
	</head>
	<body>

		<h3>Home Page</h3><br>
		<s:a namespace="/admin" action="index">Admin Module</s:a><br><br>
		<s:a namespace="/superadmin" action="index">Super Admin Module</s:a><br><br>
		<s:a namespace="/employee" action="index">Employee Module</s:a>

	</body>
</html>