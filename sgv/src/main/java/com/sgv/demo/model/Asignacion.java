package com.sgv.demo.model;

public class Asignacion {

}

/**
	 CREATE TABLE TB_ASIGNACION (
	  "id_asignacion" VARCHAR2(7) NOT NULL PRIMARY KEY,
	  "matricula"  VARCHAR2(8) NOT NULL REFERENCES TB_VEHICULO,
	  "id_empleado" VARCHAR2(5) NOT NULL REFERENCES TB_EMPLEADO, 
	  "id_turno"  NUMBER(1,0) NOT NULL REFERENCES TB_TURNO,
	  "fecha_inicio" DATE NOT NULL,
	  "fecha_fin" DATE NULL
	); 
 * */
 