package com.example.g116;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class Actividad {
    private int id;

    private String nombre;
    private Date fecha;
    private String hora;
    private String diaSemana;
    private String capacidad;

    public Actividad(int id, String nombre, Date fecha, String hora, String diaSemana, String capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.diaSemana = diaSemana;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public String getCapacidad() {
        return capacidad;
    }
}
