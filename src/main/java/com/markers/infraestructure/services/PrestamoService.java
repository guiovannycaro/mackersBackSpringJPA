package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Prestamo;

import com.markers.domain.models.dtos.PrestamoDto;

public interface PrestamoService {

	List<Prestamo> devolverRegistro();

	Prestamo recuperarRegistroById(int id);

	boolean agregarRegistro(PrestamoDto datos);

	void actualizarRegistro(Prestamo datos);

	boolean eliminaRegistro(int id);
	
	List<Prestamo> findRegistroById(int id);
}
