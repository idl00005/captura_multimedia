package com.example.g116;


import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named("activityController")
@ViewScoped
public class activityController implements Serializable {

    private List<Actividad> activities;
    private Actividad actividad;

    private int idActividad;

    public activityController() {
        activities = new ArrayList<>();
        activities.add(new Actividad(1, "Yoga", new Date("2024/03/8"), "15:00",
                "Miércoles", "4"));
        activities.add(new Actividad(2, "Pilates", new Date("2024/12/12"), "10:00",
                "Lunes", "10"));
    }

    public Actividad buscarActividadPorId(){
        for (Actividad acti : activities) {
            if (acti.getId() == idActividad) {
                actividad=acti;

            }
        }
        return null;
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
        return activities;
    }
    public void apuntarse() {
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
/*
    public List<Actividad> searchActivitiesByDay(String dayOfWeek) {

        List<Actividad> result = new ArrayList<>();
        for (Actividad activity : activities) {
            if (activity.getFecha(). == dayOfWeek{
                result.add(activity);
            }
        }
        return result;


    }

 */
}
