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
@ApiModel(value = "TipoDocumento", description = "Esta clase representa la informacion del TipoDocumento")
@Entity
@Table(name = "tipodocumento")
@Data
public class TipoDocumento {

	@ApiModelProperty(value = "idTipoDocumento", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipodocumento")
	Integer idTipoDocumento;
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "descripcion")
	String descripcion;
	
	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 5)
	@Column(name = "usuestado")
	Boolean Estado;

	public TipoDocumento(Integer idTipoDocumento, String descripcion, Boolean estado) {
	
		this.idTipoDocumento = idTipoDocumento;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public TipoDocumento() {
	
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
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
		return "TipoDocumento [idTipoDocumento=" + idTipoDocumento + ", descripcion=" + descripcion + ", Estado="
				+ Estado + "]";
	}
	
	
	
	
}
