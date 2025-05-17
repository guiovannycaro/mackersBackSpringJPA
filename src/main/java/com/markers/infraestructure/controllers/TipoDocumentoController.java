package com.markers.infraestructure.controllers;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.markers.domain.models.TipoDocumento;
import com.markers.infraestructure.services.TipoDocumentoService;

@RestController
@RequestMapping("api/markers/AppAdmin/TipoDocumento")
public class TipoDocumentoController {

	@Autowired
	TipoDocumentoService service;
	  
	  @GetMapping(value = "/listarTipoDocumento", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<TipoDocumento> listaDatos() {
	        try {
	            return service.devolverRegistro();
	        } catch (Exception er) {

	            return Collections.emptyList();
	        }
	    }
	    
	    @PostMapping(value = "/crearTipoDocumento", consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void crearDatos(@RequestBody TipoDocumento datos) {
	        try {

	            System.out.println("viene del front " + datos.getIdTipoDocumento());
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarTipoDocumento", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody TipoDocumento datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdTipoDocumento());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
	    
	    @DeleteMapping(value = "/eliminarRegistro", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void eliminarDatos(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	             service.eliminarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
	    
	    
	  
	    
	    @GetMapping(value = "/obtenerRegistroById", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<TipoDocumento> obtenerById(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	        	 return   service.findRegistroById(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }
}
