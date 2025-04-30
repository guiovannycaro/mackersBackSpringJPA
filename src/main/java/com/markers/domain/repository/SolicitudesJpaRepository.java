package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.Solicitudes;

public interface SolicitudesJpaRepository extends JpaRepository<Solicitudes, Integer>{
	@Query("SELECT a FROM Solicitudes a WHERE a.idSolicitud = :id")
	Solicitudes findById(int id);
}
