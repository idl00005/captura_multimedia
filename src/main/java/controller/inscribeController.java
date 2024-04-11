package controller;

import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.g116.AppConfig;
import com.example.g116.qualifiers.DAOJpaUser;
import jakarta.inject.Inject;
import model.dao.UserDAOJpa;
import model.validator.User;
import com.example.g116.UsuariosRegistrados;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("inscribeController")
@ViewScoped
public class inscribeController implements Serializable {
    @Inject @DAOJpaUser
    private UserDAOJpa userDAOJpa;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String fechaNacimiento;
    private String email;
    private String password;
    private String direccion;
    private String ciudad;
    private String codigoPostal;

    public String submit() throws IOException {

        User newUser = new User(userDAOJpa.size()+1, nombre, "USER", nombre, apellidos, email, password, dni, codigoPostal, ciudad, direccion, telefono, new Date(fechaNacimiento));
        userDAOJpa.nuevoUsuario(newUser);


        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(ec.getRequestContextPath() + "/login.jsp");
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}