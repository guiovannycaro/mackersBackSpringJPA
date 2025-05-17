package com.markers.infraestructure.controllers;

import java.util.ArrayList;
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


import com.markers.domain.models.Prestamo;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.PrestamoDto;
import com.markers.domain.models.dtos.UsuariosDto;
import com.markers.infraestructure.services.PrestamoService;

@RestController
@RequestMapping("api/markers/AppAdmin/Prestamo")
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
	    public void crearDatos(@RequestBody PrestamoDto datos) {
	        try {

	            System.err.println("viene del front " + 
	            
	            		
	            datos.getIdPrestamo()  +" "+ 
				datos.getIdSolicitud() +" "+ 
				datos.getUsuarioId() +" "+ 
				 datos.getMonto() +" "+ 
				 datos.getPlazoEnMeses() +" "+ 
				 datos.getEstado() 
	            		
	            		);
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarPrestamo", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody Prestamo datos) {
	        try {


	        	 System.out.println("viene del front " + datos.getIdPrestamo());
	             service.actualizarRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());

	        }
	    }
	    
	    @DeleteMapping(value = "/eliminarPrestamo", produces = MediaType.APPLICATION_JSON_VALUE)
	    public boolean eliminarDatos(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	           return  service.eliminaRegistro(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return false;
	        }
			
	    }
	    
	    @GetMapping(value = "/obtenerRegistroById", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Prestamo> obtenerById(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	        	 return   service.findRegistroById(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }
	    
	    
	    @GetMapping(value = "/obtenerListadoById", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<PrestamoDto> obtenerListadoById(@RequestParam int datos) {
	        try {

	        	List<PrestamoDto> prestamoDtos = new ArrayList<>();
	        	
	        	List<Prestamo> prestamo = service.findRegistroById(datos);
	        	
	        	
	        	
	        	for (Prestamo c : prestamo) {
	        		PrestamoDto dto = new PrestamoDto();
	        	    dto.setIdPrestamo(c.getIdPrestamo());
	        	    dto.setUsuarioId(c.getUsuarioId().getUsuId());
	        	    dto.setIdSolicitud(c.getIdsolicitud().getIdSolicitud())  ;
	        	    dto.setMonto(c.getMonto());
	        	    dto.setPlazoEnMeses(c.getPlazoEnMeses());
	        	    dto.setEstado(c.getEstadoPrestamo());
	        	  
	        	    prestamoDtos.add(dto);
	        	}
	        	
	            return prestamoDtos;
	        
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }
	    
}
