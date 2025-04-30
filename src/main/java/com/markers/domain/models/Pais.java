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
@ApiModel(value = "Pais", description = "Esta clase representa la informacion del Pais")
@Entity
@Table(name = "Pais")
@Data
public class Pais {
	@ApiModelProperty(value = "idPais", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPais")
	Integer idPais;
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "descripcion")
	String descripcion;

	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 3)
	@Column(name = "Estado")
	Boolean Estado;

	public Pais(Integer idPais, String descripcion, Boolean estado) {
		this.idPais = idPais;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public Pais() {

	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
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
		return "Pais [idPais=" + idPais + ", descripcion=" + descripcion + ", Estado=" + Estado + "]";
	}
	
	

}
