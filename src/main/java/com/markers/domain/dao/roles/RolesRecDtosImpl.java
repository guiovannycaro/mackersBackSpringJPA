package com.markers.domain.dao.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.Roles;

@Repository
public class RolesRecDtosImpl implements RolesRecDtos{

	@Autowired
	RolesJpa tipoDocumentoJpa;
	
	@Override
	public Roles recuperarRoles(Integer data) {
		return tipoDocumentoJpa.findById(data).orElse(null);
	}
}
