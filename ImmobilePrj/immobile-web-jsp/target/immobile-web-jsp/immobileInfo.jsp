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
			<th>surface</th>
			<th>local number</th>
			<th>type</th>
			<th>address</th>
		</tr>
		<tr>
			<td>${immobile.id}</td>
			<td>${immobile.surface}</td>
			<td>${immobile.localNumber}</td>
			<td>${immobile.type}</td>
			<td>${immobile.address}</td>
		</tr>
	</table>
	<h4>
		<a href="home">Home</a> <br>
	</h4>
	<h4>
		<a href="immobile">add new immobile</a> <br>
	</h4>
	<h4>
		<a href="immobileById">select immobile by id</a>
	</h4>
</body>
</html>

