package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.markers.domain.models.Usuarios;


public interface UsuariosJpaRepository extends JpaRepository<Usuarios, Integer>{
	@Query("SELECT a FROM Usuarios a WHERE a.usuId = :id")
	Usuarios findById(int id);
}
