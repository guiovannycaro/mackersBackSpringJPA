package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.models.Pais;
import com.markers.infraestructure.services.PaisService;


@Service
public class PaisServicesImp  implements PaisService{

	 @Autowired
	 PaisService dao;
	 
	 @Override
		public List<Pais> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Pais recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Pais datos) {
			 if(dao.recuperarRegistroById(datos.getIdPais())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Pais datos) {
			 if(dao.recuperarRegistroById(datos.getIdPais())==null) {
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
