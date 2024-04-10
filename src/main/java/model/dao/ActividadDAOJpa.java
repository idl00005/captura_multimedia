package model.dao;

import controller.activityController;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Produces;
import model.validator.Actividad;
import com.example.g116.qualifiers.DAOJpa;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


@RequestScoped
@DAOJpa
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
