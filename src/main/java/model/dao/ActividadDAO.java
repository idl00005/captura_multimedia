package model.dao;

import model.validator.Actividad;
import controller.activityController;

import java.util.ArrayList;
import java.util.List;

public class ActividadDAO{
    List<Actividad> activities = new ArrayList<>();
    activityController activityController;

    public ActividadDAO(List<Actividad> activities, activityController activityController) {
        this.activities.addAll(activities);
        this.activityController = activityController;
    }

    public void recupera(int activity) {
        System.out.println("recupera");
        for (Actividad acti : activities) {
            if (acti.getId() == activity) {
                activityController.setIdActividad(acti.getId());
                activityController.setActividad(acti);
            }
        }
    }
}
