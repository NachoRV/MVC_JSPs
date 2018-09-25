<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejemplo 1 MVC</title>
</head>
<body>
	<h1>Ejemplo simple MVC</h1>
	<div style="color: red">${mensaje}</div>
	<a href="${ pageContext.request.contextPath }/servletController">
		Link al servlet controlador que despliega las varibles sin parametros</a>
	<br>
	<br>
	<a
		href="${ pageContext.request.contextPath }/servletController?accion=agregarVariables">
		Link al servlet controlador para agregar variables</a>
	<br>
	<br>
	<a
		href="${ pageContext.request.contextPath }/servletController?accion=agregarVariables">
		Link al servlet controlador para agregar variables.</a>
	<br>
	<br>
	<a
		href="${ pageContext.request.contextPath }/servletController?accion=listarVariables">
		Link al servlet controlador para listar variables.</a>
		
</body>
</html>