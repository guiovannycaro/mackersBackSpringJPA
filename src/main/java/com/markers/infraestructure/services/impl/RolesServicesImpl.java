package com.markers.infraestructure.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.RolesDao;

import com.markers.domain.models.Roles;

import com.markers.infraestructure.services.RolesService;
@Service
public class RolesServicesImpl  implements RolesService{

	 @Autowired
	 RolesDao dao;
	 
	 @Override
		public List<Roles> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Roles recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Roles datos) {
			 if(dao.recuperarRegistroById(datos.getIdRol())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Roles datos) {
			 if(dao.recuperarRegistroById(datos.getIdRol())==null) {
		            dao.actualizarRegistro(datos);
		       
		        }
			
		}

		@Override
		public boolean eliminarRegistro(int id) {
			 if(dao.recuperarRegistroById(id)!=null) {
		            dao.eliminaRegistro(id);
		            return true;
		        }
		        return false;
			
		}
		
		@Override
		public List<Roles> findRegistroById(int id) {

			return dao.devolverRegistroById(id);
		}
}
