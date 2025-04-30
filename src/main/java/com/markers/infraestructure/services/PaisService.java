package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Pais;

public interface PaisService {

	
	List<Pais> devolverRegistro();

	Pais recuperarRegistroById(int id);

	void agregarRegistro(Pais datos);

	void actualizarRegistro(Pais datos);

	void eliminaRegistro(int id);
}
