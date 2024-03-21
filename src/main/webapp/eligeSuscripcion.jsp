<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Elige tu suscripción</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
</head>
<body>

<%@ include file="header.jspf" %>

<div class="px-4 py-5 text-center">
    <h1 class="display-5 fw-bold text-body-emphasis">Elige tu suscripción</h1>
    <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">Elige la suscripción que más se adapte a tus necesidades y empieza a disfrutar de todas las ventajas de POWERFIT</p>
    </div>
</div>

<div class="container-fluid d-flex flex-column flex-md-row p-4 gap-4 py-md-5 align-items-center justify-content-center flex-fill">
    <div class="modal-dialog" role="document">
        <div class="modal-content rounded-4 shadow" style="background-color: #f2f4f8">
            <div class="modal-body p-5">
                <h2 class="fw-bold mb-0 text-center text-info fw-bold">CLASSIC</h2>

                <ul class="d-grid gap-4 my-5 list-unstyled small">
                    <li class="d-flex gap-4">
                        <svg class="bi text-body-secondary flex-shrink-0" width="48" height="48"><use xlink:href="#grid-fill"></use></svg>
                        <div>
                            <h5 class="mb-0">Acceso ilimitado al club</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-warning flex-shrink-0" width="48" height="48"><use xlink:href="#bookmark-star"></use></svg>
                        <div>
                            <h5 class="mb-0">Acceso gratuito a video-clases</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-primary flex-shrink-0" width="48" height="48"><use xlink:href="#film"></use></svg>
                        <div>
                            <h5 class="mb-0">Entrena y sigue tus progresos con la APP</h5>
                        </div>
                    </li>
                </ul>
                <h2 class="text-center text-warning fw-bold text-decoration-underline">30€/mes</h2>

                <a type="button" class="btn btn-lg btn-warning mt-5 w-100" data-bs-dismiss="modal" href="formularioInscripcion.xhtml">Elegir esta oferta!</a>
            </div>
        </div>
    </div>

    <div class="modal-dialog" role="document">
        <div class="modal-content rounded-4 shadow" style="background-color: #f2f4f8">
            <div class="modal-body p-5">
                <h2 class="fw-bold mb-0 text-center text-info fw-bold">ACCESS+</h2>
                <ul class="d-grid gap-4 my-5 list-unstyled small">
                    <li class="d-flex gap-4">
                        <svg class="bi text-body-secondary flex-shrink-0" width="48" height="48"><use xlink:href="#grid-fill"></use></svg>
                        <div>
                            <h5 class="mb-0">Inscripción CLASSIC incluída</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-warning flex-shrink-0" width="48" height="48"><use xlink:href="#bookmark-star"></use></svg>
                        <div>
                            <h5 class="mb-0">Piscina de hidromasaje incluída</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-primary flex-shrink-0" width="48" height="48"><use xlink:href="#film"></use></svg>
                        <div>
                            <h5 class="mb-0">Balanza de análisis corporal y seguimiento</h5>
                        </div>
                    </li>
                </ul>
                <h2 class="text-center text-warning fw-bold text-decoration-underline">37€/mes</h2>
                <a type="button" class="btn btn-lg btn-warning mt-5 w-100" data-bs-dismiss="modal" href="formularioInscripcion.xhtml">Elegir esta oferta!</a>
            </div>
        </div>
    </div>

    <div class="modal-dialog" role="document">
        <div class="modal-content rounded-4 shadow" style="background-color: #f2f4f8">
            <div class="modal-body p-5">
                <h2 class="fw-bold mb-0 text-center text-info fw-bold">ULTIMATE</h2>

                <ul class="d-grid gap-4 my-5 list-unstyled small">
                    <li class="d-flex gap-4">
                        <svg class="bi text-body-secondary flex-shrink-0" width="48" height="48"><use xlink:href="#grid-fill"></use></svg>
                        <div>
                            <h5 class="mb-0">Suscripción ACCESS+ incluída</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-warning flex-shrink-0" width="48" height="48"><use xlink:href="#bookmark-star"></use></svg>
                        <div>
                            <h5 class="mb-0">Entrenamiento con un invitado/a</h5>
                        </div>
                    </li>
                    <li class="d-flex gap-4">
                        <svg class="bi text-primary flex-shrink-0" width="48" height="48"><use xlink:href="#film"></use></svg>
                        <div>
                            <h5 class="mb-0">Clases de boxeo (Fight Park) incluídas</h5>
                        </div>
                    </li>
                </ul>
                <h2 class="text-center text-warning fw-bold text-decoration-underline">42€/mes</h2>
                <a type="button" class="btn btn-lg btn-warning mt-5 w-100" data-bs-dismiss="modal" href="formularioInscripcion.xhtml">Elegir esta oferta!</a>
            </div>
        </div>
    </div>


</div>
<%@ include file="footer.jspf" %>

</body>
</html>
