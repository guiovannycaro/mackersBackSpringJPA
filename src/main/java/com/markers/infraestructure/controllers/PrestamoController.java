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


import com.markers.domain.models.Prestamo;

import com.markers.infraestructure.services.PrestamoService;

@RestController
@RequestMapping("markers/Prestamo")
public class PrestamoController {

	 @Autowired
	 PrestamoService service;
	  
	  @GetMapping(value = "/listarPrestamo", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Prestamo> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearPrestamo", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody Prestamo datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdPrestamo());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarPais", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Prestamo datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdPrestamo());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
}
