<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.example.g116.User" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Perfil de Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        .container {
            max-width: 600px;
            margin-top: 50px;
        }
    </style>
</head>
<body>
<%@ include file="header.jspf" %>
<%
    session = request.getSession();
    User user = (User) session.getAttribute("loggedInUser");
%>

<div class="container">
    <h2>Perfil de Usuario</h2>
    <form>
        <div class="form-group my-1">
            <label for="nombre">Nombre</label>
            <input type="text" class="form-control" id="nombre" value="<%= user.getNombre() %>" readonly>
        </div>
        <div class="form-group my-1">
            <label for="apellidos">Apellidos</label>
            <input type="text" class="form-control" id="apellidos" value="<%= user.getApellidos() %>" readonly>
        </div>
        <div class="form-group my-1">
            <label for="dni">DNI</label>
            <input type="text" class="form-control" id="dni" value="<%= user.getDni() %>" readonly>
        </div>
        <div class="form-group my-1">
            <label for="cp">Código Postal</label>
            <input type="text" class="form-control" id="cp" value="<%= user.getCp() %>">
        </div>
        <div class="form-group my-1">
            <label for="ciudad">Ciudad</label>
            <input type="text" class="form-control" id="ciudad" value="<%= user.getCiudad() %>" >
        </div>
        <div class="form-group my-1">
            <label for="direccion">Dirección</label>
            <input type="text" class="form-control" id="direccion" value="<%= user.getDireccion() %>" >
        </div>
        <div class="form-group my-1">
            <label for="telefono">Teléfono</label>
            <input type="tel" class="form-control" id="telefono" value="<%= user.getTelefono() %>">
        </div>
        <div class="form-group my-1">
            <label for="email">Correo Electrónico</label>
            <input type="email" class="form-control" id="email" value="<%= user.getEmail() %>">
        </div>
        <button type="submit" class="btn btn-warning m-2">Actualizar</button>
    </form>
    <hr>
    <p><strong>Duración de la membresía:</strong> 1 año</p>
</div>
<%@ include file="footer.jspf" %>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>