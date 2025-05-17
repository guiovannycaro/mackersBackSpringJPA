package com.markers.infraestructure.services;

import java.util.List;


import com.markers.domain.models.Pais;

public interface PaisService {

	
	List<Pais> devolverRegistro();

	Pais recuperarRegistroById(int id);

	boolean agregarRegistro(Pais datos);

	void actualizarRegistro(Pais datos);


	
	boolean eliminarRegistro(int id);
	
	List<Pais> findRegistroById(int id);
}
