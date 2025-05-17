package com.markers.domain.dao;

import java.util.List;


import com.markers.domain.models.Departamento;

public interface DepartamentoDao {

	
	List<Departamento> devolverRegistro();

	Departamento recuperarRegistroById(int id);

	void agregarRegistro(Departamento datos);

	void actualizarRegistro(Departamento datos);

void eliminaRegistro(int id);
	
	List<Departamento> devolverRegistroById(int id);
}
