package com.markers.domain.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@SuppressWarnings("all") // Nombres a utilizar en los objetos JSON a enviar al cliente
@ApiModel(value = "Pais", description = "Esta clase representa la informacion del Pais")
@Entity
@Table(name = "Pais")
@Data
public class Pais {
	@ApiModelProperty(value = "idpais", required = true, dataType = "Integer", example = "00000000", position = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpais")
	Integer idpais;
	
	@ApiModelProperty(value = "nombre", required = true, dataType = "String", example = "00000000", position = 2)
	@Column(name = "nombre")
	String nombre;
	
	
	@ApiModelProperty(value = "codoficialiso", required = true, dataType = "String", example = "00000000", position = 3)
	@Column(name = "cod_oficial_iso")
	String codoficialiso;
	
	@ApiModelProperty(value = "iso2", required = true, dataType = "String", example = "00000000", position = 4)
	@Column(name = "iso2")
	String iso2;
	
	@ApiModelProperty(value = "iso3", required = true, dataType = "String", example = "00000000", position = 5)
	@Column(name = "iso3")
	String iso3;
	
	@ApiModelProperty(value = "latitud", required = true, dataType = "Double", example = "00000000", position = 6)
	@Column(name = "latitud")
	Double latitud;
	
	@ApiModelProperty(value = "longitud", required = true, dataType = "Double", example = "00000000", position = 7)
	@Column(name = "longitud")
	Double longitud;
	
	@ApiModelProperty(value = "codpostal", required = true, dataType = "String", example = "00000000", position = 8)
	@Column(name = "codpostal")
	String codpostal;

	public Pais(Integer idpais, String nombre, String codoficialiso, String iso2, String iso3, Double latitud,
			Double longitud, String codpostal) {
		this.idpais = idpais;
		this.nombre = nombre;
		this.codoficialiso = codoficialiso;
		this.iso2 = iso2;
		this.iso3 = iso3;
		this.latitud = latitud;
		this.longitud = longitud;
		this.codpostal = codpostal;
	}

	public Pais() {

	}

	public Integer getIdpais() {
		return idpais;
	}

	public void setIdpais(Integer idpais) {
		this.idpais = idpais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodoficialiso() {
		return codoficialiso;
	}

	public void setCodoficialiso(String codoficialiso) {
		this.codoficialiso = codoficialiso;
	}

	public String getIso2() {
		return iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
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

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	@Override
	public String toString() {
		return "Pais [idpais=" + idpais + ", nombre=" + nombre + ", codoficialiso=" + codoficialiso + ", iso2=" + iso2
				+ ", iso3=" + iso3 + ", latitud=" + latitud + ", longitud=" + longitud + ", codpostal=" + codpostal
				+ "]";
	}
	


	

}
