<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>fetched data from form</h1>
	
	<h1>Name : <c:out value="${name }" /></h1>
	<h1>Email : <c:out value="${email }" /></h1>
	<h1>Password : <c:out value="${userPassword }" /></h1>
	
</body>
</html>