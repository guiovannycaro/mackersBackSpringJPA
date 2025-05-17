package com.markers.infraestructure.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.markers.domain.dao.UsuariosDao;
import com.markers.domain.dao.ciudad.CiudadRecDtos;
import com.markers.domain.dao.roles.RolesRecDtos;
import com.markers.domain.dao.tipodocumento.TipoDocumentoRecDtos;
import com.markers.domain.models.Ciudad;
import com.markers.domain.models.Roles;
import com.markers.domain.models.TipoDocumento;
import com.markers.domain.models.Usuarios;
import com.markers.domain.models.dtos.UsuariosDto;
import com.markers.infraestructure.services.UsuariosService;

@Service
public class UsuariosServicesImpl   implements UsuariosService{
	
	@Autowired
	 UsuariosDao dao;
	
	@Autowired
	TipoDocumentoRecDtos tipoDocimentoDao;
	
	@Autowired
	RolesRecDtos rolesDao;
	
	@Autowired
	CiudadRecDtos ciudadDao;
	 
	 @Override
		public List<Usuarios> devolverRegistro() {

			return dao.devolverRegistro();
		}

		@Override
		public Usuarios recuperarRegistroById(int id) {
			 return dao.recuperarRegistroById(id);
		}

		@Override
		public boolean agregarRegistro(UsuariosDto datos) {
			 if(dao.recuperarRegistroById(datos.getUsuId())==null) {
 
				    Usuarios user = new Usuarios(); 
		            user.setUsuId(datos.getUsuId());
		            user.setUsuNombre(datos.getUsuNombre());
		            user.setTipoDocumento(tipoDocimentoDao.recuperarTipoDocumento(datos.getTipoDocumento()));
		            user.setNumDocumento(datos.getNumDocumento());
		            user.setUsuEstado(datos.getUsuEstado());
		            user.setUsuContrasena(datos.getUsuPassword());
		            user.setUsuCorreo(datos.getUsuCorreo());
		            user.setUsuRol(rolesDao.recuperarRoles(datos.getUsuRol()));
		            user.setCiudad(ciudadDao.recuperarCiudad(datos.getUsuCiudad()));

		            dao.agregarRegistro(user);
		            return true;
		        }
		        return false;
			
		}

		@Override
		public void actualizarRegistro(UsuariosDto datos) {
			
			Usuarios userU = new Usuarios(); 
		
				 
				 Usuarios user = new Usuarios(); 
		            user.setUsuId(datos.getUsuId());
		            user.setUsuNombre(datos.getUsuNombre());
		            user.setTipoDocumento(tipoDocimentoDao.recuperarTipoDocumento(datos.getTipoDocumento()));
		            user.setNumDocumento(datos.getNumDocumento());
		            user.setUsuEstado(datos.getUsuEstado());
		            user.setUsuContrasena(datos.getUsuPassword());
		            user.setUsuCorreo(datos.getUsuCorreo());
		            user.setUsuRol(rolesDao.recuperarRoles(datos.getUsuRol()));
		            user.setCiudad(ciudadDao.recuperarCiudad(datos.getUsuCiudad()));
		            
		            dao.actualizarRegistro(user);
		       
		        
			
		}

		@Override
		public boolean eliminarRegistro(int id) {
	
			 if(dao.recuperarRegistroById(id)!=null) {
		            dao.eliminaRegistro(id);
		            return true;
		        }
		        return false;
			
		}
		
		@Override
		public List<Usuarios> findRegistroById(int id) {

			return dao.devolverRegistroById(id);
		}
}
