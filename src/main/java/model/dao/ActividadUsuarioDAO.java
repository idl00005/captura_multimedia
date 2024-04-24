package model.dao;

import model.validator.ActividadUsuario;
import java.util.ArrayList;
import java.util.List;
import model.validator.Actividad;
import model.validator.ActividadUsuario;
import model.validator.User;
public interface ActividadUsuarioDAO {
    public List<Actividad> actividadesDeUsuario(int id_usuario);
    public List<User> usuariosDeActividad(int id_actividad);
}
