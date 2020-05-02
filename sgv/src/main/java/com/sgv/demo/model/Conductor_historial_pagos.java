package com.sgv.demo.model;

public class Conductor_historial_pagos {

	private String id_historial;
	private String id_empleado;

	public Conductor_historial_pagos() {
	}

	public Conductor_historial_pagos(String id_historial, String id_empleado) {
		this.id_historial = id_historial;
		this.id_empleado = id_empleado;
	}

	public String getId_historial() {
		return id_historial;
	}

	public void setId_historial(String id_historial) {
		this.id_historial = id_historial;
	}

	public String getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}

}

/*
 * CREATE TABLE TB_HISTORIAL_PAGOS ( "id_historial" varchar2(10) NOT NULL
 * primary key, "id_empleado" VARCHAR2(5) NOT NULL REFERENCES TB_EMPLEADO );
 * 
 */
