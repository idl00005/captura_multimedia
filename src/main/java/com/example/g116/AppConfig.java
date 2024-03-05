package daw.app;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Named;

import java.util.logging.Logger;

@FacesConfig //enable JSF front-controller
@ApplicationScoped
@Named("app")
public class AppConfig {

    private final String message = "Welcome DAW!";
    private final Logger log=Logger.getLogger(AppConfig.class.getName());
    public AppConfig() {
        log.info("Application started");
    }

    public String getWelcomeMessage() {
        return message;
    }
}
