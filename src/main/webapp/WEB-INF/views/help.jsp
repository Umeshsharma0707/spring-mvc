<%@page import="java.time.LocalDateTime"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background: black; color: white;">
<h1>This is help page</h1>

<h1>my name is ${name }</h1>
<h1>my roll No is ${rollNo }</h1>
<h1>time : ${time }</h1>
<hr>

<c:forEach var="item"  items="${subjects } ">
	<h1><c:out value="${item }" /> </h1>
</c:forEach>


</body>
</html>