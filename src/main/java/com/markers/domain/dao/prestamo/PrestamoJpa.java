package com.markers.domain.dao.prestamo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.Prestamo;

public interface PrestamoJpa extends JpaRepository<Prestamo, Integer> {

}
