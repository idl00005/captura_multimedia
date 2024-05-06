package controller;
import com.example.g116.qualifiers.DAOJpaUser;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jakarta.servlet.http.Part;
import model.dao.UserDAOJpa;
import model.validator.User;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Set;

@Named("cuentaController")
@ViewScoped
public class cuentaController implements Serializable {
    @Inject @DAOJpaUser
    private UserDAOJpa userDAOJpa;
    private User user;
    private Part file;
    private String profileImageUrl = "img/foto_perfil_por_defecto.webp";
    public cuentaController() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        user = (User) session.getAttribute("loggedInUser");
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String updateUser() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<User>> violations = validator.validate(user);

        if (!violations.isEmpty()) {
            for (ConstraintViolation<User> violation : violations) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, violation.getMessage(), null));
            }
            return null;
        }

        // Actualiza los datos del usuario en la base de datos
        userDAOJpa.update(user);

        return "cuenta?faces-redirect=true";
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;

        if (file != null && file.getContentType().startsWith("image/")) {
            String fileName = Paths.get(file.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
            String directory = "./img"; // Replace with your directory
            Path path = Paths.get(directory, fileName);

            try (InputStream input = file.getInputStream()) {
                Files.copy(input, path, StandardCopyOption.REPLACE_EXISTING);
                this.profileImageUrl = "./img" + fileName; // Replace with your URL path
            } catch (IOException e) {
                // Handle the exception
            }
        }
    }
}