package com.markers.domain.models.dtos;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoSolicitudDto {

	
	Integer idTipoSolicitud;

	String descripcion;

    Boolean Estado;
	
	public TipoSolicitudDto(Integer idTipoSolicitud, String descripcion, Boolean estado) {
		
		this.idTipoSolicitud = idTipoSolicitud;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public TipoSolicitudDto() {
		
	
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
