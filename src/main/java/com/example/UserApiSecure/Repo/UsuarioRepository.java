package com.example.UserApiSecure.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserApiSecure.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombreUsuario(String nombreUsuario);

    Usuario findByCorreoElectronico(String correoElectronico);
}
