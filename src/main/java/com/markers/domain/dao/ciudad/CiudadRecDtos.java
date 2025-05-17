package com.markers.domain.dao.ciudad;

import java.util.List;

import com.markers.domain.models.Ciudad;


public interface CiudadRecDtos {

	Ciudad recuperarCiudad(Integer data);
	
	List<Ciudad> devolverRegistro();
}
