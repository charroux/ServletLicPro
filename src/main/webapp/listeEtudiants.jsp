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
	<jsp:useBean id="evaluations" class="java.util.ArrayList" scope="request"/>
		
		<c:forEach items="${evaluations}" var="evaluation">
			l'etudiant <c:out value="${evaluation.nom}" /> a eu <c:out value="${evaluation.note}" /><br>
		</c:forEach>
		
</body>
</html>