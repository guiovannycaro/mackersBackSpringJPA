package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.SeguridadDao;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;
import com.markers.domain.repository.SeguridadJpaRepository;

@Repository
public class SeguridadDaoImpl implements SeguridadDao{

	
	 @Autowired
	 SeguridadJpaRepository repositorio;
	 
	@Override
	public Usuarios autenticar(Usuarios datos) {
		Usuarios user = new Usuarios();
		System.out.println(datos.getUsuCorreo()+ " " + datos.getUsuContrasena());
	
		user = repositorio.retornarUsuario(datos.getUsuCorreo(),datos.getUsuContrasena());
		return user ;
	}
	
	
	@Override
	public List<UsuarioRolDTO> obtenerRol(String datos) {
	    System.out.println(datos);
	    return repositorio.rolUsuario(datos);
	}
	
	
	

}
