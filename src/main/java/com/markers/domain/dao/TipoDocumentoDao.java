package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.TipoDocumento;


public interface TipoDocumentoDao {

	List<TipoDocumento> devolverRegistro();

	TipoDocumento recuperarRegistroById(int id);

	void agregarRegistro(TipoDocumento datos);

	void actualizarRegistro(TipoDocumento datos);

void eliminaRegistro(int id);
	
	List<TipoDocumento> devolverRegistroById(int id);
}
