package com.markers.domain.models.dtos;

public class  UsuarioRolDTO {
	 String usuNombre;
  String descripcion;

    public UsuarioRolDTO(String usuNombre, String descripcion) {
        this.usuNombre = usuNombre;
        this.descripcion = descripcion;
    }
    
    
    public UsuarioRolDTO() {
     
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


	@Override
	public String toString() {
		return "UsuarioRolDTO [usuNombre=" + usuNombre + ", descripcion=" + descripcion + "]";
	}

	
	
	
    
}
