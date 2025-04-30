package com.markers.domain.models;

import java.util.Date;

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
@ApiModel(value = "TipoSolicitud", description = "Esta clase representa la informacion del TipoSolicitud")
@Entity
@Table(name = "TipoSolicitud")
@Data
public class TipoSolicitud {

	@ApiModelProperty(value = "idPrestamo", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoSolicitud")
	Integer idTipoSolicitud;
	
	@ApiModelProperty(value = "descripcion", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "descripcion")
	String descripcion;
	
	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 5)
	@Column(name = "Estado")
	Boolean Estado;
	
	public TipoSolicitud(Integer idTipoSolicitud, String descripcion, Boolean estado) {
		
		this.idTipoSolicitud = idTipoSolicitud;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public TipoSolicitud() {
		
	
	}

	public Integer getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public void setIdTipoSolicitud(Integer idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
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
		return "TipoSolicitud [idTipoSolicitud=" + idTipoSolicitud + ", descripcion=" + descripcion + ", Estado="
				+ Estado + "]";
	}
	
	
	
}
