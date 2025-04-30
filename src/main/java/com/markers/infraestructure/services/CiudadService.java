package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Ciudad;

public interface CiudadService {

	List<Ciudad> devolverRegistro();

	Ciudad recuperarRegistroById(int id);

	boolean agregarRegistro(Ciudad datos);

	void actualizarRegistro(Ciudad datos);

	boolean eliminaRegistro(int id);
}
