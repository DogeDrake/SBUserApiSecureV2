package com.example.UserApiSecure.Service;

import org.springframework.stereotype.Service;

import com.example.UserApiSecure.Model.RegistroActividad;
import com.example.UserApiSecure.Model.Usuario;
import com.example.UserApiSecure.Repo.RegistroActividadRepository;

@Service
public class RegistroActividadService {
    private final RegistroActividadRepository registroActividadRepository;

    public RegistroActividadService(RegistroActividadRepository registroActividadRepository) {
        this.registroActividadRepository = registroActividadRepository;
    }

    public RegistroActividad registrarActividad(Usuario usuario, String actividad) {
        RegistroActividad registroActividad = new RegistroActividad();
        registroActividad.setUsuario(usuario);
        registroActividad.setActividad(actividad);
        return registroActividadRepository.save(registroActividad);
    }

}
