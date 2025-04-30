package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Solicitudes;

public interface SolicitudesService {

	List<Solicitudes> devolverRegistro();

	Solicitudes recuperarRegistroById(int id);

	boolean agregarRegistro(Solicitudes datos);

	void actualizarRegistro(Solicitudes datos);

	boolean eliminaRegistro(int id);
}
