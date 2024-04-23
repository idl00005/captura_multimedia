package model.dao;

import controller.activityController;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.validator.Actividad;
import com.example.g116.qualifiers.DAOJpaActividad;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@RequestScoped
@DAOJpaActividad
@Transactional
public class ActividadDAOJpa implements ActividadDAO{

    @PersistenceContext
            private EntityManager em;

    private static final Logger logger = Logger.getLogger(ActividadDAOJpa.class.getName());

    activityController activityController;
    public List<Actividad> buscaTodos(){
        List<Actividad> l;
        try{
            l=em.createQuery("SELECT l FROM Actividad l",Actividad.class).getResultList();
        }catch (Exception e){
            logger.log(Level.SEVERE,"No se pueden recuperar las actividades",e);
            l=new ArrayList<>();
        }
        return l;
    }

    public List<Actividad> buscarPorDia(String dias){
        List<Actividad> l;
        try{
            l = em.createQuery("SELECT l FROM Actividad l WHERE l.diaSemana = :dias", Actividad.class)
                    .setParameter("dias", dias)
                    .getResultList();        }catch (Exception e){
            logger.log(Level.SEVERE,"No se pueden recuperar las actividades",e);
            l=new ArrayList<>();
        }
        return l;
    }
    public List<Actividad> buscarPorNombre(String nombre){
        List<Actividad> listaActividades;
        try {
            listaActividades = em.createQuery("SELECT a FROM Actividad a WHERE LOWER(a.nombre) LIKE LOWER(:nombre)", Actividad.class)
                    .setParameter("nombre", "%" + nombre.toLowerCase() + "%")
                    .getResultList();
        } catch (Exception e) {
            logger.log(Level.SEVERE,"No se pueden recuperar las actividades",e);
            listaActividades = new ArrayList<>();
        }
        return listaActividades;
    }

    public Actividad buscarPorId(int id){
        Actividad l = null;
        try{
            l = em.createQuery("SELECT l FROM Actividad l WHERE l.id = :id", Actividad.class)
                    .setParameter("id", id)
                    .getSingleResult();
        }catch (Exception e){
            logger.log(Level.SEVERE,"No se pueden recuperar las actividades",e);
        }
        return l;
    }
    

    @Override
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
