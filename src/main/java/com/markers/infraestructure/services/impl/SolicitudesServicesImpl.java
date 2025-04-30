package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.models.Solicitudes;

import com.markers.infraestructure.services.SolicitudesService;

@Service
public class SolicitudesServicesImpl implements SolicitudesService{


	 @Autowired
	 SolicitudesService dao;
	 
	 @Override
		public List<Solicitudes> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Solicitudes recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Solicitudes datos) {
			 if(dao.recuperarRegistroById(datos.getIdSolicitud())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Solicitudes datos) {
			 if(dao.recuperarRegistroById(datos.getIdSolicitud())==null) {
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
