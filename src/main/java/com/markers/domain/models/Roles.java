package com.markers.domain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Roles", description = "Esta clase representa la informacion del Roles")
@Entity
@Table(name = "Roles")
@Data
public class Roles {

	
	@ApiModelProperty(value = "idPrestamo", required = true, dataType = "Integer", example = "00000000", position = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idrol")
	Integer idRol;
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	   @Column(name = "descripcion")
	String descripcion;
	
	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 5)
	   @Column(name = "usuestado")
	Boolean Estado;
	
	public Roles(Integer idRol, String descripcion, Boolean estado) {
		this.idRol = idRol;
		this.descripcion = descripcion;
		Estado = estado;
	}

	
	public Roles() {
		
	}
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Roles [idRol=" + idRol + ", descripcion=" + descripcion + ", Estado=" + Estado + "]";
	}
	
	
	
	
	
}
