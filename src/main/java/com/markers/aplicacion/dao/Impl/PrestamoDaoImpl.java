package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.PrestamoDao;

import com.markers.domain.models.Prestamo;

import com.markers.domain.repository.PrestamoJpaRepository;
@Repository
public class PrestamoDaoImpl  implements PrestamoDao{

	 @Autowired
	 PrestamoJpaRepository repositorio;
	 
	@Override
	public List<Prestamo> devolverRegistro() {

		return repositorio.listaPrestamos();
	}

	@Override
	public Prestamo recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(Prestamo datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Prestamo datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	@Override
	public List<Prestamo> devolverRegistroById(int id) {

		return repositorio.searchById(id);
	}
	
}
