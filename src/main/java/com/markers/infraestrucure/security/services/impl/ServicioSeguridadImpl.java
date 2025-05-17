package com.markers.infraestrucure.security.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.SeguridadDao;
import com.markers.domain.models.Roles;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;
import com.markers.infraestructure.security.services.ServicioSeguridad;

@Service
public class ServicioSeguridadImpl implements ServicioSeguridad{

	 @Autowired
	 SeguridadDao dao;
	 
	@Override
	public boolean  autenticacion(Usuarios datos) throws Exception {
	Usuarios u = new Usuarios();

		 u = dao.autenticar(datos) ;
		
		String vusuario = u.getUsuCorreo();
		 String vcontrasena=u.getUsuContrasena();
		
		 if(vusuario.equals("") && vcontrasena.equals("")) {
			 return false;
		 }
		 return true;
	}


	@Override
	public List<UsuarioRolDTO> getRol(String usercorreo) throws Exception{
	
		

		 return dao.obtenerRol(usercorreo) ;
		 
		
	}
	
	@Override
	public Usuarios cambiarPassword(Usuarios datos) throws Exception {
		Usuarios user = new Usuarios();

		return user ;
	}

	@Override
	public Usuarios registrarNuevoUsuario(Usuarios datos) throws Exception {
		Usuarios user = new Usuarios();

		return user ;
	}
	
}
