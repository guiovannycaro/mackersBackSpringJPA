package com.markers.domain.models.dtos;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CiudadDto {

	

	Integer idCiudad;
	
	String descripcion;
	
	Integer idDepartamento;

	
    Boolean Estado;

	public CiudadDto(Integer idCiudad, String descripcion, Integer idDepartamento, Boolean estado) {

		this.idCiudad = idCiudad;
		this.descripcion = descripcion;
		this.idDepartamento = idDepartamento;
		Estado = estado;
	}
	
	
	public CiudadDto() {

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


	public Integer getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(Integer idDepartamento) {
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
