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

import com.markers.domain.models.Ciudad;
import com.markers.domain.models.Roles;
import com.markers.domain.models.TipoDocumento;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.CiudadDto;
import com.markers.domain.models.dtos.UsuariosDto;
import com.markers.infraestructure.services.UsuariosService;

@RestController
@RequestMapping("api/markers/AppAdmin/Usuarios")
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
	    public void crearDatos(@RequestBody UsuariosDto datos) {
	        try {

	            System.out.println("viene del front " + datos.getUsuId() + "" + datos.getTipoDocumento());
	       
	            service.agregarRegistro(datos);
	            
	        } catch (Exception er) {

	            System.err.println("Se ha generado un erroral crear la dependencia :  " + er.getMessage());

	        }
	    }
	    
	    @PostMapping(value = "/actualizarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	    public void actualizarDatos(@RequestBody UsuariosDto datos) {
	        try {


	        	 System.err.println("viene del front " + datos.getUsuId()
	        	 + " " + datos.getUsuNombre()+ " " + datos.getTipoDocumento()+ " " +datos.getNumDocumento()
	        	 + " " + datos.getUsuRol() + " " + datos.getUsuCorreo() + " " + datos.getUsuPassword()
	        	 + " " + datos.getUsuCiudad() + " " + datos.getUsuEstado() 
	        			 );
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
	    public List<Usuarios> obtenerById(@RequestParam int datos) {
	        try {


	        	 System.out.println("viene del front " + datos);
	        	 return   service.findRegistroById(datos);
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }
	    
	    @GetMapping(value = "/obtenerListadoById", produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<UsuariosDto> obtenerListadoById(@RequestParam int datos) {
	        try {

	        	List<UsuariosDto> usuariosDtos = new ArrayList<>();
	        	
	        	List<Usuarios> usuarios = service.findRegistroById(datos);
	        	
	        	
	        	
	        	for (Usuarios c : usuarios) {
	        		UsuariosDto dto = new UsuariosDto();
	        	    dto.setUsuId(c.getUsuId());
	        	    dto.setUsuNombre(c.getUsuNombre());
	        	    dto.setTipoDocumento(c.getTipoDocumento().getIdTipoDocumento());
	        	    dto.setNumDocumento(c.getNumDocumento());
	        	    dto.setUsuRol(c.getUsuRol().getIdRol());
	        	    dto.setUsuCorreo(c.getUsuCorreo());
	        	    dto.setUsuPassword(c.getUsuContrasena());
	        	    dto.setUsuCiudad(c.getCiudad().getIdCiudad());
	        	    dto.setUsuEstado(c.getUsuEstado());
	        	    usuariosDtos.add(dto);
	        	}
	        	
	            return usuariosDtos;
	        
	        } catch (Exception er) {

	            System.err.println("Se ha generado un error  :  " + er.getMessage());
	            return Collections.emptyList();
	        }
	    }
}
