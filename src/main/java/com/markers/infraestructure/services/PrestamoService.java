package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Prestamo;

public interface PrestamoService {

	List<Prestamo> devolverRegistro();

	Prestamo recuperarRegistroById(int id);

	boolean agregarRegistro(Prestamo datos);

	void actualizarRegistro(Prestamo datos);

	boolean eliminaRegistro(int id);
}
