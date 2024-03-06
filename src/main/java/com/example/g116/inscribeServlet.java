package com.example.g116;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import com.example.g116.User;
import java.util.logging.Logger;

import jakarta.el.BeanELResolver;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "inscribeServlet", value = "/inscripcion")
public class inscribeServlet extends HttpServlet {

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Map<String, String> errores= new HashMap<String, String>();
            System.out.println("Entrando en el método doPost");
            String nombre = request.getParameter("nombre");
            String apellidos = request.getParameter("apellidos");
            String dni = request.getParameter("dni");
            if(!dni.matches("^[0-9]{8}[A-Za-z]$")){
                errores.put("dni", "El DNI introducido no es válido");
            }

            String telefono = request.getParameter("telefono");

            if(telefono.length()<9 || telefono.length()>9 || !telefono.matches("^[0-9]{9}$")){
                errores.put("telefono", "El Teléfonp introducido no es válido");
            }
            String fecha_nacimiento = request.getParameter("fecha_nacimiento");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String direccion = request.getParameter("direccion");
            String ciudad = request.getParameter("ciudad");
            String cp = request.getParameter("cp");

            request.setAttribute("nombre", nombre);
            request.setAttribute("apellidos", apellidos);
            request.setAttribute("dni", dni);
            request.setAttribute("telefono", telefono);
            request.setAttribute("fecha_nacimiento", fecha_nacimiento);
            request.setAttribute("email", email);
            request.setAttribute("password", password);
            request.setAttribute("direccion", direccion);
            request.setAttribute("ciudad", ciudad);
            request.setAttribute("cp", cp);

            if(!errores.isEmpty()){

                request.setAttribute("errores", errores);
                request.getRequestDispatcher("/formularioInscripcion.jsp").forward(request, response);
                return;
            } else {
                request.getRequestDispatcher("/WEB-INF/jsp/inscripcion.jsp").forward(request, response);
            }
        }
}
