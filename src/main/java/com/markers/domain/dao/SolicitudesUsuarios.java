package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.solicitudesUsuario;

public interface SolicitudesUsuarios {

	List<solicitudesUsuario> devolverRegistro();

	solicitudesUsuario recuperarRegistroById(int id);

	void agregarRegistro(solicitudesUsuario datos);

	void actualizarRegistro(solicitudesUsuario datos);

	void eliminaRegistro(int id);
}
