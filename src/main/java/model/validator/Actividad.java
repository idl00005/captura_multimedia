package model.validator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Actividad {
   @Id
    private int id=0;
    private String nombre;
    private Date fecha;
    private String diaSemana;
    private String capacidad;

    public Actividad(int id, String nombre, Date fecha, String diaSemana, String capacidad) {
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

    public String getCapacidad() {
        return capacidad;
    }
}
