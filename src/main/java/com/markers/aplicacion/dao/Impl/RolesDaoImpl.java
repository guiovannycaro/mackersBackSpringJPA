package com.markers.aplicacion.dao.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.RolesDao;

import com.markers.domain.models.Roles;
import com.markers.domain.repository.RolesJpaRepository;
@Repository
public class RolesDaoImpl  implements RolesDao{

	 @Autowired
	 RolesJpaRepository repositorio;
	 
	@Override
	public List<Roles> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Roles recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(Roles datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Roles datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
}
