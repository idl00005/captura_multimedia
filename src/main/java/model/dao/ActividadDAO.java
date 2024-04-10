package model.dao;

import model.validator.Actividad;

import java.util.ArrayList;
import java.util.List;

public interface ActividadDAO {
    List<Actividad> activities = new ArrayList<>();
    public List<Actividad> buscaTodos();
    public void recupera(int activity);
}
