package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.models.Prestamo;


import com.markers.infraestructure.services.PrestamoService;

@Service
public class PrestamoServicesImpl  implements PrestamoService{

	 @Autowired
	 PrestamoService dao;
	 
	 @Override
		public List<Prestamo> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Prestamo recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Prestamo datos) {
			 if(dao.recuperarRegistroById(datos.getIdPrestamo())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Prestamo datos) {
			 if(dao.recuperarRegistroById(datos.getIdPrestamo())==null) {
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
