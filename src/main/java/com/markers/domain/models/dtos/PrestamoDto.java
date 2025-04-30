package com.markers.domain.models.dtos;









import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrestamoDto {

	
	
	Integer idPrestamo;

	Integer idSolicitud;

	Integer usuarioId;
	
	Double monto;
	
	Integer plazoEnMeses;

    Boolean EstadoPrestamo;
    
	public PrestamoDto(Integer idPrestamo, Integer usuarioId, Double monto, Integer plazoEnMeses, Boolean estadoPrestamo) {
	
		this.idPrestamo = idPrestamo;
		this.usuarioId = usuarioId;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
		EstadoPrestamo = estadoPrestamo;
	}
    
	public PrestamoDto() {
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
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
