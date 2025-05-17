package com.markers.domain.dao.solicitud;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.Solicitudes;

public interface SolicitudesJpa extends JpaRepository<Solicitudes, Integer> {

}
