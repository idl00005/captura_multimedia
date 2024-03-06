<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <title>Rellena tu inscripción</title>
</head>
<body>

<div class="px-4 py-5 text-center">
    <h1 class="display-5 fw-bold text-body-emphasis">Inscríbete en PowerFIT</h1>
    <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">Rellena tus datos para empezar a disfrutar de todas las ventajas de POWERFIT</p>
    </div>
</div>

<div class="shadow-sm w-50 p-3 bg-body-tertiary rounded justify-content-center align-items-center mx-auto p-2">
    <div class="d-flex justify-content-center align-items-center">
        <img src="./img/logoblack.png" alt="Inscripción" class="text-aling-center align-items-center" width="250" height="80">
        </div>
        <form method="POST" action="inscripcion" >
            <fieldset>
                <legend>Rellena tus datos personales</legend>
                <label class="form-label" for="nombre">Nombre:</label>
                <input class="form-control" type="text" id="nombre" name="nombre">

                <label class="form-label" for="apellidos">Apellidos:</label>
                <input class="form-control" type="text" id="apellidos" name="apellidos" required>

                <label class="form-label" for="dni">DNI:</label>
                <input class="form-control" type="text" id="dni" name="dni" value="${dni}"required>
                <div style="color: red">${errores['dni']}</div>

                <label class="form-label" for="telefono">Teléfono:</label>
                <input class="form-control" type="tel" id="telefono" name="telefono" required>
                <div style="color: red">${errores['telefono']}</div>

                <label class="form-label" for="fechaNacimiento">Fecha de Nacimiento:</label>
                <input class="form-control" type="date" id="fechaNacimiento" name="fechaNacimiento" required>
            </fieldset>

            <fieldset>
                <legend>Rellena tus datos de inicio de sesión</legend>
                <label class="form-label" for="email">E-mail:</label>
                <input class="form-control" type="email" id="email" name="email" required>

                <label class="form-label" for="password">Contraseña:</label>
                <input class="form-control" type="password" id="password" name="password" required>
            </fieldset>

            <fieldset>
                <legend>Rellena tu dirección</legend>
                <label class="form-label" for="direccion">Dirección:</label>
                <textarea class="form-control" id="direccion" name="direccion" rows="3" required></textarea>

                <label class="form-label" for="ciudad">Ciudad:</label>
                <input class="form-control" type="text" id="ciudad" name="ciudad" required>

                <label class="form-label" for="codigoPostal">Código Postal:</label>
                <input class="form-control" type="text" id="codigoPostal" name="codigoPostal" required>
            </fieldset>
            <br>
            <input type="submit" class="btn btn-warning" value="Envíar">
        </form>
    </div>
</div>



</body>
</html>

<%@ include file="footer.jspf" %>
