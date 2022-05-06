<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%">

		<tr>
		    <th>id</th>
			<th>street</th>
			<th>cap</th>
			<th>city</th>
			<th>province</th>
			<th>region</th>
		</tr>
		<c:forEach var="x" items="${addresses}">
			<tr>
				<td>${x.id}</td>
				<td>${x.street}</td>
				<td>${x.cap}</td>
				<td>${x.city}</td>
				<td>${x.province}</td>
				<td>${x.region}</td>
			</tr>

		</c:forEach>
	</table>
	<h4><a href="home">Home</a> <br></h4>
	<h4><a href="address">add new address</a> <br></h4>
</body>
</html>