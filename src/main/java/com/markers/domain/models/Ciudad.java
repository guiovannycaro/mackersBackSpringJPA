package com.markers.domain.models;

import javax.persistence.*;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Ciudad", description = "Esta clase representa la informacion del Ciudad")
@Entity
@Table(name = "ciudad")
@Data
public class Ciudad {

	
	@ApiModelProperty(value = "idCiudad", required = true, dataType = "Integer", example = "00000000", position = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idciudad")
	Integer idCiudad;
	
	@ApiModelProperty(value = "nombre", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "nombre")
	String nombre;
	
	@ApiModelProperty(value = "codoficial", required = true, dataType = "String", example = "00000000", position = 3)
	@Column(name = "codoficial")
	String codoficial;
	
	@ApiModelProperty(value = "latitud", required = true, dataType = "Double", example = "00000000", position = 4)
	@Column(name = "latitud")
	Double latitud;
	
	@ApiModelProperty(value = "latitud", required = true, dataType = "Double", example = "00000000", position = 5)
	@Column(name = "longitud")
	Double longitud;
	
	@ApiModelProperty(value = "idDepartamento", required = true, dataType = "Integer", example = "00000000", position = 6)
	@ManyToOne
    @JoinColumn(name = "iddepartamento")
	Departamento idDepartamento;

	@ApiModelProperty(value = "codpostal", required = true, dataType = "String", example = "00000000", position = 7)
	@Column(name = "codpostal")
	String codpostal;

	public Ciudad(Integer idCiudad, String nombre, String codoficial, Double latitud, Double longitud,
			Departamento idDepartamento, String codpostal) {

		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.codoficial = codoficial;
		this.latitud = latitud;
		this.longitud = longitud;
		this.idDepartamento = idDepartamento;
		this.codpostal = codpostal;
	}

	public Ciudad() {
	
	}

	public Integer getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodoficial() {
		return codoficial;
	}

	public void setCodoficial(String codoficial) {
		this.codoficial = codoficial;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public Departamento getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Departamento idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	@Override
	public String toString() {
		return "Ciudad [idCiudad=" + idCiudad + ", nombre=" + nombre + ", codoficial=" + codoficial + ", latitud="
				+ latitud + ", longitud=" + longitud + ", idDepartamento=" + idDepartamento + ", codpostal=" + codpostal
				+ "]";
	}
	
	

	
}
