package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.CiudadDao;
import com.markers.domain.models.Ciudad;
import com.markers.domain.repository.CiudadJpaRepository;


@Repository
public class CiudadDaoImpl  implements CiudadDao{

	
	 @Autowired
	 CiudadJpaRepository repositorio;
	 
	@Override
	public List<Ciudad> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Ciudad recuperarRegistroById(int id) {
		 return repositorio.searchById(id);
	}

	@Override
	public void agregarRegistro(Ciudad datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Ciudad datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	

	@Override
	public List<Ciudad> devolverRegistroById(int id) {

		return repositorio.buscarById(id);
	}
}
