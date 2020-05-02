package com.sgv.demo.model;

public class Vehiculo_Historial {

	private String id_historial;
	private String matricula;

	public Vehiculo_Historial() {
	}

	public Vehiculo_Historial(String id_historial, String matricula) {
		this.id_historial = id_historial;
		this.matricula = matricula;
	}

	public String getId_historial() {
		return id_historial;
	}

	public void setId_historial(String id_historial) {
		this.id_historial = id_historial;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
/*
 * CREATE TABLE TB_historial_vehiculo ( "id_historial" VARCHAR2(7) NOT NULL
 * PRIMARY KEY, "matricula" VARCHAR2(8) NOT NULL REFERENCES TB_VEHICULO );
 */
