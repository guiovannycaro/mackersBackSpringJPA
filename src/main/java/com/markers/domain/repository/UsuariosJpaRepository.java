package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.Usuarios;


public interface UsuariosJpaRepository extends JpaRepository<Usuarios, Integer>{
	@Query("SELECT a FROM Usuarios a WHERE a.usuId = :id")
	Usuarios findById(@Param("id") int id);
	
	@Query("SELECT a FROM Usuarios a WHERE a.usuId = :id")
	List<Usuarios> searchById(@Param("id") int id);
}
