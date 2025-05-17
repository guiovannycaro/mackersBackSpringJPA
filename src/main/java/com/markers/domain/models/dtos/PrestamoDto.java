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

    Boolean estado;
    
	
	public PrestamoDto(Integer idPrestamo, Integer idSolicitud, Integer usuarioId, Double monto, Integer plazoEnMeses,
			Boolean estado) {
		this.idPrestamo = idPrestamo;
		this.idSolicitud = idSolicitud;
		this.usuarioId = usuarioId;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
		this.estado = estado;
	}

	public PrestamoDto() {
	}

	public Integer getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Integer getIdSolicitud() {
		return idSolicitud;
	}

	public void setIdSolicitud(Integer idSolicitud) {
		this.idSolicitud = idSolicitud;
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "PrestamoDto [idPrestamo=" + idPrestamo + ", idSolicitud=" + idSolicitud + ", usuarioId=" + usuarioId
				+ ", monto=" + monto + ", plazoEnMeses=" + plazoEnMeses + ", Estado=" + estado + "]";
	}

	
	 
    
}
