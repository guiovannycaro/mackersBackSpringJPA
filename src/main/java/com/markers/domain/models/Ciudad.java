package com.markers.domain.models;

import javax.persistence.*;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Ciudad", description = "Esta clase representa la informacion del Ciudad")
@Entity
@Table(name = "ciudad")
@Data
public class Ciudad {

	
	@ApiModelProperty(value = "idCiudad", required = true, dataType = "Integer", example = "00000000", position = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idCiudad")
	Integer idCiudad;
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "descripcion")
	String descripcion;
	
	@ApiModelProperty(value = "idDepartamento", required = true, dataType = "Integer", example = "00000000", position = 3)
	@ManyToOne
    @JoinColumn(name = "idDepartamento")
	Departamento idDepartamento;

	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 4)
	@Column(name = "Estado")
	Boolean Estado;

	public Ciudad(Integer idCiudad, String descripcion, Departamento idDepartamento, Boolean estado) {

		this.idCiudad = idCiudad;
		this.descripcion = descripcion;
		this.idDepartamento = idDepartamento;
		Estado = estado;
	}
	
	
	public Ciudad() {

	}


	public Integer getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Departamento getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	public Boolean getEstado() {
		return Estado;
	}


	public void setEstado(Boolean estado) {
		Estado = estado;
	}


	@Override
	public String toString() {
		return "Ciudad [idCiudad=" + idCiudad + ", descripcion=" + descripcion + ", idDepartamento=" + idDepartamento
				+ ", Estado=" + Estado + "]";
	}

	
}
