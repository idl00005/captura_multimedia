package com.example.g116;

import java.io.*;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    private final Logger log = Logger.getLogger( LoginServlet.class.getName() );

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        log.info("Se esta procesando un POST");

        String identifier = request.getParameter("identifier");
        String password = request.getParameter("password");

        // Supongamos que tienes un método checkCredentials que verifica las credenciales del usuario
        User user = checkCredentials(identifier, password);

        if (user != null) {
            // Si las credenciales son correctas, establece un atributo en la sesión y redirige al usuario
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", user);
            response.sendRedirect("index.jsp");
        } else {
            // Si las credenciales no son correctas, envía un mensaje de error
            request.setAttribute("errorMessage", "Identificador o contraseña incorrectos");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
            dispatcher.forward(request, response);
        }
    }

    private User checkCredentials(String identifier, String password) {
        // Aquí deberías verificar las credenciales del usuario
        // Por ahora, este método solo devuelve null
        return null;
    }
}
