<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!-- page directive should be there for springMVC (default-true)-->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${msg}
	<form action="./login" method="post">
		User Id : <input type="text" name="userId" require><br>
		Password : <input type="password" name="password" require> <br>
		<br> <input type="submit" value="login">
</body>
</html>