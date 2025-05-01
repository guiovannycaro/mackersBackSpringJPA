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


import com.markers.domain.models.Usuarios;

import com.markers.infraestructure.services.UsuariosService;

@RestController
@RequestMapping("markers/Usuarios")
public class UsuariosController {


	@Autowired
	UsuariosService service;
	  
	  @GetMapping(value = "/listarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Usuarios> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearUsuarios", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody Usuarios datos) {
	        try {

	            System.out.println("viene del front " + datos.getUsuId());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Usuarios datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getUsuId());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
}
