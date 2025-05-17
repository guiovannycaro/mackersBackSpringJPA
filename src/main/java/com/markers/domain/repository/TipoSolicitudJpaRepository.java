package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.TipoSolicitud;


public interface TipoSolicitudJpaRepository extends JpaRepository<TipoSolicitud, Integer>{
	@Query("SELECT a FROM TipoSolicitud a WHERE a.idTipoSolicitud = :id")
	TipoSolicitud findById(int id);
	
	@Query("SELECT a FROM TipoSolicitud a WHERE a.idTipoSolicitud = :id")
	List<TipoSolicitud> searchById(@Param("id") int id);
}
