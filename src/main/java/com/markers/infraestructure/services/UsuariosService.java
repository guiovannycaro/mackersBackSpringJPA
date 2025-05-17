package com.markers.infraestructure.services;

import java.util.List;


import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuariosDto;

public interface UsuariosService {

	List<Usuarios> devolverRegistro();

	Usuarios recuperarRegistroById(int id);

	boolean agregarRegistro(UsuariosDto datos);

	void actualizarRegistro(UsuariosDto datos);

	boolean eliminarRegistro(int id);
	
	List<Usuarios> findRegistroById(int id);
}
