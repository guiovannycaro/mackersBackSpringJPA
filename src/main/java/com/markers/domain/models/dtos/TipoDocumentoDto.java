package com.markers.domain.models.dtos;

import javax.persistence.Column;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoDocumentoDto {

	Integer idTipoDocumento;
	
	
	String descripcion;
	
	
	Boolean Estado;


	public TipoDocumentoDto(Integer idTipoDocumento, String descripcion, Boolean estado) {
		
		this.idTipoDocumento = idTipoDocumento;
		this.descripcion = descripcion;
		Estado = estado;
	}
	
	public TipoDocumentoDto() {
		
		
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
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
		return "TipoDocumentoDto [idTipoDocumento=" + idTipoDocumento + ", descripcion=" + descripcion + ", Estado="
				+ Estado + "]";
	}
	
	
	
}
