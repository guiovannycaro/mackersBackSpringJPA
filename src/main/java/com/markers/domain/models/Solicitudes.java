package com.markers.domain.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Solicitudes", description = "Esta clase representa la informacion del Solicitudes")

@Entity
@Table(name = "solicitudes")
@Data
public class Solicitudes {


	@ApiModelProperty(value = "idSolicitud", required = true, dataType = "Integer", example = "00000000", position = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idsolicitud")
	Integer idSolicitud;
	
	@ApiModelProperty(value = "fechaSolicitud", required = true, dataType = "Date", example = "00000000", position = 2)
	   @Column(name = "fechasolicitud")
	Date fechaSolicitud;
	
	@ApiModelProperty(value = "idCiudad", required = true, dataType = "Integer", example = "00000000", position = 3)
	@ManyToOne
    @JoinColumn(name = "idciudad")
	Ciudad idCiudad;
	
	@ApiModelProperty(value = "idTipoSolicitud", required = true, dataType = "Integer", example = "00000000", position = 4)
	@ManyToOne
    @JoinColumn(name = "idtiposolicitud")
	TipoSolicitud idTipoSolicitud;
	
	@ApiModelProperty(value = "Estado", required = true, dataType = "Boolean", example = "00000000", position = 5)
	@Column(name = "estado")
    Boolean Estado;
	
	public Solicitudes(Integer idSolicitud, Date fechaSolicitud, Ciudad idCiudad, TipoSolicitud idTipoSolicitud,
			Boolean estado) {
	
		this.idSolicitud = idSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.idCiudad = idCiudad;
		this.idTipoSolicitud = idTipoSolicitud;
		Estado = estado;
	}
	
	public Solicitudes() {
	
		
	}

	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Date getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public Ciudad getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Ciudad idCiudad) {
		this.idCiudad = idCiudad;
	}

	

	public TipoSolicitud getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public void setIdTipoSolicitud(TipoSolicitud idTipoSolicitud) {
		this.idTipoSolicitud = idTipoSolicitud;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Solicitudes [idSolicitud=" + idSolicitud + ", fechaSolicitud=" + fechaSolicitud + ", idCiudad="
				+ idCiudad + ", idTipoSolicitud=" + idTipoSolicitud + ", Estado=" + Estado + "]";
	}
	
    
}
