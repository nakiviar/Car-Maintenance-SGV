package com.sgv.demo.model;

public class Averia_Solicitud {
	
	private String id_solic_averia;
	private String id_asignacion;
	private String descripcion;

	public Averia_Solicitud(String id_solic_averia, String id_asignacion, String descripcion) {
		this.id_solic_averia = id_solic_averia;
		this.id_asignacion = id_asignacion;
		this.descripcion = descripcion;
	}

	public Averia_Solicitud() {
	}

	public String getId_solic_averia() {
		return id_solic_averia;
	}

	public void setId_solic_averia(String id_solic_averia) {
		this.id_solic_averia = id_solic_averia;
	}

	public String getId_asignacion() {
		return id_asignacion;
	}

	public void setId_asignacion(String id_asignacion) {
		this.id_asignacion = id_asignacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
/*
 * CREATE TABLE tb_solicitud_averia ( "id_solic_averia" varchar(8) NOT NULL
 * PRIMARY KEY, "id_asignacion" VARCHAR2(7) NOT NULL REFERENCES TB_ASIGNACION,
 * "descripcion" VARCHAR(250) );
 * 
 */
