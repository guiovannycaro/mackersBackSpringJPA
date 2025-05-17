package com.markers.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.markers.domain.models.Prestamo;


public interface PrestamoJpaRepository extends JpaRepository<Prestamo, Integer>{

	@Query("SELECT a FROM Prestamo a WHERE a.idPrestamo = :id")
	Prestamo findById(@Param("id") int id);
	
	@Query("SELECT a FROM Prestamo a WHERE a.idPrestamo = :id")
	List<Prestamo> listaPrestamosById(@Param("id") int id);
	
	@Query("SELECT a FROM Prestamo a")
	List<Prestamo> listaPrestamos();
	
	@Query("SELECT a FROM Prestamo a WHERE a.idPrestamo = :id")
	List<Prestamo> searchById(@Param("id") int id);
}
