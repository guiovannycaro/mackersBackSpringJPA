package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.markers.domain.models.Ciudad;

public interface CiudadJpaRepository extends JpaRepository<Ciudad, Integer>{
	@Query("SELECT a FROM Ciudad a WHERE a.ciuid = :id")
	Ciudad findById(int id);
}
