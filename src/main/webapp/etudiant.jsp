<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="etudiant" class="tp1.Evaluation" scope="request"/>
	L'�tudiant <c:out value="${etudiant.nom}"></c:out> a obtenu <c:out value="${etudiant.note}"></c:out>
	
	<br>
	<a href="index.html">Home</a>
	
</body>
</html>