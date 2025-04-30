package com.markers.domain.models.dtos;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartamentoDto {

	
	Integer idDepartamento;

	String descripcion;

	Integer idPais;


    Boolean Estado;

	public DepartamentoDto(Integer idDepartamento, String descripcion, Integer idPais, Boolean estado) {
		this.idDepartamento = idDepartamento;
		this.descripcion = descripcion;
		this.idPais = idPais;
		Estado = estado;
	}
	
	public DepartamentoDto() {

	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", descripcion=" + descripcion + ", idPais=" + idPais
				+ ", Estado=" + Estado + "]";
	}
	
	
	
}
