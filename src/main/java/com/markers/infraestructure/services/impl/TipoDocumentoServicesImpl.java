package com.markers.infraestructure.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.TipoDocumentoDao;

import com.markers.domain.models.TipoDocumento;

import com.markers.infraestructure.services.TipoDocumentoService;
@Service
public class TipoDocumentoServicesImpl   implements TipoDocumentoService{
	 @Autowired
	 TipoDocumentoDao dao;
	 
	 @Override
		public List<TipoDocumento> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public TipoDocumento recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(TipoDocumento datos) {
			 if(dao.recuperarRegistroById(datos.getIdTipoDocumento())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(TipoDocumento datos) {
			 if(dao.recuperarRegistroById(datos.getIdTipoDocumento())==null) {
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
		public List<TipoDocumento> findRegistroById(int id) {

			return dao.devolverRegistroById(id);
		}
}
