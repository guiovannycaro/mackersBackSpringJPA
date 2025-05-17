package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.DepartamentoDao;

import com.markers.domain.models.Departamento;
import com.markers.infraestructure.services.DepartamentoService;

@Service
public class DepartamentoServicesImpl implements DepartamentoService{

	
	 @Autowired
	 DepartamentoDao dao;
	 
	 
	 @Override
		public List<Departamento> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Departamento recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(Departamento datos) {
			 if(dao.recuperarRegistroById(datos.getIdDepartamento())==null) {
		            dao.agregarRegistro(datos);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(Departamento datos) {
			 if(dao.recuperarRegistroById(datos.getIdDepartamento())==null) {
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
		public List<Departamento> findRegistroById(int id) {

			return dao.devolverRegistroById(id);
		}

}
