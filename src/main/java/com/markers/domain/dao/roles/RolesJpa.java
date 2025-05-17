package com.markers.domain.dao.roles;


import org.springframework.data.jpa.repository.JpaRepository;

import com.markers.domain.models.Roles;

public interface RolesJpa extends JpaRepository<Roles, Integer> {

}
