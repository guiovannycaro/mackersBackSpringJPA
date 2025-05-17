package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.Pais;

public interface PaisJpaRepository extends JpaRepository<Pais, Integer>{

	@Query("SELECT a FROM Pais a WHERE a.idpais = :id")
	Pais findById(int id);
	
	@Query("SELECT a FROM Pais a WHERE a.idpais = :id")
	List<Pais> searchById(@Param("id") int id);
}
