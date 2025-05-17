package com.markers.domain.dao;

import java.util.List;


import com.markers.domain.models.Pais;

public interface PaisDao {

	
	List<Pais> devolverRegistro();

	Pais recuperarRegistroById(int id);

	void agregarRegistro(Pais datos);

	void actualizarRegistro(Pais datos);

void eliminaRegistro(int id);
	
	List<Pais> devolverRegistroById(int id);
}
