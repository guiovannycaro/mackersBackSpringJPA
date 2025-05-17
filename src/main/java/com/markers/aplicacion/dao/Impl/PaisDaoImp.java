package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.PaisDao;

import com.markers.domain.models.Pais;

import com.markers.domain.repository.PaisJpaRepository;
@Repository
public class PaisDaoImp  implements PaisDao{

	 @Autowired
	 PaisJpaRepository repositorio;
	 
	@Override
	public List<Pais> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Pais recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(Pais datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Pais datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	@Override
	public List<Pais> devolverRegistroById(int id) {

		return repositorio.searchById(id);
	}
}
