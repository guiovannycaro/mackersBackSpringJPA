package com.markers.domain.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Usuarios", description = "Esta clase representa la informacion del Usuarios")

@Entity
@Table(name = "Usuarios")
@Data
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "usuId", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuid")
	Integer usuId;
	
	@ApiModelProperty(value = "usuNombre", required = true, dataType = "String", example = "00000000", position = 2)
	  @Column(name = "usunombre")
	String usuNombre;
	
	@ApiModelProperty(value = "tipoDocumento", required = true, dataType = "String", example = "00000000", position = 3)
	@ManyToOne
    @JoinColumn(name = "tipodocumento")
	TipoDocumento tipoDocumento;
	
	@ApiModelProperty(value = "numDocumento", required = true, dataType = "String", example = "00000000", position = 4)
	  @Column(name = "numdocumento")
	Integer numDocumento;
	
	@ApiModelProperty(value = "usuEstado", required = true, dataType = "String", example = "00000000", position = 5)
	  @Column(name = "usuestado")
	Boolean usuEstado;
	
	@ApiModelProperty(value = "usuContrasena", required = true, dataType = "String", example = "00000000", position = 6)
	  @Column(name = "usucontrasena")
	String usuContrasena;
	
	@ApiModelProperty(value = "usuCorreo", required = true, dataType = "String", example = "00000000", position = 7)
	  @Column(name = "usucorreo")
	String usuCorreo;
	
	@ApiModelProperty(value = "usuRol", required = true, dataType = "String", example = "00000000", position = 8)
	@ManyToOne
    @JoinColumn(name = "usurol")
	Roles usuRol;
	
	
	@ApiModelProperty(value = "usuCiu", required = true, dataType = "String", example = "00000000", position = 9)
	@ManyToOne
    @JoinColumn(name = "usuciu")
	Ciudad usuCiu;


	public Usuarios(Integer usuId, String usuNombre, TipoDocumento tipoDocumento, Integer numDocumento,
			Boolean usuEstado, String usuContrasena, String usuCorreo, Roles usuRol, Ciudad usuCiu) {
		
		this.usuId = usuId;
		this.usuNombre = usuNombre;
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
		this.usuEstado = usuEstado;
		this.usuContrasena = usuContrasena;
		this.usuCorreo = usuCorreo;
		this.usuRol = usuRol;
		this.usuCiu = usuCiu;
	}

	public Usuarios() {
		
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

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(Integer numDocumento) {
		this.numDocumento = numDocumento;
	}

	public Boolean getUsuEstado() {
		return usuEstado;
	}

	public void setUsuEstado(Boolean usuEstado) {
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

	public Roles getUsuRol() {
		return usuRol;
	}

	public void setUsuRol(Roles usuRol) {
		this.usuRol = usuRol;
	}

	public Ciudad getCiudad() {
		return usuCiu;
	}

	public void setCiudad(Ciudad usuCiu) {
		this.usuCiu = usuCiu;
	}

	@Override
	public String toString() {
		return "Usuarios [usuId=" + usuId + ", usuNombre=" + usuNombre + ", tipoDocumento=" + tipoDocumento
				+ ", numDocumento=" + numDocumento + ", usuEstado=" + usuEstado + ", usuContrasena=" + usuContrasena
				+ ", usuCorreo=" + usuCorreo + ", usuRol=" + usuRol + ", usuCiu=" + usuCiu + "]";
	}
	
	
	
}