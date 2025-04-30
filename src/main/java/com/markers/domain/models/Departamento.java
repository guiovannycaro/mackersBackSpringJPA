package com.markers.domain.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

import lombok.Data;

@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Departamento", description = "Esta clase representa la informacion del Departamento")
@Entity
@Table(name = "Departamento")
@Data
public class Departamento {

	@ApiModelProperty(value = "idDepartamento", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDepartamento")
	Integer idDepartamento;
	
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "descripcion")
	String descripcion;
	
	
	@ApiModelProperty(value = "idPais", required = true, dataType = "Integer", example = "00000000", position = 3)
	@ManyToOne
    @JoinColumn(name = "idPais")
	Integer idPais;

	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 4)
    Boolean Estado;

	public Departamento(Integer idDepartamento, String descripcion, Integer idPais, Boolean estado) {
		this.idDepartamento = idDepartamento;
		this.descripcion = descripcion;
		this.idPais = idPais;
		Estado = estado;
	}
	
	public Departamento() {

	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", descripcion=" + descripcion + ", idPais=" + idPais
				+ ", Estado=" + Estado + "]";
	}
	
	
	
}
