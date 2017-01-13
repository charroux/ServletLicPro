<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="listEtudiantsURL">
	<table>
	
	
	<% int nombrePersonnes = (Integer)request.getAttribute("nombrePersonnes"); %>
	
	<% for(int i=0; i<nombrePersonnes; i++){ %>
	
		<tr>
			<td>
				nom : <input type="text" name="nom<%=i%>">
			</td>
		</tr>
	 
	<% } %>
	
	<input type="submit">
	
	</table>
</form>

</body>
</html>