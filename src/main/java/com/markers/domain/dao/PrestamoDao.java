package com.markers.domain.dao;

import java.util.List;

import com.markers.domain.models.Prestamo;
import com.markers.domain.models.Usuarios;

public interface PrestamoDao {

	List<Prestamo> devolverRegistro();

	Prestamo recuperarRegistroById(int id);

	void agregarRegistro(Prestamo datos);

	void actualizarRegistro(Prestamo datos);

	void eliminaRegistro(int id);
	
	List<Prestamo> devolverRegistroById(int id);
}
