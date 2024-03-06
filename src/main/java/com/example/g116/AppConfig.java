package com.example.g116;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Named;

import java.util.Date;
import java.util.logging.Logger;

@FacesConfig //enable JSF front-controller
@ApplicationScoped
@Named("app")
public class AppConfig {
    private static AppConfig instance = null;
    private UsuariosRegistrados usuarios;
    private final String message = "Welcome DAW!";
    private final Logger log=Logger.getLogger(AppConfig.class.getName());
    public AppConfig() {
        log.info("Application started");
        UsuariosRegistrados usuarios = new UsuariosRegistrados();
        usuarios.anadir_Usuario(new User(1, "ignacio", "admin", "Ignacio",
                "Delgado Lobelle", "idl00005@red.ujaen.es", "1234", "12345678A", "23071", "Jaén", "684331639", new Date("2001/07/15")));
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
