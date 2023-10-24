package com.example.UserApiSecure.Model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_rol", unique = true, nullable = false)
    private String nombreRol;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @ManyToMany(mappedBy = "roles")
    private List<Usuario> usuarios;

    // Getters and setters, constructors, and other methods

    public Rol() {
    }

    public Rol(Long id, String nombreRol, String descripcion, List<Usuario> usuarios) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return this.nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Rol id(Long id) {
        setId(id);
        return this;
    }

    public Rol nombreRol(String nombreRol) {
        setNombreRol(nombreRol);
        return this;
    }

    public Rol descripcion(String descripcion) {
        setDescripcion(descripcion);
        return this;
    }

    public Rol usuarios(List<Usuario> usuarios) {
        setUsuarios(usuarios);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Rol)) {
            return false;
        }
        Rol rol = (Rol) o;
        return Objects.equals(id, rol.id) && Objects.equals(nombreRol, rol.nombreRol)
                && Objects.equals(descripcion, rol.descripcion) && Objects.equals(usuarios, rol.usuarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreRol, descripcion, usuarios);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombreRol='" + getNombreRol() + "'" +
                ", descripcion='" + getDescripcion() + "'" +
                ", usuarios='" + getUsuarios() + "'" +
                "}";
    }

}
