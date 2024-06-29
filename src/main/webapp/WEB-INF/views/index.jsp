<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body style="background: black; color: white;">
	<h1>this is home page </h1>
	
	<h1>Name : <c:out value="${name } " default="not found"></c:out></h1>
	<h1>course : <c:out value="${course }" default="not found" /></h1>
	<h1>all courses : </h1>
	
	<c:forEach var="item" items="${allCourses }">
		<h1> <c:out value="${item }" /></h1>
	</c:forEach>

</body>
</html>