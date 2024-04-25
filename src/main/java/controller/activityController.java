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
import model.dao.ActividadUsuarioDAOjpa;
import model.dao.UserDAOJpa;
import model.validator.Actividad;
import model.validator.User;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Named("activityController")
@ViewScoped
public class activityController implements Serializable {
    @Inject @DAOJpaActividad
    private ActividadDAOJpa actividadDAOJpa;
    @Inject @DAOJpaActividad
    private ActividadUsuarioDAOjpa actividadUsuarioDAOjpa;
    private String nombre;
    private Date fecha;
    private String diaSemana;

    private int capacidad;

    private List<Actividad> activities;
    private Actividad actividad;
    private String selectedDay= "Lunes";
    private String searchName;
    FacesContext context;
    User loggedInUser;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    private int idActividad=0;

    public void busquedaPorDias(String dia){
        activities.clear();
        activities = actividadDAOJpa.buscarPorDia(dia);
    }

    public void buscarActividadPorId(){
        actividad = actividadDAOJpa.buscarPorId(idActividad);
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

    public Date getFecha() {
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        int dia = calendar.get(Calendar.DAY_OF_WEEK);

        switch (dia) {
            case Calendar.SUNDAY:
                diaSemana = "Domingo";
                break;
            case Calendar.MONDAY:
                diaSemana = "Lunes";
                break;
            case Calendar.TUESDAY:
                diaSemana = "Martes";
                break;
            case Calendar.WEDNESDAY:
                diaSemana = "Miércoles";
                break;
            case Calendar.THURSDAY:
                diaSemana = "Jueves";
                break;
            case Calendar.FRIDAY:
                diaSemana = "Viernes";
                break;
            case Calendar.SATURDAY:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Día no válido";
                break;
        }

    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String submit() throws IOException {
        Actividad newActivity = new Actividad(actividadDAOJpa.size()+1, nombre, fecha, diaSemana, capacidad);
        actividadDAOJpa.nuevaActividad(newActivity);

        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath() + "/buscaClases.xhtml");
        return null;
    }

    public void borrarActividad(int id) throws IOException {
        actividadDAOJpa.borrarActividad(id);
        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath() + "/buscaClases.xhtml");
    }
    public MethodExpression getUpdateActivities() {
        return null;
    }
    public int getNApuntados( int id){
        return actividadUsuarioDAOjpa.usuariosDeActividad(id).size();
    }

    public void apuntarse(int id_actividad){
        recupera(id_actividad);
        context = FacesContext.getCurrentInstance();
        loggedInUser = (User) context.getExternalContext().getSessionMap().get("loggedInUser");
        actividadUsuarioDAOjpa.apuntarUsuarioActividad(loggedInUser,actividad);
    }

    public void desapuntarse(int id_actividad){
        recupera(id_actividad);
        context = FacesContext.getCurrentInstance();
        loggedInUser = (User) context.getExternalContext().getSessionMap().get("loggedInUser");
        actividadUsuarioDAOjpa.desapuntarUsuarioActividad(loggedInUser,actividad);
    }

    public boolean estaApuntado(int id_actividad){
        context = FacesContext.getCurrentInstance();
        loggedInUser = (User) context.getExternalContext().getSessionMap().get("loggedInUser");
        return actividadUsuarioDAOjpa.estaApuntado(loggedInUser.getId(),id_actividad);
    }
}