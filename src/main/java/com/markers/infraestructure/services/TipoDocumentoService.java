package com.markers.infraestructure.services;

import java.util.List;


import com.markers.domain.models.TipoDocumento;

public interface TipoDocumentoService {

	List<TipoDocumento> devolverRegistro();

	TipoDocumento recuperarRegistroById(int id);

	boolean agregarRegistro(TipoDocumento datos);

	void actualizarRegistro(TipoDocumento datos);

	boolean eliminarRegistro(int id);
	
	List<TipoDocumento> findRegistroById(int id);
}
