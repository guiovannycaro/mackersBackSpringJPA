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
    @Column(name = "usuId")
	Integer usuId;
	
	@ApiModelProperty(value = "usuNombre", required = true, dataType = "String", example = "00000000", position = 2)
	  @Column(name = "usuNombre")
	String usuNombre;
	
	@ApiModelProperty(value = "usuUsuario", required = true, dataType = "String", example = "00000000", position = 3)
	  @Column(name = "usuUsuario")
	String usuUsuario;
	
	@ApiModelProperty(value = "usuEstado", required = true, dataType = "String", example = "00000000", position = 4)
	  @Column(name = "usuEstado")
	String usuEstado;
	
	@ApiModelProperty(value = "usuContrasena", required = true, dataType = "String", example = "00000000", position = 5)
	  @Column(name = "usuContrasena")
	String usuContrasena;
	
	@ApiModelProperty(value = "usuCorreo", required = true, dataType = "String", example = "00000000", position = 6)
	  @Column(name = "usuCorreo")
	String usuCorreo;
	
	@ApiModelProperty(value = "usuRol", required = true, dataType = "String", example = "00000000", position = 7)
	@ManyToOne
    @JoinColumn(name = "usuRol")
	Roles usuRol;
	

	public Usuarios(Integer usuId, String usuNombre, String usuUsuario, String usuEstado, String usuContrasena,
			String usuCorreo, Roles usuRol) {
	
		this.usuId = usuId;
		this.usuNombre = usuNombre;
		this.usuUsuario = usuUsuario;
		this.usuEstado = usuEstado;
		this.usuContrasena = usuContrasena;
		this.usuCorreo = usuCorreo;
		this.usuRol = usuRol;
		
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

	public Roles getUsuRol() {
		return usuRol;
	}

	public void setUsuRol(Roles usuRol) {
		this.usuRol = usuRol;
	}

	

	@Override
	public String toString() {
		return "Usuarios [usuId=" + usuId + ", usuNombre=" + usuNombre + ", usuUsuario=" + usuUsuario + ", usuEstado="
				+ usuEstado + ", usuContrasena=" + usuContrasena + ", usuCorreo=" + usuCorreo + ", usuRol=" + usuRol
				+ "]";
	}
	
	
	
	

}