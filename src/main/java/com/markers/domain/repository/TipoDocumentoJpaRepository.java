package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.markers.domain.models.TipoDocumento;



public interface TipoDocumentoJpaRepository extends JpaRepository<TipoDocumento, Integer>{
	@Query("SELECT a FROM TipoDocumento a WHERE a.idTipoDocumento = :id")
	TipoDocumento findById(int id);
	
	@Query("SELECT a FROM TipoDocumento a WHERE a.idTipoDocumento = :id")
	List<TipoDocumento> searchById(@Param("id") int id);
}
