package model.validator;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Actividad {
   @Id
    private int id=0;
    private String nombre;
    private Date fecha;
    private String diaSemana;
    private int capacidad;

    public Actividad(int id, String nombre, Date fecha, String diaSemana, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.diaSemana = diaSemana;
        this.capacidad = capacidad;
    }

    public Actividad() {

    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
