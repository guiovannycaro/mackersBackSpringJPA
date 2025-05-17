package com.markers.domain.models.dtos;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


public class CiudadDto {

	

	Integer idCiudad;
	
	String nombre;
	
	String codoficial;

	Double latitud;
	Double longitud;
	Integer idDepartamento;
	String codpostal;
   


	
	
	public CiudadDto(Integer idCiudad, String nombre, String codoficial, Double latitud, Double longitud,
			Integer idDepartamento, String codpostal) {
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codoficial = codoficial;
		this.latitud = latitud;
		this.longitud = longitud;
		this.idDepartamento = idDepartamento;
		this.codpostal = codpostal;
	}


	public CiudadDto() {

	}


	public Integer getIdCiudad() {
		return idCiudad;
	}


	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodoficial() {
		return codoficial;
	}


	public void setCodoficial(String codoficial) {
		this.codoficial = codoficial;
	}


	public Double getLatitud() {
		return latitud;
	}


	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}


	public Double getLongitud() {
		return longitud;
	}


	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public Integer getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	public String getCodpostal() {
		return codpostal;
	}


	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}


	@Override
	public String toString() {
		return "CiudadDto [idCiudad=" + idCiudad + ", nombre=" + nombre + ", codoficial=" + codoficial + ", latitud="
				+ latitud + ", longitud=" + longitud + ", idDepartamento=" + idDepartamento + ", codpostal=" + codpostal
				+ "]";
	}


	
}
