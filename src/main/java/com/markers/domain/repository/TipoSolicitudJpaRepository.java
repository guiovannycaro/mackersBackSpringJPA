package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.markers.domain.models.TipoSolicitud;


public interface TipoSolicitudJpaRepository extends JpaRepository<TipoSolicitud, Integer>{
	@Query("SELECT a FROM TipoSolicitud a WHERE a.idTipoSolicitud = :id")
	TipoSolicitud findById(int id);
}
