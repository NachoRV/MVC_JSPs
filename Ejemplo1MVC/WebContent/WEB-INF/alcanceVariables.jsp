<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alcance Variables</title>
</head>
<body>
	<h1>Alcance de variables</h1>
	<hr>
	<h3>Alcance de request:</h3>
	Base: ${rectanguloRequest.base} Altura: ${rectanguloRequest.altura}
	Area: ${rectanguloRequest.area }
	<hr>
	<h3>Alcance de sesion:</h3>
	Base: ${rectanguloSesion.base} Altura: ${rectanguloSesion.altura} Area:
	${rectanguloSesion.area }
	<hr>
	<h3>Alcance de request:</h3>
	Base: ${rectanguloAplicacion.base} Altura:
	${rectanguloAplicacion.altura} Area: ${rectanguloAplicacion.area }

	<a href="${ pageContext.request.contextPath }/index.jsp">Inicio</a>
	
</body>
</html>