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
@ApiModel(value = "Prestamo", description = "Esta clase representa la informacion del Prestamo")
@Entity
@Table(name = "Prestamo")
@Data
public class Prestamo {

	
	@ApiModelProperty(value = "idPrestamo", required = true, dataType = "Integer", example = "00000000", position = 1)
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "idPrestamo")
	Integer idPrestamo;
	
	@ApiModelProperty(value = "idSolicitud", required = true, dataType = "Integer", example = "00000000", position = 2)
	@ManyToOne
    @JoinColumn(name = "idSolicitud")
	Solicitudes idSolicitud;
	
	@ApiModelProperty(value = "usuarioId", required = true, dataType = "Integer", example = "00000000", position = 3)
	@ManyToOne
    @JoinColumn(name = "usuarioId")
	Usuarios usuarioId;
	
	@ApiModelProperty(value = "monto", required = true, dataType = "Double", example = "00000000", position = 4)
	  @Column(name = "monto")
	Double monto;
	
	@ApiModelProperty(value = "plazoEnMeses", required = true, dataType = "Integer", example = "00000000", position = 5)
	  @Column(name = "plazoEnMeses")
	Integer plazoEnMeses;
	
	@ApiModelProperty(value = "EstadoPrestamo", required = true, dataType = "Boolean", example = "00000000", position = 6)
	  @Column(name = "EstadoPrestamo")
	Boolean EstadoPrestamo;
    
	public Prestamo(Integer idPrestamo,Solicitudes idSolicitud, Usuarios usuarioId, Double monto, Integer plazoEnMeses, Boolean estadoPrestamo) {
	
		this.idPrestamo = idPrestamo;
		this.idSolicitud = idSolicitud;
		this.usuarioId = usuarioId;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
		EstadoPrestamo = estadoPrestamo;
	}
    
	public Prestamo() {
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Usuarios getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuarios usuarioId) {
		this.usuarioId = usuarioId;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(Integer plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public Boolean getEstadoPrestamo() {
		return EstadoPrestamo;
	}

	public void setEstadoPrestamo(Boolean estadoPrestamo) {
		EstadoPrestamo = estadoPrestamo;
	}

	@Override
	public String toString() {
		return "Prestamo [idPrestamo=" + idPrestamo + ", usuarioId=" + usuarioId + ", monto=" + monto
				+ ", plazoEnMeses=" + plazoEnMeses + ", EstadoPrestamo=" + EstadoPrestamo + "]";
	}
	 
    
}
