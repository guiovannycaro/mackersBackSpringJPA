package com.markers.domain.dao.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.Usuarios;

@Repository
public class UsuariosRecDtosImpl implements UsuariosRecDtos{

	@Autowired
	UsuariosJpa usuariosJpa;
	
	@Override
	public Usuarios recuperarUsuarios(Integer datos) {
		return usuariosJpa.findById(datos).orElse(null);
	}
}
