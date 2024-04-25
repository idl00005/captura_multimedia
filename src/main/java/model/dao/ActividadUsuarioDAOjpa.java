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
import java.util.logging.Level;
import java.util.logging.Logger;



@RequestScoped
@DAOJpaActividad
@Transactional
public class ActividadUsuarioDAOjpa {
    private static final Logger logger = Logger.getLogger(ActividadUsuarioDAOjpa.class.getName());

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
    public void apuntarUsuarioActividad(User usuario, Actividad actividad){

        List<ActividadUsuario> actividadUsuarios = em.createQuery(
                        "SELECT au FROM ActividadUsuario au WHERE au.usuario.id = :id_usuario AND au.actividad.id = :id_actividad",
                        ActividadUsuario.class)
                .setParameter("id_usuario", usuario.getId())
                .setParameter("id_actividad", actividad.getId())
                .getResultList();

        if (actividadUsuarios.isEmpty()) {
            ActividadUsuario au = new ActividadUsuario();
            au.setUsuario(usuario);
            au.setActividad(actividad);

            em.persist(au);
        }
    }

    public void desapuntarUsuarioActividad(User usuario, Actividad actividad){
        List<ActividadUsuario> actividadUsuarios = em.createQuery(
                        "SELECT au FROM ActividadUsuario au WHERE au.usuario.id = :id_usuario AND au.actividad.id = :id_actividad",
                        ActividadUsuario.class)
                .setParameter("id_usuario", usuario.getId())
                .setParameter("id_actividad", actividad.getId())
                .getResultList();

        if (!actividadUsuarios.isEmpty()) {
            em.remove(actividadUsuarios.get(0));
        }
    }

    public boolean estaApuntado(int id_usuario, int id_actividad){
        boolean apuntado = false;
        try {
            List<ActividadUsuario> actividadUsuarios = em.createQuery(
                            "SELECT au FROM ActividadUsuario au WHERE au.usuario.id = :id_usuario AND au.actividad.id = :id_actividad",
                            ActividadUsuario.class)
                    .setParameter("id_usuario", id_usuario)
                    .setParameter("id_actividad", id_actividad)
                    .getResultList();

            if (!actividadUsuarios.isEmpty()) {
                apuntado = true;
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "No se puede comprobar si el usuario está apuntado a la actividad", e);
        }
        return apuntado;
    }
}
