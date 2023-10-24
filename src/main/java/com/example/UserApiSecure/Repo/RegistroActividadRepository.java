package com.example.UserApiSecure.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.UserApiSecure.Model.RegistroActividad;

public interface RegistroActividadRepository extends JpaRepository<RegistroActividad, Long> {
}