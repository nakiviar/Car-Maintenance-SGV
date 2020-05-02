package com.sgv.demo.model;

public class Asignacion_turno {
	
	private long id_turno;
	private String des_turno;

	public Asignacion_turno() {
	}

	public Asignacion_turno(long id_turno, String des_turno) {
		this.id_turno = id_turno;
		this.des_turno = des_turno;
	}

	public long getId_turno() {
		return id_turno;
	}

	public void setId_turno(long id_turno) {
		this.id_turno = id_turno;
	}

	public String getDes_turno() {
		return des_turno;
	}

	public void setDes_turno(String des_turno) {
		this.des_turno = des_turno;
	}

}
/*
 * CREATE TABLE TB_TURNO ( "id_turno" NUMBER(1,0) NOT NULL PRIMARY KEY,
 * "des_turno" VARCHAR2(25) );
 * 
 */
