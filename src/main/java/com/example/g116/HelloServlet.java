package com.example.g116;

import java.io.*;
import java.util.logging.Logger;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    private final Logger log = Logger.getLogger( HelloServlet.class.getName() );

    public void init() {
        message = "Hola!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("Se esta procesando un GET");
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        log.info("Se esta procesando un POST");

        String html="";
        response.getWriter().println(html);
    }


    public void destroy() {
    }
}