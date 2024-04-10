package model.dao;

import com.example.g116.qualifiers.DAOJpaUser;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.validator.User;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
@RequestScoped
@DAOJpaUser
@Transactional
public class UserDAOJpa implements UserDAO{
    @PersistenceContext
    EntityManager em;

    private static final Logger logger = Logger.getLogger(UserDAOJpa.class.getName());

    public List<User> buscaTodos(){
        List<User> l;
        try{
            l=em.createQuery("SELECT l FROM User l",User.class).getResultList();
        }catch (Exception e){
            logger.log(Level.SEVERE,"No se pueden recuperar los usuarios",e);
            l=new ArrayList<>();
        }
        return l;
    }
}