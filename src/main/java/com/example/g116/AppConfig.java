package com.example.g116;

import com.example.g116.qualifiers.DAOJpaActividad;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import model.dao.ActividadDAOJpa;
import model.validator.User;

import java.util.Date;
import java.util.logging.Logger;

@FacesConfig //enable JSF front-controller
@ApplicationScoped
@Named("app")
public class AppConfig {
    @Inject @DAOJpaActividad
    private ActividadDAOJpa actividadDAOJpa;
    private static AppConfig instance = null;
    private UsuariosRegistrados usuarios= new UsuariosRegistrados();
    private final String message = "Welcome DAW!";
    private final Logger log=Logger.getLogger(AppConfig.class.getName());
    public AppConfig() {
        log.info("Application started");
    }
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
    public UsuariosRegistrados getUsuariosRegistrados() {
        return usuarios;
    }

    public String getWelcomeMessage() {
        return message;
    }

}
