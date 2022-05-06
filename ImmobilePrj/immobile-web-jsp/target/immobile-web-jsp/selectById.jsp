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
	<form action="immobileById" method="post">
		id immobile:<select name='id'>
			<c:forEach var="x" items="${ids}">
				<option >${x}</option>
			</c:forEach>
		</select> <input type="submit" value="select immobile">
	</form>
</body>
</html>