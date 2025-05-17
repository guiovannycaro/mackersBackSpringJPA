package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.markers.domain.models.Solicitudes;
import com.markers.domain.models.solicitudesUsuario;

public interface SolicitudesUsuariosJpaRepository extends JpaRepository<solicitudesUsuario, Integer>{


	

}
