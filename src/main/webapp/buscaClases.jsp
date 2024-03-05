<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buscador de clases</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<%@ include file="header.jspf" %>



<body>

<div class="px-4 py-5 my-0 text-center">
    <h1 class="display-5 fw-bold text-body-emphasis">Nuestras clases</h1>
    <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">Las clases en grupo de PowerFIT incluyen varios tipos de actividades y diferentes métodos de ejercicio, permitiendo alcanzar una amplia variedad de objetivos diferentes.</p>
        <div class="d-grid gap-2 d-sm-flex justify-content-sm-center align-items-center">
            <span class="align-middle" style="margin-right: 10px">Busca las clases por día:</span>
            <select class="form-select w-auto p-2 ">
                <option value="lunes">Lunes</option>
                <option value="Martes">Martes</option>
                <option value="Miércoles">Miércoles</option>
                <option value="Jueves">Jueves</option>
                <option value="Viernes">Viernes</option>
                <option value="Sábado">Sábado</option>
            </select>

            <span class="align-middle" style="margin-left: 40px; margin-right: 10px">Busca una clase:</span>
            <input class="form-control w-25 " type="search" id="buscaClase" name="BuscaClase">
            <input class="btn btn-warning" type="button" value="Buscar">
        </div>
    </div>
</div>
    <div class="container-fluid d-flex flex-column flex-md-row p-4 gap-4 py-md-5 align-items-center justify-content-center">

    <ul class="list-group flex-fill">
        <ul class="list-group list-group-horizontal flex-fill">
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><h2>Nombre de la clase</h2></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="badge text-bg-primary rounded-pill">Capacidad</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Día de clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Horario de la clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><button class="btn btn-warning">Apuntarme</button></li>
        </ul>

        <ul class="list-group list-group-horizontal flex-fill">
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill "><h2>Nombre de la clase</h2></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill "><p class="badge text-bg-primary rounded-pill">Capacidad</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Día de clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Horario de la clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><button class="btn btn-warning">Apuntarme</button></li>
        </ul>

        <ul class="list-group list-group-horizontal flex-fill">
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><h2>Nombre de la clase</h2></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="badge text-bg-primary rounded-pill">Capacidad</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Día de clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Horario de la clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><button class="btn btn-danger">Dar de baja</button></li>
        </ul>

        <ul class="list-group list-group-horizontal flex-fill">
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><h2>Nombre de la clase</h2></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="badge text-bg-primary rounded-pill">Capacidad</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Día de clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><p class="text-center">Horario de la clase</p></li>
            <li class="list-group-item list-group-horizontal-xl min-width flex-fill"><button class="btn btn-warning">Apuntarme</button></li>
        </ul>
    </ul>
    </div>

</div>



<%@ include file="footer.jspf" %>
</body>
</html>