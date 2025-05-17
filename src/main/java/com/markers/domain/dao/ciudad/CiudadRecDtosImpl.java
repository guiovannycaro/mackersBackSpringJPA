package com.markers.domain.dao.ciudad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.Ciudad;
import com.markers.domain.models.dtos.CiudadDto;

@Repository
public class CiudadRecDtosImpl implements CiudadRecDtos{

	@Autowired
	CiudadJpa ciudadJpa;
	
	
	
	@Override
	public Ciudad recuperarCiudad(Integer data) {
		return ciudadJpa.findById(data).orElse(null);
	}

	@Override
	public List<Ciudad> devolverRegistro() {
		// TODO Auto-generated method stub
		return ciudadJpa.findAll();
	}
}
