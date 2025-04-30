package com.markers.infraestructure.services;

import java.util.List;

import com.markers.domain.models.Prestamo;

public interface PrestamoService {

	List<Prestamo> devolverRegistro();

	Prestamo recuperarRegistroById(int id);

	void agregarRegistro(Prestamo datos);

	void actualizarRegistro(Prestamo datos);

	void eliminaRegistro(int id);
}
