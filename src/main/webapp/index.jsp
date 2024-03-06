<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>PowerFit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        .Fondo {
            background-size: cover !important;
            color: white;
            background-position: center;
            background-repeat: no-repeat !important;
            padding-top: 150px !important;
            padding-bottom: 150px !important;
        }
        .imagenFondo1 {
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("./img/maquinas.jpg");
        }
        .imagenFondo2 {
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("./img/clase.webp");
        }
        .display-5 {
            color: white !important;
        }
        .btn-limited-width {
            margin-top: 230px;
            font-weight: bold;
            width: 350px !important;
            max-height: 50px !important;
        }
        ul {
            list-style-type: none;
        }
        .lista-derecha {
            text-align: right;
        }
    </style>
</head>
<body>
<%@ include file="header.jspf" %>

<div class="Fondo imagenFondo1 px-4 py-5">

    <div class="col-lg-6 mx-auto d-flex ">
        <div>
            <ul>
                <li><h1 class="display-5 fw-bold text-body-emphasis">ENTRENA COMO UN ATLETA CON EL MEJOR EQUIPAMIENTO</h1></li>
                <li><h3 class="note">54 máquinas distintas</h3></li>
                <li><h3 class="note">Zona de peso libre</h3></li>
                <li><h3 class="note">Zona de cardio</h3></li>
            </ul>
        </div>
        <button type="button" class="btn btn-warning btn-lg px-4 gap-3 btn-limited-width">INSCRÍBETE</button>
    </div>
</div>

<div class="Fondo imagenFondo2 px-4 py-5">

    <div class="col-lg-6 mx-auto d-flex ">
        <button type="button" class="btn btn-warning btn-lg px-4 gap-3 btn-limited-width">CONSULTAR CLASES</button>
        <div>
            <ul class="lista-derecha">
                <li><h1 class="display-5 fw-bold text-body-emphasis">8 CLASES DIRIGIDAS DISTINTAS</h1></li>
                <li><h3 class="note">Dirigidas por profesionales</h3></li>
                <li><h3 class="note">altamente cualificados que</h3></li>
                <li><h3 class="note">llevaran tu experiencia</h3></li>
                <li><h3 class="note">al siguiente nivel</h3></li>
            </ul>
        </div>
    </div>
</div>
<%@ include file="footer.jspf" %>