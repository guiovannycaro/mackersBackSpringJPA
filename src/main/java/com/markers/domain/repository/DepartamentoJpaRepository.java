package com.markers.domain.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.markers.domain.models.Departamento;

public interface DepartamentoJpaRepository   extends JpaRepository<Departamento, Integer>{

	@Query("SELECT a FROM Departamento a WHERE a.idDepartamento = :id")
	Departamento findById(int id);
}
