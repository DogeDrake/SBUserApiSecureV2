package com.example.UserApiSecure;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNombreUsuario(String nombreUsuario);

    Usuario findByCorreoElectronico(String correoElectronico);
}
