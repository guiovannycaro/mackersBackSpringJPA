package com.markers.aplicacion.dao.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.TipoDocumentoDao;

import com.markers.domain.models.TipoDocumento;
import com.markers.domain.repository.TipoDocumentoJpaRepository;
@Repository
public class TipoDocumentoDaoImpl   implements TipoDocumentoDao{
	 @Autowired
	 TipoDocumentoJpaRepository repositorio;
	 
	@Override
	public List<TipoDocumento> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public TipoDocumento recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(TipoDocumento datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(TipoDocumento datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	@Override
	public List<TipoDocumento> devolverRegistroById(int id) {

		return repositorio.searchById(id);
	}
}
