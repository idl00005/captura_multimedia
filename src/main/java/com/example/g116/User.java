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
    private String direccion;
    private String telefono;
    private Date fechaNacimiento;

    public User(int id, String nombre_usuario, String rol, String nombre, String apellidos, String email, String clave,
                String dni, String cp, String ciudad, String direccion, String telefono, Date fechaNacimiento) {
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
        this.direccion = direccion;
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

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}