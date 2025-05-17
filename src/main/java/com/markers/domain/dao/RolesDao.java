package com.markers.domain.dao;

import java.util.List;


import com.markers.domain.models.Roles;

public interface RolesDao {

	List<Roles> devolverRegistro();

	Roles recuperarRegistroById(int id);

	void agregarRegistro(Roles datos);

	void actualizarRegistro(Roles datos);

void eliminaRegistro(int id);
	
	List<Roles> devolverRegistroById(int id);
}
