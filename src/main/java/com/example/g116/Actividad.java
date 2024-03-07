package com.example.g116;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;

import java.util.ArrayList;

public class Actividad {
    private int id;

    private String nombre;

    private String descripcion;

    private ArrayList<User> inscritos = new ArrayList<>();

    private User monitor;

    public Actividad(int id, String nombre, String descripcion, ArrayList<User> inscritos, User monitor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.inscritos = inscritos;
        this.monitor = monitor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<User> getInscritos() {
        return inscritos;
    }

    public User getMonitor() {
        return monitor;
    }
}
