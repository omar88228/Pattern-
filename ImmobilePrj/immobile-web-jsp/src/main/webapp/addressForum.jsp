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
	<h1>insert address </h1>
	<form action="address" method="post">
		cap : <input type="text" name="cap"> 			
		street : <input type="text" name="street"> 
		city:    <input type="text" name="city"> 
		province:<input type="text" name="province"> 
		region: <input type="text" name="region"> 
		<input type="submit" value="add address">	
	</form>