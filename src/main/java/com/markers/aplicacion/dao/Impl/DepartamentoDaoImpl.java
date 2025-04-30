package com.markers.aplicacion.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.dao.DepartamentoDao;

import com.markers.domain.models.Departamento;
import com.markers.domain.repository.DepartamentoJpaRepository;
@Repository
public class DepartamentoDaoImpl implements DepartamentoDao{

	
	 @Autowired
	 DepartamentoJpaRepository repositorio;
	 
	 
	 @Override
		public List<Departamento> devolverRegistro() {

			return repositorio.findAll();
		}

		@Override
		public Departamento recuperarRegistroById(int id) {
			 return repositorio.findById(id);
		}

		@Override
		public void agregarRegistro(Departamento datos) {
			repositorio.save(datos);
			
		}

		@Override
		public void actualizarRegistro(Departamento datos) {
			repositorio.save(datos);
			
		}

		@Override
		public void eliminaRegistro(int id) {
			repositorio.deleteById(id);
			
		}

}
