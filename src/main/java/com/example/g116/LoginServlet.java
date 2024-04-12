package com.example.g116;

import com.example.g116.qualifiers.DAOJpaUser;
import controller.cuentaController;
import jakarta.inject.Inject;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.dao.UserDAOJpa;
import model.validator.User;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@WebServlet(name = "loginServlet", value = "/login-servlet")
public class LoginServlet extends HttpServlet {
    @Inject @DAOJpaUser
    private UserDAOJpa userDAOJpa;

    private final Logger log = Logger.getLogger( LoginServlet.class.getName() );

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        log.info("Procesando petición POST en login-servlet");

        String identifier = request.getParameter("identifier");
        String password = request.getParameter("password");

        User userLogin = userDAOJpa.findUserByUsername(identifier);

        if (userLogin!=null && userLogin.getClave().equals(password)){
            // Si las credenciales son correctas, establece un atributo en la sesión y redirige al usuario
            log.info("Credenciales correctas, redirigiendo al usuario a index.jsp");
            HttpSession session = request.getSession();
            session.setAttribute("loggedInUser", userLogin);
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
