package com.example.g116;

import java.util.Date;

public class User {
    private int id;
    private String nombre_usuario;
    private String rol;
    private String nombre;
    private String apellidos;
    private String email;
    private String clave;
    private String dni;
    private String cp;
    private String ciudad;
    private String telefono;
    private Date fechaNacimiento;

    public User(int id, String nombre_usuario, String rol, String nombre, String apellidos, String email, String clave,
                String dni, String cp, String ciudad, String telefono, Date fechaNacimiento) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.rol = rol;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.clave = clave;
        this.dni = dni;
        this.cp = cp;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }
}