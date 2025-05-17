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
	
	Integer tipoDocumento;

	Integer numDocumento;

	Integer usuRol;

	String usuCorreo;

	String usuPassword;

	Integer usuCiudad;
	
	Boolean usuEstado;
	
	

	public UsuariosDto(Integer usuId, String usuNombre, Integer tipoDocumento, Integer numDocumento, Integer usuRol,
			String usuCorreo, String usuPassword, Integer usuCiudad, Boolean usuEstado) {
		this.usuId = usuId;
		this.usuNombre = usuNombre;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.usuRol = usuRol;
		this.usuCorreo = usuCorreo;
		this.usuPassword = usuPassword;
		this.usuCiudad = usuCiudad;
		this.usuEstado = usuEstado;
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

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(Integer numDocumento) {
		this.numDocumento = numDocumento;
	}

	public Integer getUsuRol() {
		return usuRol;
	}

	public void setUsuRol(Integer usuRol) {
		this.usuRol = usuRol;
	}

	public String getUsuCorreo() {
		return usuCorreo;
	}

	public void setUsuCorreo(String usuCorreo) {
		this.usuCorreo = usuCorreo;
	}

	public String getUsuPassword() {
		return usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public Integer getUsuCiudad() {
		return usuCiudad;
	}

	public void setUsuCiudad(Integer usuCiudad) {
		this.usuCiudad = usuCiudad;
	}

	public Boolean getUsuEstado() {
		return usuEstado;
	}

	public void setUsuEstado(Boolean usuEstado) {
		this.usuEstado = usuEstado;
	}

	@Override
	public String toString() {
		return "UsuariosDto [usuId=" + usuId + ", usuNombre=" + usuNombre + ", tipoDocumento=" + tipoDocumento
				+ ", numDocumento=" + numDocumento + ", usuRol=" + usuRol + ", usuCorreo=" + usuCorreo
				+ ", usuPassword=" + usuPassword + ", usuCiudad=" + usuCiudad + ", usuEstado=" + usuEstado + "]";
	}

	
	
	
	

}