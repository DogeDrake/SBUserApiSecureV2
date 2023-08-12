package com.example.UserApiSecure;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_usuario", unique = true, nullable = false)
    private String nombreUsuario;

    @Column(name = "correo_electronico", unique = true, nullable = false)
    private String correoElectronico;

    @Column(name = "contrasena_hash", nullable = false)
    private String contrasenaHash;

    @Column(name = "fecha_registro", updatable = false)
    private Date fechaRegistro;

    @Column(name = "ultima_actividad")
    private Date ultimaActividad;

    @Column(name = "foto_perfil")
    private String fotoPerfil;

    @Column(name = "biografia", columnDefinition = "TEXT")
    private String biografia;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "numero_telefono")
    private String numeroTelefono;

    @Column(name = "pregunta_seguridad")
    private String preguntaSeguridad;

    @Column(name = "respuesta_seguridad")
    private String respuestaSeguridad;

    @Column(name = "token_autenticacion")
    private String tokenAutenticacion;

    @Column(name = "es_administrador", columnDefinition = "TINYINT DEFAULT 0")
    private Boolean esAdministrador;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RegistroActividad> actividades;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "Usuarios_Roles", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private List<Rol> roles;

    public Usuario() {
    }

    public Usuario(Long id, String nombreUsuario, String correoElectronico, String contrasenaHash, Date fechaRegistro,
            Date ultimaActividad, String fotoPerfil, String biografia, Date fechaNacimiento, String numeroTelefono,
            String preguntaSeguridad, String respuestaSeguridad, String tokenAutenticacion, Boolean esAdministrador,
            List<RegistroActividad> actividades, List<Rol> roles) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronico = correoElectronico;
        this.contrasenaHash = contrasenaHash;
        this.fechaRegistro = fechaRegistro;
        this.ultimaActividad = ultimaActividad;
        this.fotoPerfil = fotoPerfil;
        this.biografia = biografia;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.tokenAutenticacion = tokenAutenticacion;
        this.esAdministrador = esAdministrador;
        this.actividades = actividades;
        this.roles = roles;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContrasenaHash() {
        return this.contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getUltimaActividad() {
        return this.ultimaActividad;
    }

    public void setUltimaActividad(Date ultimaActividad) {
        this.ultimaActividad = ultimaActividad;
    }

    public String getFotoPerfil() {
        return this.fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    public String getBiografia() {
        return this.biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getPreguntaSeguridad() {
        return this.preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return this.respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public String getTokenAutenticacion() {
        return this.tokenAutenticacion;
    }

    public void setTokenAutenticacion(String tokenAutenticacion) {
        this.tokenAutenticacion = tokenAutenticacion;
    }

    public Boolean isEsAdministrador() {
        return this.esAdministrador;
    }

    public Boolean getEsAdministrador() {
        return this.esAdministrador;
    }

    public void setEsAdministrador(Boolean esAdministrador) {
        this.esAdministrador = esAdministrador;
    }

    public List<RegistroActividad> getActividades() {
        return this.actividades;
    }

    public void setActividades(List<RegistroActividad> actividades) {
        this.actividades = actividades;
    }

    public List<Rol> getRoles() {
        return this.roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }

    public Usuario id(Long id) {
        setId(id);
        return this;
    }

    public Usuario nombreUsuario(String nombreUsuario) {
        setNombreUsuario(nombreUsuario);
        return this;
    }

    public Usuario correoElectronico(String correoElectronico) {
        setCorreoElectronico(correoElectronico);
        return this;
    }

    public Usuario contrasenaHash(String contrasenaHash) {
        setContrasenaHash(contrasenaHash);
        return this;
    }

    public Usuario fechaRegistro(Date fechaRegistro) {
        setFechaRegistro(fechaRegistro);
        return this;
    }

    public Usuario ultimaActividad(Date ultimaActividad) {
        setUltimaActividad(ultimaActividad);
        return this;
    }

    public Usuario fotoPerfil(String fotoPerfil) {
        setFotoPerfil(fotoPerfil);
        return this;
    }

    public Usuario biografia(String biografia) {
        setBiografia(biografia);
        return this;
    }

    public Usuario fechaNacimiento(Date fechaNacimiento) {
        setFechaNacimiento(fechaNacimiento);
        return this;
    }

    public Usuario numeroTelefono(String numeroTelefono) {
        setNumeroTelefono(numeroTelefono);
        return this;
    }

    public Usuario preguntaSeguridad(String preguntaSeguridad) {
        setPreguntaSeguridad(preguntaSeguridad);
        return this;
    }

    public Usuario respuestaSeguridad(String respuestaSeguridad) {
        setRespuestaSeguridad(respuestaSeguridad);
        return this;
    }

    public Usuario tokenAutenticacion(String tokenAutenticacion) {
        setTokenAutenticacion(tokenAutenticacion);
        return this;
    }

    public Usuario esAdministrador(Boolean esAdministrador) {
        setEsAdministrador(esAdministrador);
        return this;
    }

    public Usuario actividades(List<RegistroActividad> actividades) {
        setActividades(actividades);
        return this;
    }

    public Usuario roles(List<Rol> roles) {
        setRoles(roles);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nombreUsuario, usuario.nombreUsuario)
                && Objects.equals(correoElectronico, usuario.correoElectronico)
                && Objects.equals(contrasenaHash, usuario.contrasenaHash)
                && Objects.equals(fechaRegistro, usuario.fechaRegistro)
                && Objects.equals(ultimaActividad, usuario.ultimaActividad)
                && Objects.equals(fotoPerfil, usuario.fotoPerfil) && Objects.equals(biografia, usuario.biografia)
                && Objects.equals(fechaNacimiento, usuario.fechaNacimiento)
                && Objects.equals(numeroTelefono, usuario.numeroTelefono)
                && Objects.equals(preguntaSeguridad, usuario.preguntaSeguridad)
                && Objects.equals(respuestaSeguridad, usuario.respuestaSeguridad)
                && Objects.equals(tokenAutenticacion, usuario.tokenAutenticacion)
                && Objects.equals(esAdministrador, usuario.esAdministrador)
                && Objects.equals(actividades, usuario.actividades) && Objects.equals(roles, usuario.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreUsuario, correoElectronico, contrasenaHash, fechaRegistro, ultimaActividad,
                fotoPerfil, biografia, fechaNacimiento, numeroTelefono, preguntaSeguridad, respuestaSeguridad,
                tokenAutenticacion, esAdministrador, actividades, roles);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombreUsuario='" + getNombreUsuario() + "'" +
                ", correoElectronico='" + getCorreoElectronico() + "'" +
                ", contrasenaHash='" + getContrasenaHash() + "'" +
                ", fechaRegistro='" + getFechaRegistro() + "'" +
                ", ultimaActividad='" + getUltimaActividad() + "'" +
                ", fotoPerfil='" + getFotoPerfil() + "'" +
                ", biografia='" + getBiografia() + "'" +
                ", fechaNacimiento='" + getFechaNacimiento() + "'" +
                ", numeroTelefono='" + getNumeroTelefono() + "'" +
                ", preguntaSeguridad='" + getPreguntaSeguridad() + "'" +
                ", respuestaSeguridad='" + getRespuestaSeguridad() + "'" +
                ", tokenAutenticacion='" + getTokenAutenticacion() + "'" +
                ", esAdministrador='" + isEsAdministrador() + "'" +
                ", actividades='" + getActividades() + "'" +
                ", roles='" + getRoles() + "'" +
                "}";
    }

}
