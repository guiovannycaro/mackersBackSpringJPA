package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.CiudadDao;
import com.markers.domain.models.Ciudad;

import com.markers.infraestructure.services.CiudadService;


@Service
public class CiudadServicesImpl  implements CiudadService{

	
	 @Autowired
	 CiudadDao dao;
	 
	@Override
	public List<Ciudad> devolverRegistro() {

		return dao.devolverRegistro();
	}

	@Override
	public Ciudad recuperarRegistroById(int id) {
		 return dao.recuperarRegistroById(id);
	}

	@Override
	public boolean agregarRegistro(Ciudad datos) {
		 if(dao.recuperarRegistroById(datos.getIdCiudad())==null) {
	            dao.agregarRegistro(datos);
	            return true;
	        }
	        return false;
		
	}

	@Override
	public void actualizarRegistro(Ciudad datos) {
		 if(dao.recuperarRegistroById(datos.getIdCiudad())==null) {
	            dao.actualizarRegistro(datos);
	       
	        }
		
	}

	@Override
	public boolean eliminaRegistro(int id) {
		 if(dao.recuperarRegistroById(id)!=null) {
	            dao.eliminaRegistro(id);
	            return true;
	        }
	        return false;
		
	}

}
