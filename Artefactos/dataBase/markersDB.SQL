
CREATE SEQUENCE public.usuarios_usu_id_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.TipoDocumento_tdoc_id_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.Roles_rol_id_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.pais_idpais_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.departamentoestado_iddepartamento_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.ciudad_idciudad_seq INCREMENT BY 1 START 1;

CREATE SEQUENCE public.prestamo_idPrestamo_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.solicitudes_idSolicitud_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.TipoSolicitud_tsol_id_seq INCREMENT BY 1 START 1;
CREATE SEQUENCE public.solicitudesUsuario_idSolicitudUsu_seq INCREMENT BY 1 START 1;
CREATE TABLE public.Usuarios
(
	usuId INTEGER DEFAULT nextval('usuarios_usu_id_seq'::regclass) NOT NULL,
	usuNombre VARCHAR NOT NULL,
	tipoDocumento INTEGER NULL,
	numDocumento INTEGER NULL,
	usuEstado Boolean NOT NULL,
	usuContrasena VARCHAR NULL,
	usuCorreo VARCHAR NOT NULL,
	usuRol INTEGER NOT NULL,
	usuCiu INTEGER NOT NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.Usuarios ADD CONSTRAINT Usuarios_pkey
	PRIMARY KEY (usuId);
	
	
	CREATE TABLE public.TipoDocumento
(
	idTipoDocumento INTEGER DEFAULT nextval('TipoDocumento_tdoc_id_seq'::regclass) NOT NULL,
	descripcion VARCHAR NOT NULL,
	usuEstado Boolean NOT NULL
	
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.TipoDocumento ADD CONSTRAINT TipoDocumento_pkey
	PRIMARY KEY (idTipoDocumento);
	
	
		CREATE TABLE public.Roles
(
	idRol INTEGER DEFAULT nextval('Roles_rol_id_seq'::regclass) NOT NULL,
	descripcion VARCHAR NOT NULL,
	usuEstado Boolean NOT NULL
	
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.Roles ADD CONSTRAINT Roles_pkey
	PRIMARY KEY (idRol);
	
	
	CREATE TABLE public.pais
(
	idpais INTEGER DEFAULT nextval('pais_idpais_seq'::regclass) NOT NULL,
	nombre VARCHAR NOT NULL,
	cod_oficial_iso VARCHAR NULL,
	iso2 VARCHAR NOT NULL,
	iso3 VARCHAR NOT NULL,
	latitud DOUBLE PRECISION NULL,
	longitud DOUBLE PRECISION NULL,
	codpostal VARCHAR NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.pais ADD CONSTRAINT pais_pkey
	PRIMARY KEY (idpais);
	
	
	
	CREATE TABLE public.departamentoestado
(
	iddepartamento INTEGER DEFAULT nextval('departamentoestado_iddepartamento_seq'::regclass) NOT NULL,
	idpais INTEGER NOT NULL,
	codoficial VARCHAR NOT NULL,
	nombre VARCHAR NOT NULL,
	latitud DOUBLE PRECISION NULL,
	longitud DOUBLE PRECISION NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.departamentoestado ADD CONSTRAINT departamentoestado_pkey
	PRIMARY KEY (iddepartamento);

CREATE TABLE public.ciudad
(
	idciudad INTEGER DEFAULT nextval('ciudad_idciudad_seq'::regclass) NOT NULL,
	nombre VARCHAR NOT NULL,
	codoficial VARCHAR NULL,
	latitud DOUBLE PRECISION NULL,
	longitud DOUBLE PRECISION NULL,
	iddepartamento INTEGER NOT NULL,
	codpostal VARCHAR NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.ciudad ADD CONSTRAINT ciudad_pkey
	PRIMARY KEY (idciudad);
	
	
	
	CREATE TABLE public.Prestamo
(
	idPrestamo INTEGER DEFAULT nextval('prestamo_idPrestamo_seq'::regclass) NOT NULL,
	idSolicitud INTEGER NOT NULL,
	usuarioId INTEGER NULL,
	monto DOUBLE PRECISION NULL,
	plazoEnMeses INTEGER  NULL,
	EstadoPrestamo Boolean NOT NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.Prestamo ADD CONSTRAINT Prestamo_pkey
	PRIMARY KEY (idPrestamo);
	
	
	
		CREATE TABLE public.TipoSolicitud
(
	idTipoSolicitud INTEGER DEFAULT nextval('TipoSolicitud_tsol_id_seq'::regclass) NOT NULL,
	descripcion VARCHAR NOT NULL,
	Estado Boolean NOT NULL
	
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.TipoSolicitud ADD CONSTRAINT TipoSolicitud_pkey
	PRIMARY KEY (idTipoSolicitud);
	
	
		CREATE TABLE public.Solicitudes
(
	idSolicitud INTEGER DEFAULT nextval('solicitudes_idSolicitud_seq'::regclass) NOT NULL,
	fechaSolicitud DATE  NOT NULL,
	idCiudad INTEGER NULL,
	idTipoSolicitud INTEGER  NULL,
	Estado Boolean NOT NULL
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.Solicitudes ADD CONSTRAINT Solicitudes_pkey
	PRIMARY KEY (idSolicitud);
	
	
	
					CREATE TABLE public.solicitudesUsuario
(
	idSolicitudUsu INTEGER DEFAULT nextval('solicitudesUsuario_idSolicitudUsu_seq'::regclass) NOT NULL,
	idSolicitud INTEGER NOT NULL,
	idUsuario INTEGER NULL
	
) WITHOUT OIDS;

/* Add Primary Key */
ALTER TABLE public.solicitudesUsuario ADD CONSTRAINT solicitudesUsuario_pkey
	PRIMARY KEY (idSolicitudUsu);


	
		/* Add Foreign Key: fk_Usuarios_ciudad */
ALTER TABLE public.Usuarios ADD CONSTRAINT fk_Usuarios_ciudad
	FOREIGN KEY (usuCiu) REFERENCES public.ciudad (idciudad)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
		/* Add Foreign Key: fk_Usuarios_TipoDocumento */
ALTER TABLE public.Usuarios ADD CONSTRAINT fk_Usuarios_TipoDocumento
	FOREIGN KEY (tipoDocumento) REFERENCES public.TipoDocumento (idTipoDocumento)
	ON UPDATE NO ACTION ON DELETE NO ACTION;

		/* Add Foreign Key: fk_Usuarios_Roles */
ALTER TABLE public.Usuarios ADD CONSTRAINT fk_Usuarios_Roles
	FOREIGN KEY (usuRol) REFERENCES public.Roles (idRol)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
		/* Add Foreign Key: fk_ciudad_departamentoestado */
	ALTER TABLE public.ciudad ADD CONSTRAINT fk_ciudad_departamentoestado
	FOREIGN KEY (iddepartamento) REFERENCES public.departamentoestado (iddepartamento)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
	/* Add Foreign Key: fk_departamentoestado_pais */
ALTER TABLE public.departamentoestado ADD CONSTRAINT fk_departamentoestado_pais
	FOREIGN KEY (idpais) REFERENCES public.pais (idpais)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
			/* Add Foreign Key: fk_Prestamo_Solicitudes */
ALTER TABLE public.Prestamo ADD CONSTRAINT fk_Prestamo_Solicitudes
	FOREIGN KEY (idSolicitud) REFERENCES public.Solicitudes (idSolicitud)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
	
				/* Add Foreign Key: fk_Prestamo_Usuarios */
ALTER TABLE public.Prestamo ADD CONSTRAINT fk_Prestamo_Usuarios
	FOREIGN KEY (usuarioId) REFERENCES public.Usuarios (usuId)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
	
					/* Add Foreign Key: fk_Solicitudes_TipoSolicitud */
ALTER TABLE public.Solicitudes ADD CONSTRAINT fk_Solicitudes_TipoSolicitud
	FOREIGN KEY (idTipoSolicitud) REFERENCES public.TipoSolicitud (idTipoSolicitud)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
	
					/* Add Foreign Key: fk_solicitudesUsuario_Usuarios */
ALTER TABLE public.solicitudesUsuario ADD CONSTRAINT fk_solicitudesUsuario_Usuarios
	FOREIGN KEY (idUsuario) REFERENCES public.Usuarios (usuId)
	ON UPDATE NO ACTION ON DELETE NO ACTION;
	
		
					/* Add Foreign Key: fk_solicitudesUsuario_Solicitudes */
ALTER TABLE public.solicitudesUsuario ADD CONSTRAINT fk_solicitudesUsuario_Solicitudes
	FOREIGN KEY (idSolicitud) REFERENCES public.Solicitudes (idSolicitud)
	ON UPDATE NO ACTION ON DELETE NO ACTION;