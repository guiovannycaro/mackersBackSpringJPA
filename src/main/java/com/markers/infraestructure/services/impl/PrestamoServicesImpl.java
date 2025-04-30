package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.PrestamoDao;

import com.markers.domain.models.Prestamo;

import com.markers.domain.repository.PrestamoJpaRepository;
@Repository
public class PrestamoServicesImpl  implements PrestamoDao{

	 @Autowired
	 PrestamoJpaRepository repositorio;
	 
	@Override
	public List<Prestamo> devolverRegistro() {

		return repositorio.findAll();
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
}
