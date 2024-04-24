package controller;

import com.example.g116.qualifiers.DAOJpaActividad;
import jakarta.el.MethodExpression;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import model.dao.ActividadDAO;
import model.dao.ActividadDAOJpa;
import model.validator.Actividad;
import model.validator.User;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Named("activityController")
@ViewScoped
public class activityController implements Serializable {
    @Inject @DAOJpaActividad
    private ActividadDAOJpa actividadDAOJpa;

    private String nombre;
    private String fecha;
    private String diaSemana;

    private int capacidad;

    private List<Actividad> activities;
    private Actividad actividad;
    private String selectedDay="Lunes";
    private String searchName;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    private int idActividad=0;

    public activityController() {
    }

    public List<Actividad> busquedaPorDias(String dias){
        return actividadDAOJpa.buscarPorDia(dias);
    }

    public Actividad buscarActividadPorId(){
        actividad = actividadDAOJpa.buscarPorId(idActividad);
        return null;
    }


    public void recupera(int activity) {
        System.out.println("recupera");
        for (Actividad acti : activities) {
            if (acti.getId() == activity) {
                idActividad = acti.getId();
                actividad = acti;
            }
        }
    }
    public void buscarPorNombre(String nombre){
        activities.clear();
        activities = actividadDAOJpa.buscarPorNombre(nombre);
    }

    public void reset(){
        actividad=null;
    }


    public Actividad getActividad() {
        return actividad;
    }


    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdActividad() {
        return idActividad;
    }


    public List<Actividad> getActivities() {
        if(activities==null){
            activities = actividadDAOJpa.buscaTodos();
        }
        return activities;
    }
    public void apuntarse() {
    }

    public String getSelectedDay() {
        return selectedDay;
    }

    public void setSelectedDay(String selectedDay) {
        this.selectedDay = selectedDay;
    }

    public void removeActivity(Actividad activity) {
        this.activities.remove(activity);
    }

    public void updateActivity(Actividad activity) {
        for (int i = 0; i < activities.size(); i++) {
            if (activities.get(i).getId() == activity.getId()) {
                activities.set(i, activity);
                break;
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String submit() throws IOException {
        Actividad newActivity = new Actividad(actividadDAOJpa.size()+1, nombre, new Date(fecha), diaSemana, capacidad);
        actividadDAOJpa.nuevaActividad(newActivity);

        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath() + "/buscaClases.xhtml");
        return null;
    }

    public void borrarActividad(int id){
        actividadDAOJpa.borrarActividad(id);
    }
    public MethodExpression getUpdateActivities() {
        return null;
    }
}