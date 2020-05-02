package com.sgv.demo.model;

public class Disponibilidad {

	private long id_dispon;
	private String des_dispon;

	public Disponibilidad() {
	}

	public Disponibilidad(long id_dispon, String des_dispon) {
		this.id_dispon = id_dispon;
		this.des_dispon = des_dispon;
	}

	public long getId_dispon() {
		return id_dispon;
	}

	public void setId_dispon(long id_dispon) {
		this.id_dispon = id_dispon;
	}

	public String getDes_dispon() {
		return des_dispon;
	}

	public void setDes_dispon(String des_dispon) {
		this.des_dispon = des_dispon;
	}

}

/*
 * CREATE TABLE TB_DISPONIBILIDAD ( "id_dispon" NUMBER(1,0) NOT NULL PRIMARY
 * KEY, "des_dispon" VARCHAR2(25) NOT NULL );
 * 
 */
