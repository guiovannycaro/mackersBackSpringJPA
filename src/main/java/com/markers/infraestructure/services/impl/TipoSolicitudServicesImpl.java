package com.markers.infraestructure.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.TipoSolicitudDao;
import com.markers.domain.models.TipoSolicitud;
import com.markers.domain.repository.TipoSolicitudJpaRepository;
@Repository
public class TipoSolicitudServicesImpl   implements TipoSolicitudDao{
	 @Autowired
	 TipoSolicitudJpaRepository repositorio;
	 
	@Override
	public List<TipoSolicitud> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public TipoSolicitud recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(TipoSolicitud datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(TipoSolicitud datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
}
