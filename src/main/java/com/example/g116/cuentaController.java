package com.example.g116;

import com.example.g116.User;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpSession;

import java.io.Serializable;

@Named("cuentaController")
@ViewScoped
public class cuentaController implements Serializable {
    private User user;

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
        String newCp = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("cp");
        String newCiudad = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("ciudad");
        String newDireccion = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("direccion");
        String newTelefono = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("telefono");
        String newEmail = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("email");

        user.setCp(newCp);
        user.setCiudad(newCiudad);
        user.setDireccion(newDireccion);
        user.setTelefono(newTelefono);
        user.setEmail(newEmail);

        return "cuenta?faces-redirect=true";
    }
}