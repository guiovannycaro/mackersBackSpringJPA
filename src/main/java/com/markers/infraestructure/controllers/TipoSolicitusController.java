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


import com.markers.domain.models.TipoSolicitud;
import com.markers.infraestructure.services.TipoSolicitudService;

@RestController
@RequestMapping("markers/TipoSolicitud")
public class TipoSolicitusController {

	@Autowired
	TipoSolicitudService service;
	  
	  @GetMapping(value = "/listarTipoSolicitud", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<TipoSolicitud> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearTipoSolicitud", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody TipoSolicitud datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdTipoSolicitud());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarTipoSolicitud", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody TipoSolicitud datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdTipoSolicitud());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
}
