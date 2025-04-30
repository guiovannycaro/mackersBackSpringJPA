package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.Solicitudes;

public interface SolicitudesDao {

	List<Solicitudes> devolverRegistro();

	Solicitudes recuperarRegistroById(int id);

	void agregarRegistro(Solicitudes datos);

	void actualizarRegistro(Solicitudes datos);

	void eliminaRegistro(int id);
}
