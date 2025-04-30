package com.markers.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.Prestamo;

public interface PrestamoJpaRepository extends JpaRepository<Prestamo, Integer>{

	@Query("SELECT a FROM Prestamo a WHERE a.idPrestamo = :id")
	Prestamo findById(int id);
}
