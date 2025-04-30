package com.markers.domain.models.dtos;




import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolesDto {

	
	
	Integer idRol;
	
	String descripcion;
	
    Boolean Estado;
	
	public RolesDto(Integer idRol, String descripcion, Boolean estado) {
		this.idRol = idRol;
		this.descripcion = descripcion;
		Estado = estado;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
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
		return "Roles [idRol=" + idRol + ", descripcion=" + descripcion + ", Estado=" + Estado + "]";
	}
	
	
	
	
	
}
