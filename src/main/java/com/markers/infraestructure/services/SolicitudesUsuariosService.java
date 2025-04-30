package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.solicitudesUsuario;

public interface SolicitudesUsuariosService {

	List<solicitudesUsuario> devolverRegistro();

	solicitudesUsuario recuperarRegistroById(int id);

	void agregarRegistro(solicitudesUsuario datos);

	void actualizarRegistro(solicitudesUsuario datos);

	void eliminaRegistro(int id);
}
