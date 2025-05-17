package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.SolicitudesDao;

import com.markers.domain.models.Solicitudes;
import com.markers.domain.repository.SolicitudesJpaRepository;

@Repository
public class SolicitudesDaoImpl implements SolicitudesDao{


	 @Autowired
	 SolicitudesJpaRepository repositorio;
	 
	@Override
	public List<Solicitudes> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Solicitudes recuperarRegistroById(int id) {
		 return repositorio.buscarById(id);
	}

	@Override
	public void agregarRegistro(Solicitudes datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Solicitudes datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	@Override
	public List<Solicitudes> devolverRegistroById(int id) {

		return repositorio.searchById(id);
	}

}
