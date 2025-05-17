package com.markers.infraestructure.security.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuarioRolDTO;
import com.markers.domain.utils.ExceptionUtil;
import com.markers.infraestructure.security.services.ServicioSeguridad;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@CrossOrigin(origins = {"http://localhost:4200/"} )
@RestController
@RequestMapping("api/markers/AppAdmin/Seguridad")
@Api(value = "Administracion de Seguridad")
public class ServicioSeguridadController {
	protected final Log log = LogFactory.getLog(this.getClass());
	@Autowired
	ServicioSeguridad service;
	
	@PostMapping(value = "/Autenticacion")
	@ApiOperation(value = "autenticacion De Usuarios", response = Usuarios.class, notes = "Lista Los Usuarios en el Sistema")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Se Creo el Usuario   de manera correcta", response = Usuarios.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuario Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class), })
	public boolean validarUsuario(@RequestBody Usuarios datos) {
		try {
			
			System.err.println(datos.getUsuContrasena() + " " + datos.getUsuCorreo() );
			return service.autenticacion(datos);
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return false;
		}
		
		
		
	}
	
	
	
	@GetMapping(value = "/GetRegistroPerfil")
	@ApiOperation(value = "autenticacion De Usuarios", response = Usuarios.class, notes = "Lista Los Usuarios en el Sistema")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Se Creo el Usuario   de manera correcta", response = Usuarios.class),
			@ApiResponse(code = 400, message = "Bad Request.El Usuario Ingresado Esta Mal Digitado(String)", response = Usuarios.class),
			@ApiResponse(code = 500, message = "Error del sistema inesperado", response = Usuarios.class),
			@ApiResponse(code = 403, message = "Acceso denegado", response = Usuarios.class),
			@ApiResponse(code = 401, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class),
			@ApiResponse(code = 404, message = "No existen Datos Asociados a Ese Usuario", response = Usuarios.class), })
	public List<UsuarioRolDTO> getUsuario(@RequestParam String datos) {
		try {
			
			
			return service.getRol(datos);
			
		} catch (Exception e) {
			log.error(ExceptionUtil.format(e));
			return null;
		}
		
		
		
	}
	
	
	
	
	
	
	
}
