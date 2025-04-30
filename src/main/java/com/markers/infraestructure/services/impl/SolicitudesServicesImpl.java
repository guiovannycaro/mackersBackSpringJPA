package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.SolicitudesDao;

import com.markers.domain.models.Solicitudes;
import com.markers.domain.repository.SolicitudesJpaRepository;

@Repository
public class SolicitudesServicesImpl implements SolicitudesDao{


	 @Autowired
	 SolicitudesJpaRepository repositorio;
	 
	@Override
	public List<Solicitudes> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Solicitudes recuperarRegistroById(int id) {
		 return repositorio.findById(id);
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

}
