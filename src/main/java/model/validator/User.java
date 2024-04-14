package model.validator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.util.Date;
@Entity
@Table(name="users")
public class User {
    @Id
    private int id;
    private String nombre_usuario;
    private String rol;
    private String nombre;
    private String apellidos;
    @NotEmpty(message = "El correo electrónico es obligatorio")
    @Email(message = "El correo electrónico debe tener un formato válido")
    @Pattern(regexp = ".*@.*", message = "El correo electrónico debe contener al menos una arroba")
    private String email;
    private String clave;
    private String dni;
    private String cp;
    private String ciudad;
    private String direccion;
    @Pattern(regexp = "\\d+", message = "El teléfono debe contener solo números")
    @Size(min = 8, max = 15, message = "El teléfono debe tener entre 8 y 15 caracteres")
    private String telefono;
    private Date fechaNacimiento;

    public User(int id, String nombre_usuario, String rol, String nombre, String apellidos, String email, String clave,
                String dni, String cp, String ciudad, String direccion, String telefono, Date fechaNacimiento) {
        this.id = id;
        this.nombre_usuario = nombre_usuario;
        this.rol = rol;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.clave = clave;
        this.dni = dni;
        this.cp = cp;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public User() {

    }

    public String getRol() {
        return rol;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public String getEmail() {
        return email;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}