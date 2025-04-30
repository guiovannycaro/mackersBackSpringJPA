package com.markers.domain.models;

public class MensajeError {
	String codigo;
	String mensaje;
	String descripcion;
	
	public MensajeError(String codigo, String mensaje, String descripcion) {
		this.codigo = codigo;
		this.mensaje = mensaje;
		this.descripcion = descripcion;
	}
	
	public MensajeError() {
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
