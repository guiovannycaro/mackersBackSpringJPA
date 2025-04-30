package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Usuarios;

public interface UsuariosService {

	List<Usuarios> devolverRegistro();

	Usuarios recuperarRegistroById(int id);

	boolean agregarRegistro(Usuarios datos);

	void actualizarRegistro(Usuarios datos);

	boolean eliminaRegistro(int id);
}
