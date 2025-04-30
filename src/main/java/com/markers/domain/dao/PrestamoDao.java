package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.Prestamo;

public interface PrestamoDao {

	List<Prestamo> devolverRegistro();

	Prestamo recuperarRegistroById(int id);

	void agregarRegistro(Prestamo datos);

	void actualizarRegistro(Prestamo datos);

	void eliminaRegistro(int id);
}
