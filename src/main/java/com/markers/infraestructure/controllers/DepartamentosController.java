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


import com.markers.domain.models.Departamento;

import com.markers.infraestructure.services.DepartamentoService;

@RestController
@RequestMapping("markers/Departamentos")
public class DepartamentosController {

	 @Autowired
	 DepartamentoService service;
	  
	  @GetMapping(value = "/listarDepartamentos", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Departamento> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearDepartamentos", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody Departamento datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdDepartamento());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarDepartamentos", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Departamento datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdDepartamento());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
}
