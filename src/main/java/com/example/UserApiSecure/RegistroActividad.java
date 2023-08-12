package com.example.UserApiSecure;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Registro_Actividades")
public class RegistroActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @Column(nullable = false)
    private String actividad;

    @Column(name = "fecha_actividad", updatable = false)
    private Date fechaActividad;

    public RegistroActividad() {
    }

    public RegistroActividad(Long id, Usuario usuario, String actividad, Date fechaActividad) {
        this.id = id;
        this.usuario = usuario;
        this.actividad = actividad;
        this.fechaActividad = fechaActividad;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getActividad() {
        return this.actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Date getFechaActividad() {
        return this.fechaActividad;
    }

    public void setFechaActividad(Date fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public RegistroActividad id(Long id) {
        setId(id);
        return this;
    }

    public RegistroActividad usuario(Usuario usuario) {
        setUsuario(usuario);
        return this;
    }

    public RegistroActividad actividad(String actividad) {
        setActividad(actividad);
        return this;
    }

    public RegistroActividad fechaActividad(Date fechaActividad) {
        setFechaActividad(fechaActividad);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RegistroActividad)) {
            return false;
        }
        RegistroActividad registroActividad = (RegistroActividad) o;
        return Objects.equals(id, registroActividad.id) && Objects.equals(usuario, registroActividad.usuario)
                && Objects.equals(actividad, registroActividad.actividad)
                && Objects.equals(fechaActividad, registroActividad.fechaActividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, actividad, fechaActividad);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", usuario='" + getUsuario() + "'" +
                ", actividad='" + getActividad() + "'" +
                ", fechaActividad='" + getFechaActividad() + "'" +
                "}";
    }

}
