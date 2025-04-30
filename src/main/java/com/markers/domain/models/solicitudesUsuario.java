package com.markers.domain.models;

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
@ApiModel(value = "solicitudesUsuario", description = "Esta clase representa la informacion del solicitudesUsuario")
@Entity
@Table(name = "solicitudesUsuario")
@Data
public class solicitudesUsuario {

	@ApiModelProperty(value = "idSolicitudUsu", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSolicitudUsu")
	Integer idSolicitudUsu;
	
	@ApiModelProperty(value = "idSolicitud", required = true, dataType = "Integer", example = "00000000", position = 1)
	@ManyToOne
    @JoinColumn(name = "idSolicitud")
	Solicitudes idSolicitud;
	
	@ApiModelProperty(value = "idUsuario", required = true, dataType = "Integer", example = "00000000", position = 2)
	@ManyToOne
    @JoinColumn(name = "idUsuario")
	Usuarios idUsuario;
	
	public solicitudesUsuario(Integer idSolicitudUsu, Solicitudes idSolicitud, Usuarios idUsuario) {

		this.idSolicitudUsu = idSolicitudUsu;
		this.idSolicitud = idSolicitud;
		this.idUsuario = idUsuario;
	}
	
	public solicitudesUsuario() {

		
	}

	public Integer getIdSolicitudUsu() {
		return idSolicitudUsu;
	}

	public void setIdSolicitudUsu(Integer idSolicitudUsu) {
		this.idSolicitudUsu = idSolicitudUsu;
	}

	public Solicitudes getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Solicitudes Solicitud) {
		this.idSolicitud = idSolicitud;
	}

	public Usuarios getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuarios idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public String toString() {
		return "solicitudesUsuario [idSolicitudUsu=" + idSolicitudUsu + ", idSolicitud=" + idSolicitud + ", idUsuario="
				+ idUsuario + "]";
	}
	
	
	
	
	
	
}
