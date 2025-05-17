package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;

public interface SeguridadJpaRepository extends JpaRepository<Usuarios, Integer>{
	
	

	@Query("SELECT a FROM Usuarios a WHERE a.usuCorreo = :correo and a.usuContrasena = :contrasena ")
	 Usuarios retornarUsuario(@Param("correo") String correo, @Param("contrasena") String contrasena);
	
	@Query("SELECT new com.markers.domain.models.dtos.UsuarioRolDTO(a.usuNombre, a.usuRol.descripcion) FROM Usuarios a WHERE a.usuCorreo = :datos")
	List<UsuarioRolDTO> rolUsuario(@Param("datos") String datos);
}
