package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Ciudad;
import com.markers.domain.models.dtos.CiudadDto;

public interface CiudadService {

	List<Ciudad> devolverRegistro();
	List<Ciudad> devolverListaRegistro();
	

	Ciudad recuperarRegistroById(int id);

	boolean agregarRegistro(Ciudad datos);

	void actualizarRegistro(Ciudad datos);

	boolean eliminarRegistro(int id);
	
	List<Ciudad> findRegistroById(int id);
}
