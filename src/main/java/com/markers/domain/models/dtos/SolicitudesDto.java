package com.markers.domain.models.dtos;

import java.util.Date;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitudesDto {


	
	Integer idSolicitud;

	Date fechaSolicitud;
	
	
	Integer idCiudad;

	Integer idTipoSolicitud;
	
    Boolean Estado;
	
	public SolicitudesDto(Integer idSolicitud, Date fechaSolicitud, Integer idCiudad, Integer idTipoSolicitud,
			Boolean estado) {
	
		this.idSolicitud = idSolicitud;
		this.fechaSolicitud = fechaSolicitud;
		this.idCiudad = idCiudad;
		this.idTipoSolicitud = idTipoSolicitud;
		Estado = estado;
	}
	
	public SolicitudesDto() {
	
		
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

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public Integer getIdTipoSolicitud() {
		return idTipoSolicitud;
	}

	public void setIdTipoSolicitud(Integer idTipoSolicitud) {
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
