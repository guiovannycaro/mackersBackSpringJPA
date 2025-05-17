package com.markers.infraestructure.services;

import java.util.List;


import com.markers.domain.models.Roles;

public interface RolesService {

	List<Roles> devolverRegistro();

	Roles recuperarRegistroById(int id);

	boolean agregarRegistro(Roles datos);

	void actualizarRegistro(Roles datos);

	boolean eliminarRegistro(int id);
	
	List<Roles> findRegistroById(int id);
}
