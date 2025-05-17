package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.Roles;

public interface RolesJpaRepository extends JpaRepository<Roles, Integer>{

	@Query("SELECT a FROM Roles a WHERE a.idRol = :id")
	Roles findById(int id);
	
	@Query("SELECT a FROM Roles a WHERE a.idRol = :id")
	List<Roles> searchById(@Param("id") int id);
}
