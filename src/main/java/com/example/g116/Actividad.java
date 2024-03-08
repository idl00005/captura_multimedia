package com.example.g116;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Actividad {
    private int id=0;

    private String nombre="";

    private String descripcion="";

    private ArrayList<User> inscritos = new ArrayList<>();

    private User monitor=null;
    private Date fecha=null;
    private LocalTime hora=null;

    public Actividad(){

    }

    public Actividad(int id, String nombre, String descripcion, User monitor, Date fecha, LocalTime hora) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.monitor = monitor;
        this.fecha = fecha;
        this.hora = hora;
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
    public Date getFecha() {
        return fecha;
    }
    public String getDayOfWeek() {
        LocalDate localDate = fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getDayOfWeek().toString();
    }

    public LocalTime getHora() {
        return hora;
    }
}
