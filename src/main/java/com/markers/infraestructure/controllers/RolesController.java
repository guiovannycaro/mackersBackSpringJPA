package com.markers.infraestructure.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.markers.domain.models.Roles;

import com.markers.infraestructure.services.RolesService;

@RestController
@RequestMapping("markers/Roles")
public class RolesController {

	
	 @Autowired
	 RolesService service;
	  
	  @GetMapping(value = "/listarRoles", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Roles> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearRoles", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody Roles datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdRol());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarRoles", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Roles datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdRol());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
}
