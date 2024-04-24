package model.validator;

import jakarta.persistence.*;

@Entity
@Table(name = "ACTIVIDAD_USUARIO")
public class ActividadUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_ACTIVIDAD")
    private Actividad actividad;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private User usuario;

    public ActividadUsuario(Long id, Actividad actividad, User usuario) {
        this.id = id;
        this.actividad = actividad;
        this.usuario = usuario;
    }

    public ActividadUsuario() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }
}
