package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.TipoSolicitud;

public interface TipoSolicitudDao {

	List<TipoSolicitud> devolverRegistro();

	TipoSolicitud recuperarRegistroById(int id);

	void agregarRegistro(TipoSolicitud datos);

	void actualizarRegistro(TipoSolicitud datos);

	void eliminaRegistro(int id);
}
