package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.Roles;

public interface RolesJpaRepository extends JpaRepository<Roles, Integer>{

	@Query("SELECT a FROM Roles a WHERE a.idRol = :id")
	Roles findById(int id);
}
