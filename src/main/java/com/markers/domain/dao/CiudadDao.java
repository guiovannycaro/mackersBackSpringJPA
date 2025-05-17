package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.Ciudad;
import com.markers.domain.models.Departamento;

public interface CiudadDao {

	List<Ciudad> devolverRegistro();

	Ciudad recuperarRegistroById(int id);

	void agregarRegistro(Ciudad datos);

	void actualizarRegistro(Ciudad datos);

	void eliminaRegistro(int id);
	
	List<Ciudad> devolverRegistroById(int id);

}
