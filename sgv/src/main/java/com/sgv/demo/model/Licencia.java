package com.sgv.demo.model;

public class Licencia {

	private String id_tipoLicen;
	private String alcance_licencia;
	private String vehiculos_licencia;

	public String getId_tipoLicen() {
		return id_tipoLicen;
	}

	public void setId_tipoLicen(String id_tipoLicen) {
		this.id_tipoLicen = id_tipoLicen;
	}

	public String getAlcance_licencia() {
		return alcance_licencia;
	}

	public void setAlcance_licencia(String alcance_licencia) {
		this.alcance_licencia = alcance_licencia;
	}

	public String getVehiculos_licencia() {
		return vehiculos_licencia;
	}

	public void setVehiculos_licencia(String vehiculos_licencia) {
		this.vehiculos_licencia = vehiculos_licencia;
	}

	public Licencia(String id_tipoLicen, String alcance_licencia, String vehiculos_licencia) {
		this.id_tipoLicen = id_tipoLicen;
		this.alcance_licencia = alcance_licencia;
		this.vehiculos_licencia = vehiculos_licencia;
	}

	public Licencia() {

	}

}
/*
 * CREATE TABLE TB_TIPO_LICENCIA ( "id_tipoLicen" VARCHAR2(6) NOT NULL PRIMARY
 * KEY , "alcance_licencia" VARCHAR2(100) NOT NULL, "vehiculos_licencia"
 * VARCHAR2(150) NOT NULL );
 * 
 */
