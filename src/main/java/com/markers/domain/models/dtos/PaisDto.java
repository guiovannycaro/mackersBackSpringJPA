package com.markers.domain.models.dtos;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaisDto {
	
	Integer idPais;

	String descripcion;


    Boolean Estado;

	public PaisDto(Integer idPais, String descripcion, Boolean estado) {
		this.idPais = idPais;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public PaisDto() {

	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
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
		return "Pais [idPais=" + idPais + ", descripcion=" + descripcion + ", Estado=" + Estado + "]";
	}
	
	

}
