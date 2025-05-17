package com.markers.infraestructure.security.services;

import java.util.List;



import com.markers.domain.models.Roles;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;



public interface ServicioSeguridad {
	public boolean  autenticacion(Usuarios datos) throws Exception;

	public List<UsuarioRolDTO> getRol(String usercorreo) throws Exception;
	
	public Usuarios cambiarPassword(Usuarios datos) throws Exception;
	
	public Usuarios registrarNuevoUsuario(Usuarios datos) throws Exception;
	 

	 
	
}
