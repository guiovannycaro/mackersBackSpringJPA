package com.markers.domain.dao.tipodocumento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markers.domain.models.TipoDocumento;

@Repository
public class TipoDocumentoRecDtosImpl implements TipoDocumentoRecDtos{

	@Autowired
	TipoDocumentoJpa tipoDocumentoJpa;
	
	@Override
	public TipoDocumento recuperarTipoDocumento(Integer tipoDocumento) {
		return tipoDocumentoJpa.findById(tipoDocumento).orElse(null);
	}
}
