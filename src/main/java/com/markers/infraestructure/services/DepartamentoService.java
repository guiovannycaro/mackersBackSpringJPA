package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Departamento;

public interface DepartamentoService {

	
	List<Departamento> devolverRegistro();

	Departamento recuperarRegistroById(int id);

	void agregarRegistro(Departamento datos);

	void actualizarRegistro(Departamento datos);

	void eliminaRegistro(int id);
}
