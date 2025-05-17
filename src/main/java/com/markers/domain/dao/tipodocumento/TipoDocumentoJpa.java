package com.markers.domain.dao.tipodocumento;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.TipoDocumento;

public interface TipoDocumentoJpa extends JpaRepository<TipoDocumento, Integer> {

}
