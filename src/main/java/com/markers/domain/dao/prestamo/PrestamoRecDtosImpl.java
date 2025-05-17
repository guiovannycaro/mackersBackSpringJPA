package com.markers.domain.dao.prestamo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.Prestamo;

@Repository
public class PrestamoRecDtosImpl implements PrestamoRecDtos{

	@Autowired
	PrestamoJpa prestamoJpa;
	
	@Override
	public Prestamo recuperarPrestamo(Integer tipoDocumento) {
		return prestamoJpa.findById(tipoDocumento).orElse(null);
	}
}
