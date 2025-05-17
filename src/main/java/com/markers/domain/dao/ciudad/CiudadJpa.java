package com.markers.domain.dao.ciudad;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.Ciudad;

public interface CiudadJpa extends JpaRepository<Ciudad, Integer> {

}
