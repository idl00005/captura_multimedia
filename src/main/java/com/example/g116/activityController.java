package com.example.g116;


import jakarta.annotation.ManagedBean;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named("activityController")
@ViewScoped
@ManagedBean
public class activityController implements Serializable {

    private ArrayList<Actividad> activities;

    public activityController() {
        activities = new ArrayList<>();

        activities.add(new Actividad(1, "Pilates", "Clase de pilates",
                new User(1, "Monitor 1", "","","","",
                        "","","","","","",new Date("2021/01/01")),
                new Date("2021/01/01"), LocalTime.of(12,12)));


        System.out.println("activityController created");
    }

    public ArrayList<Actividad> getActivities() {
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

    public List<Actividad> searchActivitiesByDay(String dayOfWeek) {
        List<Actividad> result = new ArrayList<>();
        for (Actividad activity : activities) {
            if (activity.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
                result.add(activity);
            }
        }
        return result;
    }
}
