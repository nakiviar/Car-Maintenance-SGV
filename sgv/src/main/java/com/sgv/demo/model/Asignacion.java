package com.sgv.demo.model;

public class Asignacion {

	private String id_asignacion;
	private String matricula;
	private String id_empleado;
	private long id_turno;
	private String fecha_inicio;
	private String fecha_fin;

	public Asignacion() {
	}

	public Asignacion(String id_asignacion, String matricula, String id_empleado, long id_turno, String fecha_inicio,
			String fecha_fin) {
		this.id_asignacion = id_asignacion;
		this.matricula = matricula;
		this.id_empleado = id_empleado;
		this.id_turno = id_turno;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
	}

	public String getId_asignacion() {
		return id_asignacion;
	}

	public void setId_asignacion(String id_asignacion) {
		this.id_asignacion = id_asignacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}

	public long getId_turno() {
		return id_turno;
	}

	public void setId_turno(long id_turno) {
		this.id_turno = id_turno;
	}

	public String getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(String fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

}

/**
 * CREATE TABLE TB_ASIGNACION ( "id_asignacion" VARCHAR2(7) NOT NULL PRIMARY
 * KEY, "matricula" VARCHAR2(8) NOT NULL REFERENCES TB_VEHICULO, "id_empleado"
 * VARCHAR2(5) NOT NULL REFERENCES TB_EMPLEADO, "id_turno" NUMBER(1,0) NOT NULL
 * REFERENCES TB_TURNO, "fecha_inicio" DATE NOT NULL, "fecha_fin" DATE NULL );
 */
