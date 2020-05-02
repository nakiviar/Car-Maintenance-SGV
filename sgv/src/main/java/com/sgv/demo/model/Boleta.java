package com.sgv.demo.model;

public class Boleta {

	private String id_boleta;
	private long ingreso_total;
	private String fecha_boleta;
	private long inasistencias;
	private long descuentos;
	private long id_contrato;

	public Boleta(String id_boleta, long ingreso_total, String fecha_boleta, long inasistencias, long descuentos,
			long id_contrato) {
		this.id_boleta = id_boleta;
		this.ingreso_total = ingreso_total;
		this.fecha_boleta = fecha_boleta;
		this.inasistencias = inasistencias;
		this.descuentos = descuentos;
		this.id_contrato = id_contrato;
	}

	public Boleta() {
	}

	public String getId_boleta() {
		return id_boleta;
	}

	public void setId_boleta(String id_boleta) {
		this.id_boleta = id_boleta;
	}

	public long getIngreso_total() {
		return ingreso_total;
	}

	public void setIngreso_total(long ingreso_total) {
		this.ingreso_total = ingreso_total;
	}

	public String getFecha_boleta() {
		return fecha_boleta;
	}

	public void setFecha_boleta(String fecha_boleta) {
		this.fecha_boleta = fecha_boleta;
	}

	public long getInasistencias() {
		return inasistencias;
	}

	public void setInasistencias(long inasistencias) {
		this.inasistencias = inasistencias;
	}

	public long getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(long descuentos) {
		this.descuentos = descuentos;
	}

	public long getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(long id_contrato) {
		this.id_contrato = id_contrato;
	}

}
/*
 * CREATE TABLE TB_BOLETA ( "id_boleta" VARCHAR2(8) NOT NULL PRIMARY KEY,
 * "ingreso_total" NUMBER NULL, "fecha_boleta" String NOT NULL, "inasistencias"
 * NUMBER NULL, "descuentos" NUMBER NOT NULL, "id_contrato" NUMBER NOT NULL
 * REFERENCES TB_CONTRATO );
 * 
 */
