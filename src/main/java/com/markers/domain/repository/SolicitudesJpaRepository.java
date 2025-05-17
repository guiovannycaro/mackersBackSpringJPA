package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.Solicitudes;

public interface SolicitudesJpaRepository extends JpaRepository<Solicitudes, Integer>{

	
	@Query("SELECT a FROM Solicitudes a WHERE a.idSolicitud = :id")
	Solicitudes  buscarById(@Param("id") int id);
	
	@Query("SELECT a FROM Solicitudes a WHERE a.idSolicitud = :id")
	List<Solicitudes> searchById(@Param("id") int id);
}
