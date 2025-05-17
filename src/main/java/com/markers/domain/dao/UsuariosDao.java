package com.markers.domain.dao;

import java.util.List;


import com.markers.domain.models.Usuarios;

public interface UsuariosDao {

	List<Usuarios> devolverRegistro();

	Usuarios recuperarRegistroById(int id);

	void agregarRegistro(Usuarios datos);

	void actualizarRegistro(Usuarios datos);

void eliminaRegistro(int id);
	
	List<Usuarios> devolverRegistroById(int id);
}
