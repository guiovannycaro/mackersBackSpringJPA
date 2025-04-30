package com.markers.infraestructure.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.models.TipoSolicitud;

import com.markers.infraestructure.services.TipoSolicitudService;
@Service
public class TipoSolicitudServicesImpl   implements TipoSolicitudService{
	 @Autowired
	 TipoSolicitudService dao;
	 
	 @Override
		public List<TipoSolicitud> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public TipoSolicitud recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(TipoSolicitud datos) {
			 if(dao.recuperarRegistroById(datos.getIdTipoSolicitud())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(TipoSolicitud datos) {
			 if(dao.recuperarRegistroById(datos.getIdTipoSolicitud())==null) {
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
