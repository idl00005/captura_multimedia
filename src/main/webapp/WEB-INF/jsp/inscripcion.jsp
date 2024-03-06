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

<ul>
    <% if(request.getParameter("nombre").length()==0){%>
    <li>Error: no se ha envíado el nombre</li>
    <%}%>
</ul>

<div>Nombre: ${nombre}</div>
<div>Apellidos: ${apellidos}</div>
<div>DNI: ${dni}</div>
<div>Teléfono: ${telefono}</div>
<div>Fecha Nacimiento: ${fecha_nacimiento}</div>
<div>Correo electrónico: ${email}</div>
<div>Contraseña: ${password}</div>
<div>Dirección: ${direccion}</div>
<div>Ciudad: ${ciudad}</div>
<div>Código Postal: ${cp}</div>
</body>
</html>
