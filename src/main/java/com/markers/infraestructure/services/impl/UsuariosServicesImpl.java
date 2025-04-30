package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.models.Usuarios;

import com.markers.infraestructure.services.UsuariosService;

@Service
public class UsuariosServicesImpl   implements UsuariosService{
	
	@Autowired
	 UsuariosService dao;
	 
	 @Override
		public List<Usuarios> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Usuarios recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Usuarios datos) {
			 if(dao.recuperarRegistroById(datos.getUsuId())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Usuarios datos) {
			 if(dao.recuperarRegistroById(datos.getUsuId())==null) {
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
