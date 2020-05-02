package com.sgv.demo.model;

public class Vehiculo_estado {

	private long id_estado;
	private String estado;

	public Vehiculo_estado(long id_estado, String estado) {
		this.id_estado = id_estado;
		this.estado = estado;
	}

	public Vehiculo_estado() {
	}

	public long getId_estado() {
		return id_estado;
	}

	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
/*
     CREATE TABLE TB_ESTADO_VEHICULO
    (	
    "id_estado" NUMBER(1,0) NOT NULL PRIMARY KEY , 
    "estado" VARCHAR2(25) NOT NULL
    );
 */
