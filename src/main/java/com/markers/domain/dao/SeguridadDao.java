package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;

public interface SeguridadDao {

	
	Usuarios autenticar(Usuarios datos);
	
	public List<UsuarioRolDTO> obtenerRol(String datos);
}
