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
    public void apuntarUsuarioActividad(int id_usuario, int id_actividad);

    public void desapuntarUsuarioActividad(int id_usuario, int id_actividad);

    public boolean estaApuntado(int id_usuario, int id_actividad);
    public void borrarApuntadosActividad(int id_actividad);
}
