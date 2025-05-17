package com.markers.domain.dao.solicitud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.Solicitudes;

@Repository
public class SolicitudesRecDtosImpl implements SolicitudesRecDtos{

	@Autowired
	SolicitudesJpa solicitudesJpa;
	
	@Override
	public Solicitudes recuperarSolicitudes(Integer datos) {
		return solicitudesJpa.findById(datos).orElse(null);
	}
}
