package com.markers.domain.models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

import lombok.Data;

@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Departamento", description = "Esta clase representa la informacion del Departamento")
@Entity
@Table(name = "departamentoestado")
@Data
public class Departamento {

	@ApiModelProperty(value = "idDepartamento", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddepartamento")
	Integer idDepartamento;
	
	
	@ApiModelProperty(value = "pais", required = true, dataType = "Integer", example = "00000000", position = 2)
	@ManyToOne
    @JoinColumn(name = "idpais")
	Pais pais;
	
	

	@ApiModelProperty(value = "codoficial", required = true, dataType = "String", example = "00000000", position = 3)
	@Column(name = "codoficial")
	String codoficial;
	
	
	@ApiModelProperty(value = "nombre", required = true, dataType = "String", example = "00000000", position = 4)
	@Column(name = "nombre")
	String nombre;
	
	@ApiModelProperty(value = "latitud", required = true, dataType = "Double", example = "00000000", position = 5)
	@Column(name = "latitud")
	Double latitud;
	
	@ApiModelProperty(value = "latitud", required = true, dataType = "Double", example = "00000000", position = 6)
	@Column(name = "longitud")
	Double longitud;

	public Departamento(Integer idDepartamento, Pais pais, String codoficial, String nombre, Double latitud,
			Double longitud) {
		super();
		this.idDepartamento = idDepartamento;
		this.pais = pais;
		this.codoficial = codoficial;
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public Departamento() {
		
	}

	public Integer getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(Integer idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getCodoficial() {
		return codoficial;
	}

	public void setCodoficial(String codoficial) {
		this.codoficial = codoficial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", pais=" + pais + ", codoficial=" + codoficial
				+ ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + "]";
	}
	
	
	
	
}
