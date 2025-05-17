package com.markers.infraestructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.markers.domain.models.Ciudad;
import com.markers.domain.models.dtos.CiudadDto;
import com.markers.infraestructure.services.CiudadService;

import java.util.ArrayList;
import java.util.Collections;


@RestController
@RequestMapping("api/markers/AppAdmin/Ciudad")
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
	  
	  @GetMapping(value = "/listadoCiudades", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<CiudadDto> listadoDatos() {
	        try {
	        	
	        	List<CiudadDto> ciudadDtos = new ArrayList<>();
	        	
	        	List<Ciudad> ciudades = service.devolverListaRegistro();
	        	
	        	
	        	
	        	for (Ciudad c : ciudades) {
	        	    CiudadDto dto = new CiudadDto();
	        	    dto.setIdCiudad(c.getIdCiudad());
	        	    dto.setNombre(c.getNombre());
	        	    dto.setCodoficial(c.getCodoficial());
	        	    dto.setLatitud(c.getLatitud());
	        	    dto.setLongitud(c.getLongitud());
	        	    dto.setIdDepartamento(c.getIdDepartamento().getIdDepartamento());
	        	    dto.setCodpostal(c.getCodpostal());
	        	 
	        	    ciudadDtos.add(dto);
	        	}
	        	
	            return ciudadDtos;
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
	    
	    @DeleteMapping(value = "/eliminarCiudad", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void eliminarDatos(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	             service.eliminarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
	    
	    
	  
	    
	    @GetMapping(value = "/obtenerCiudadById", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Ciudad> obtenerById(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	        	 return   service.findRegistroById(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }

	    
}
