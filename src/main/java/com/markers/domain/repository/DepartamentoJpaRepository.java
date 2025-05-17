package com.markers.domain.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.markers.domain.models.Departamento;

public interface DepartamentoJpaRepository   extends JpaRepository<Departamento, Integer>{

	@Query("SELECT a FROM Departamento a WHERE a.idDepartamento = :id")
	Departamento findById(int id);
	
	@Query("SELECT a FROM Departamento a WHERE a.idDepartamento = :id")
	List<Departamento> searchById(@Param("id") int id);
}
