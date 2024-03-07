<%@ page contentType="text/html; charset=UTF-8" %>


<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  <style>
    body {
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
      display: flex;
      justify-content: center;
      height: 100vh;
      background-color: #f1f1f1;
    }

    .container {
      text-align: center;
    }

    #login-form input[type="text"],
    #login-form input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-top: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    #login-form button {
      width: 100%;
      padding: 10px;
      background-color: #ffbb00;
      color: black;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    #login-form button:hover {
      background-color: #c7950a;
    }

    .signup-link {
      font-size: 14px;
    }
  </style>
</head>
<body>
<div class="container my-auto">
  <div class="row p-4 pb-0 pe-lg-0 pt-lg-5 align-items-center rounded-3 border shadow-lg">
    <main class="form-signin w-100 m-auto" style="max-width: 500px">
      <form action="login-servlet" method="post">
        <img class="mb-4" src="./img/logoblack.png" alt="" width="250" height="80">
        <h1 class="h3 mb-3 fw-normal"><strong>BIENVENIDO A TU ESPACIO</strong></h1>
        <div class="form-floating">
          <input type="email" class="form-control" id="floatingInput" name="identifier" placeholder="name@example.com">
          <label for="floatingInput">Identificador</label>
        </div>
        <div class="form-floating" style="margin-top: 20px">
          <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password">
          <label for="floatingPassword">Contraseña</label>
        </div>
        <div style="color: red">${errorMessage}</div>
        <button class="btn btn-primary w-100 py-2" type="submit" style="margin-top: 20px">Sign in</button>
        <p class="mt-5 mb-3 text-body-secondary">© 2017–2024</p>
      </form>
    </main>
      <p class="signup-link">¿Aún no tienes cuenta? </p>
      <p><a href="eligeSuscripcion.jsp">¡Inscríbete ahora!</a></p>
    </div>
</div>
</body>
</html>