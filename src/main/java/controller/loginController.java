package controller;

import com.example.g116.qualifiers.DAOJpaUser;
import jakarta.inject.Inject;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import model.dao.UserDAOJpa;
import model.validator.User;

import java.io.IOException;
import java.io.Serializable;
import java.security.Principal;
import java.util.List;
import java.util.logging.Logger;

@Named("loginController")
@ViewScoped
public class loginController implements Serializable {
    @Inject @DAOJpaUser
    private UserDAOJpa userDAOJpa;
    //@Inject HttpServletRequest request;
    private String identifier;
    private String password;

    private final Logger log = Logger.getLogger(loginController.class.getName());

    public void login() throws IOException, ServletException {
        log.info("Procesando petición POST en loginController");
        List<User> users = userDAOJpa.buscaTodos();
        FacesContext facesContext = FacesContext.getCurrentInstance();
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
            facesContext.getExternalContext().getSessionMap().put("role", userLogin.getRol());
            facesContext.getExternalContext().redirect("index.xhtml");
        } else {
            log.warning("Credenciales incorrectas, redirigiendo al usuario a login.xhtml");
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

    public void logout() throws IOException, ServletException {
        //request.logout();
        //request.getSession().invalidate();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
    }
    public void checkRole() throws IOException {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String role = (String) facesContext.getExternalContext().getSessionMap().get("role");
        if (role == null || (!role.equals("USER") && !role.equals("ADMIN"))) {
            facesContext.getExternalContext().redirect("login.xhtml");
        }
    }
}
