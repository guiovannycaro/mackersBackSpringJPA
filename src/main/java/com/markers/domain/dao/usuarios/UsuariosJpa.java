package com.markers.domain.dao.usuarios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.Usuarios;

public interface UsuariosJpa extends JpaRepository<Usuarios, Integer> {

}
