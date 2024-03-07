package com.example.g116;


import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Named
@SessionScoped
public class activityContoller implements Serializable {

    private ArrayList<Actividad> activities = new ArrayList<>();

    public activityContoller() {
        activities.add(new Actividad(1, "Pilates", "Clase de pilates",
                new User(1, "Monitor 1", "","","","",
                        "","","","","","",new Date("2021-01-01"))));
    }

    public ArrayList<Actividad> getActivities() {
        return activities;
    }
    public void addActivity(Actividad activity) {
        this.activities.add(activity);
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
