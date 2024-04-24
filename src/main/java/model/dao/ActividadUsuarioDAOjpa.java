package model.dao;

import com.example.g116.qualifiers.DAOJpaActividad;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.validator.Actividad;
import model.validator.ActividadUsuario;
import model.validator.User;

import java.util.ArrayList;
import java.util.List;

@RequestScoped
@DAOJpaActividad
@Transactional
public class ActividadUsuarioDAOjpa {
    @PersistenceContext
    private EntityManager em;
    public List<Actividad> actividadesDeUsuario(int id_usuario){
        List<ActividadUsuario> actividadUsuarios = em.createQuery(
                        "SELECT au FROM ActividadUsuario au WHERE au.usuario.id = :id_usuario",
                        ActividadUsuario.class)
                .setParameter("id_usuario", id_usuario)
                .getResultList();

        List<Actividad> actividades = new ArrayList<>();
        for (ActividadUsuario au : actividadUsuarios) {
            actividades.add(au.getActividad());
        }
        return actividades;
    }
    public List<User> usuariosDeActividad(int id_actividad){
        List<ActividadUsuario> actividadUsuarios = em.createQuery(
                        "SELECT au FROM ActividadUsuario au WHERE au.actividad.id = :id_actividad",
                        ActividadUsuario.class)
                .setParameter("id_actividad", id_actividad)
                .getResultList();

        List<User> usuarios = new ArrayList<>();
        for (ActividadUsuario au : actividadUsuarios) {
            usuarios.add(au.getUsuario());
        }
        return usuarios;
    }
}
