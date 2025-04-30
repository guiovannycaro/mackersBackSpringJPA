package com.markers.domain.models.dtos;

import java.io.Serializable;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuariosDto implements Serializable {

	private static final long serialVersionUID = 1L;

	
	Integer usuId;

	String usuNombre;

	String usuUsuario;

	String usuEstado;

	String usuContrasena;

	String usuCorreo;

	String usuRol;
	

	public UsuariosDto(Integer usuId, String usuNombre, String usuUsuario, String usuEstado, String usuContrasena,
			String usuCorreo, String usuRol) {
	
		this.usuId = usuId;
		this.usuNombre = usuNombre;
		this.usuUsuario = usuUsuario;
		this.usuEstado = usuEstado;
		this.usuContrasena = usuContrasena;
		this.usuCorreo = usuCorreo;
		this.usuRol = usuRol;
		
	}
	
	public UsuariosDto() {
	
	}

	public Integer getUsuId() {
		return usuId;
	}

	public void setUsuId(Integer usuId) {
		this.usuId = usuId;
	}

	public String getUsuNombre() {
		return usuNombre;
	}

	public void setUsuNombre(String usuNombre) {
		this.usuNombre = usuNombre;
	}

	public String getUsuUsuario() {
		return usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

	public String getUsuEstado() {
		return usuEstado;
	}

	public void setUsuEstado(String usuEstado) {
		this.usuEstado = usuEstado;
	}

	public String getUsuContrasena() {
		return usuContrasena;
	}

	public void setUsuContrasena(String usuContrasena) {
		this.usuContrasena = usuContrasena;
	}

	public String getUsuCorreo() {
		return usuCorreo;
	}

	public void setUsuCorreo(String usuCorreo) {
		this.usuCorreo = usuCorreo;
	}

	public String getUsuRol() {
		return usuRol;
	}

	public void setUsuRol(String usuRol) {
		this.usuRol = usuRol;
	}

	

	@Override
	public String toString() {
		return "Usuarios [usuId=" + usuId + ", usuNombre=" + usuNombre + ", usuUsuario=" + usuUsuario + ", usuEstado="
				+ usuEstado + ", usuContrasena=" + usuContrasena + ", usuCorreo=" + usuCorreo + ", usuRol=" + usuRol
				+ "]";
	}
	
	
	
	

}