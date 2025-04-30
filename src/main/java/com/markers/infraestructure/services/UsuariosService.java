package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Usuarios;

public interface UsuariosService {

	List<Usuarios> devolverRegistro();

	Usuarios recuperarRegistroById(int id);

	void agregarRegistro(Usuarios datos);

	void actualizarRegistro(Usuarios datos);

	void eliminaRegistro(int id);
}
