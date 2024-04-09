package com.example.g116;

import java.io.*;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.validator.User;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    private final Logger log = Logger.getLogger( LoginServlet.class.getName() );

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        log.info("Procesando petición POST en login-servlet");

        String identifier = request.getParameter("identifier");
        String password = request.getParameter("password");

        // Obtén el objeto UsuariosRegistrados
        UsuariosRegistrados usuarios = AppConfig.getInstance().getUsuariosRegistrados();

        // Ahora puedes usar el objeto usuarios para verificar las credenciales
        User usuario = usuarios.comprobar_Usuario_Registrado(identifier, password);

        if (usuario!=null) {
            // Si las credenciales son correctas, establece un atributo en la sesión y redirige al usuario
            log.info("Credenciales correctas, redirigiendo al usuario a index.jsp");
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", usuario);
            response.sendRedirect("index.jsp");
        } else {
            log.warning("Credenciales incorrectas, redirigiendo al usuario a login.jsp");
            // Si las credenciales no son correctas, envía un mensaje de error
            request.setAttribute("errorMessage", "Identificador o contraseña incorrectos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }

}
