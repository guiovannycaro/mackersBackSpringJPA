package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.solicitudesUsuario;

public interface SolicitudesUsuariosJpaRepository extends JpaRepository<solicitudesUsuario, Integer>{

	@Query("SELECT a FROM SolicitudesUsuarios a WHERE a.idSolicitudUsu = :id")
	solicitudesUsuario findById(int id);
}
