package com.markers.domain.models.dtos;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolicitudesUsuarioDto {

	
	Integer idSolicitudUsu;

	Integer idSolicitud;

	Integer idUsuario;
	
	public SolicitudesUsuarioDto(Integer idSolicitudUsu, Integer idSolicitud, Integer idUsuario) {

		this.idSolicitudUsu = idSolicitudUsu;
		this.idSolicitud = idSolicitud;
		this.idUsuario = idUsuario;
	}
	
	public SolicitudesUsuarioDto() {

		
	}

	public Integer getIdSolicitudUsu() {
		return idSolicitudUsu;
	}

	public void setIdSolicitudUsu(Integer idSolicitudUsu) {
		this.idSolicitudUsu = idSolicitudUsu;
	}

	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "solicitudesUsuario [idSolicitudUsu=" + idSolicitudUsu + ", idSolicitud=" + idSolicitud + ", idUsuario="
				+ idUsuario + "]";
	}
	
	
	
	
	
	
}
