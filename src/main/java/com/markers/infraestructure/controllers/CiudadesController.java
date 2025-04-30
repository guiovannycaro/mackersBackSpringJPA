package com.markers.infraestructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.markers.domain.models.Ciudad;
import com.markers.infraestructure.services.CiudadService;
import java.util.Collections;


@RestController
@RequestMapping("markers/Ciudad")
public class CiudadesController {

	 @Autowired
	 CiudadService service;
	  
	  @GetMapping(value = "/listarCiudades", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Ciudad> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearCiudades", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody Ciudad datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdCiudad());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarCiudades", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Ciudad datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdCiudad());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }

	    
}
