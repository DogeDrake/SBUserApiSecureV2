package com.example.UserApiSecure.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserApiSecure.Exceptions.UsuarioNotFoundException;
import com.example.UserApiSecure.Model.Usuario;
import com.example.UserApiSecure.Repo.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public Usuario crearUsuario(Usuario usuario) {
        // Implement the logic to create a new user
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> actualizarUsuario(Long id, Usuario usuario) {
        // Implement the logic to update an existing user
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
        if (usuarioExistente.isPresent()) {
            // Update the fields of the existing user with the provided data
            Usuario usuarioActualizado = usuarioExistente.get();
            usuarioActualizado.setNombreUsuario(usuario.getNombreUsuario());
            usuarioActualizado.setCorreoElectronico(usuario.getCorreoElectronico());
            // Continue with other fields...

            return Optional.of(usuarioRepository.save(usuarioActualizado));
        } else {
            return Optional.empty(); // User not found
        }
    }

    public void eliminarUsuario(Long id) {
        // Implement the logic to delete a user
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        if (usuario.isPresent()) {
            usuarioRepository.deleteById(id);
        } else {
            // Handle user not found case gracefully, e.g., you can choose to do nothing or
            // log it
        }
    }
}
