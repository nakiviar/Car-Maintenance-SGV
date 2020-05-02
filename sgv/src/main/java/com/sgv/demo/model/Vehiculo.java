package com.sgv.demo.model;

public class Vehiculo {
	private String matricula;
	private Integer id_tipo_vehiculo;
	private long carga_max;
	private String marca_vehiculo;
	private String gasolina;
	private String modelo_vehiculo;
	private Integer años_vehiculo;
	private double kilometraje;
	private String frenos_delanteros;
	private String motor_vehiculo;
	private Integer nro_llantas;
	private Integer repuesto_llantas;
	private String foto;
	private Integer id_estado;

	public Vehiculo(String matricula, Integer id_tipo_vehiculo, long carga_max, String marca_vehiculo, String gasolina,
			String modelo_vehiculo, Integer años_vehiculo, double kilometraje, String frenos_delanteros,
			String motor_vehiculo, Integer nro_llantas, Integer repuesto_llantas, String foto, Integer id_estado) {

		this.matricula = matricula;
		this.id_tipo_vehiculo = id_tipo_vehiculo;
		this.carga_max = carga_max;
		this.marca_vehiculo = marca_vehiculo;
		this.gasolina = gasolina;
		this.modelo_vehiculo = modelo_vehiculo;
		this.años_vehiculo = años_vehiculo;
		this.kilometraje = kilometraje;
		this.frenos_delanteros = frenos_delanteros;
		this.motor_vehiculo = motor_vehiculo;
		this.nro_llantas = nro_llantas;
		this.repuesto_llantas = repuesto_llantas;
		this.foto = foto;
		this.id_estado = id_estado;
	}
	

	public Vehiculo() {
	
		// TODO Auto-generated constructor stub
	}


	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getId_tipo_vehiculo() {
		return id_tipo_vehiculo;
	}

	public void setId_tipo_vehiculo(Integer id_tipo_vehiculo) {
		this.id_tipo_vehiculo = id_tipo_vehiculo;
	}

	public String getMarca_vehiculo() {
		return marca_vehiculo;
	}

	public void setMarca_vehiculo(String marca_vehiculo) {
		this.marca_vehiculo = marca_vehiculo;
	}

	public long getCarga_max() {
		return carga_max;
	}

	public void setCarga_max(long carga_max) {
		this.carga_max = carga_max;
	}

	public String getGasolina() {
		return gasolina;
	}

	public void setGasolina(String gasolina) {
		this.gasolina = gasolina;
	}

	public String getModelo_vehiculo() {
		return modelo_vehiculo;
	}

	public void setModelo_vehiculo(String modelo_vehiculo) {
		this.modelo_vehiculo = modelo_vehiculo;
	}

	public Integer getAños_vehiculo() {
		return años_vehiculo;
	}

	public void setAños_vehiculo(Integer años_vehiculo) {
		this.años_vehiculo = años_vehiculo;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getFrenos_delanteros() {
		return frenos_delanteros;
	}

	public void setFrenos_delanteros(String frenos_delanteros) {
		this.frenos_delanteros = frenos_delanteros;
	}

	public String getMotor_vehiculo() {
		return motor_vehiculo;
	}

	public void setMotor_vehiculo(String motor_vehiculo) {
		this.motor_vehiculo = motor_vehiculo;
	}

	public Integer getNro_llantas() {
		return nro_llantas;
	}

	public void setNro_llantas(Integer nro_llantas) {
		this.nro_llantas = nro_llantas;
	}

	public Integer getRepuesto_llantas() {
		return repuesto_llantas;
	}

	public void setRepuesto_llantas(Integer repuesto_llantas) {
		this.repuesto_llantas = repuesto_llantas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Integer getId_estado() {
		return id_estado;
	}

	public void setId_estado(Integer id_estado) {
		this.id_estado = id_estado;
	}

}

/**
 * CREATE TABLE TB_VEHICULO ( "matricula" VARCHAR2(8) NOT NULL PRIMARY
 * KEY,--USUALMENTE ES DE 7 DIGITOS PERO PORSIACASO "id_tipo_vehiculo" NUMBER
 * REFERENCES tb_tipo_vehiculo, "carga_max" NUMBER, --SE MIDEN EN TONELADAS
 * "marca_vehiculo" VARCHAR(25) NOT NULL, "gasolina" VARCHAR(25) NOT NULL,
 * "modelo_vehiculo" VARCHAR(25) NOT NULL, "años_vehiculo" NUMBER, "kilometraje"
 * NUMBER, "frenos delanteros" VARCHAR(25) NOT NULL, "motor_vehiculo"
 * VARCHAR(50) NOT NULL, "nro_llantas" NUMBER NOT NULL, "repuesto_llantas"
 * NUMBER, "foto" VARCHAR(150) NULL, "id_estado" NUMBER(1,0) REFERENCES
 * TB_ESTADO_VEHICULO -- POR DEFECTO 1 );
 */
