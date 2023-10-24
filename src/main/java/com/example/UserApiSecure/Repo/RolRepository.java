package com.example.UserApiSecure.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserApiSecure.Model.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
    Rol findByNombreRol(String nombreRol);
}