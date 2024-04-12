package controller;

import com.example.g116.qualifiers.DAOJpaUser;
import jakarta.inject.Inject;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import model.dao.UserDAOJpa;
import model.validator.User;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Named("loginController")
@ViewScoped
public class loginController implements Serializable {
    @Inject @DAOJpaUser
    private UserDAOJpa userDAOJpa;

    private String identifier;
    private String password;

    private final Logger log = Logger.getLogger(loginController.class.getName());

    public void login() throws IOException {
        log.info("Procesando petición POST en loginController");

        FacesContext facesContext = FacesContext.getCurrentInstance();

        List<User> users = userDAOJpa.buscaTodos();
        User userLogin = null;
        for (User user : users) {
            if ((user.getNombre_usuario().equals(identifier) || user.getEmail().equals(identifier))
                    && user.getClave().equals(password)) {
                userLogin = user;
            }
        }

        if (userLogin != null) {
            // Si las credenciales son correctas, establece un atributo en la sesión y redirige al usuario
            log.info("Credenciales correctas, redirigiendo al usuario a index.jsf");
            facesContext.getExternalContext().getSessionMap().put("loggedInUser", userLogin);
            facesContext.getExternalContext().redirect("index.xhtml");
        } else {
            log.warning("Credenciales incorrectas, redirigiendo al usuario a login.xhtml");
            // Si las credenciales no son correctas, envía un mensaje de error
            facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Identificador o contraseña incorrectos", null));
        }
    }

    // Getters y setters
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isLoggedIn() {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loggedInUser") != null;
    }
    public void logout() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }
}
