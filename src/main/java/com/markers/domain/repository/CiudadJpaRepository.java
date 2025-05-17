package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.markers.domain.models.Ciudad;

public interface CiudadJpaRepository extends JpaRepository<Ciudad, Integer>{
	@Query("SELECT c FROM Ciudad c WHERE c.id = :id")
	List<Ciudad> buscarById(@Param("id") int id);
	
	
	@Query("SELECT c FROM Ciudad c WHERE c.id = :id")
	Ciudad searchById(@Param("id") int id);
	
	
}
