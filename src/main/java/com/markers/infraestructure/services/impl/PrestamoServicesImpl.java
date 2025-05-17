package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.PrestamoDao;
import com.markers.domain.dao.prestamo.PrestamoRecDtos;
import com.markers.domain.dao.solicitud.SolicitudesRecDtos;
import com.markers.domain.dao.tipodocumento.TipoDocumentoRecDtos;
import com.markers.domain.dao.usuarios.UsuariosRecDtos;
import com.markers.domain.models.Prestamo;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.PrestamoDto;
import com.markers.infraestructure.services.PrestamoService;

@Service
public class PrestamoServicesImpl  implements PrestamoService{

	 @Autowired
	 PrestamoDao dao;
	 
	 @Autowired
	 SolicitudesRecDtos solicitudesDao;
	 
	 @Autowired
	 UsuariosRecDtos usuariosDao;
	 
	 @Override
		public List<Prestamo> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Prestamo recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(PrestamoDto datos) {
			
				 
				 Prestamo pres = new Prestamo(); 
				 
				 pres.setIdPrestamo(datos.getIdPrestamo());
				 pres.setIdsolicitud(solicitudesDao.recuperarSolicitudes(datos.getIdSolicitud()));
				 pres.setUsuarioId(usuariosDao.recuperarUsuarios(datos.getUsuarioId()));
				 pres.setMonto(datos.getMonto());
				 pres.setPlazoEnMeses(datos.getPlazoEnMeses());
				 pres.setEstadoPrestamo(datos.getEstado());
				    
		            dao.agregarRegistro(pres);
		            return true;
		        
			
		}

		@Override
		public void actualizarRegistro(Prestamo datos) {
			 if(dao.recuperarRegistroById(datos.getIdPrestamo())==null) {
		            dao.actualizarRegistro(datos);
		       
		        }
			
		}

		@Override
		public boolean eliminaRegistro(int id) {
			 if(dao.recuperarRegistroById(id)!=null) {
		            dao.eliminaRegistro(id);
		            return true;
		        }
		        return false;
			
		}
		
		@Override
		public List<Prestamo> findRegistroById(int id) {

			return dao.devolverRegistroById(id);
		}
}
