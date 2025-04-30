package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.Pais;

public interface PaisJpaRepository extends JpaRepository<Pais, Integer>{

	@Query("SELECT a FROM Pais a WHERE a.idPais = :id")
	Pais findById(int id);
}
