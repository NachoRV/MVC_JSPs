<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Despliegue de variables</title>
</head>
<body>
<h1>Despliegue de variables</h1>
<h3>Variables en alcance request</h3>
${mensaje}
<br>
<h3>Variables en alcance Sesion</h3>
Reactangulo:
Base: ${rectangulo.base }
Altura: ${rectangulo.altura }
Area: ${rectangulo.area}
<br>
<a href="${ pageContext.request.contextPath }/index.jsp">Inicio</a>
</body>
</html>