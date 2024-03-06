<%--
  Created by IntelliJ IDEA.
  User: Juanma
  Date: 6/3/24
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Página de validación de formulario</title>
</head>
<body>

<h1>Datos del usuario</h1>
<div>Nombre: <%=request.getParameter("nombre")%></div>
<div>Apellidos: <%=request.getParameter("apellidos")%></div>
<div>DNI: <%=request.getParameter("dni")%></div>
<div>Teléfono: <%=request.getParameter("telefono")%></div>
<div>Fecha de nacimiento: <%=request.getParameter("fechaNacimiento")%></div>
<div>Email <%=request.getParameter("email")%></div>
<div>Password <%=request.getParameter("password")%></div>
<div>Dirección <%=request.getParameter("direccion")%></div>
<div>Ciudad <%=request.getParameter("ciudad")%></div>
<div>Código Postal <%=request.getParameter("codigoPostal")%></div>


</body>
</html>
