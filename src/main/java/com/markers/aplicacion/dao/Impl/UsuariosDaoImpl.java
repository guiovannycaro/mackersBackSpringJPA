package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.UsuariosDao;

import com.markers.domain.models.Usuarios;
import com.markers.domain.repository.UsuariosJpaRepository;

@Repository
public class UsuariosDaoImpl   implements UsuariosDao{
	 @Autowired
	 UsuariosJpaRepository repositorio;
	 
	@Override
	public List<Usuarios> devolverRegistro() {

		return repositorio.findAll();
	}

	@Override
	public Usuarios recuperarRegistroById(int id) {
		 return repositorio.findById(id);
	}

	@Override
	public void agregarRegistro(Usuarios datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void actualizarRegistro(Usuarios datos) {
		repositorio.save(datos);
		
	}

	@Override
	public void eliminaRegistro(int id) {
		repositorio.deleteById(id);
		
	}
	
	@Override
	public List<Usuarios> devolverRegistroById(int id) {

		return repositorio.searchById(id);
	}
	
	
}
