package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.TipoSolicitud;

public interface TipoSolicitudService {

	List<TipoSolicitud> devolverRegistro();

	TipoSolicitud recuperarRegistroById(int id);

	boolean agregarRegistro(TipoSolicitud datos);

	void actualizarRegistro(TipoSolicitud datos);

	boolean eliminaRegistro(int id);
}
