package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Departamento;

public interface DepartamentoService {

	
	List<Departamento> devolverRegistro();

	Departamento recuperarRegistroById(int id);

	boolean agregarRegistro(Departamento datos);

	void actualizarRegistro(Departamento datos);

	boolean eliminaRegistro(int id);
}
