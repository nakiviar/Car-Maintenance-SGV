package com.sgv.demo.model;

public class Vehiculo {

}

/**
     CREATE TABLE TB_VEHICULO (
      "matricula" VARCHAR2(8) NOT NULL PRIMARY KEY,--USUALMENTE ES DE 7 DIGITOS PERO PORSIACASO
      "id_tipo_vehiculo" NUMBER REFERENCES tb_tipo_vehiculo,
      "carga_max" NUMBER, --SE MIDEN EN TONELADAS
      "marca_vehiculo" VARCHAR(25) NOT NULL,
      "gasolina" VARCHAR(25) NOT NULL,
      "modelo_vehiculo" VARCHAR(25) NOT NULL,
      "años_vehiculo" NUMBER,
      "kilometraje" NUMBER,
      "frenos delanteros" VARCHAR(25) NOT NULL,
      "motor_vehiculo" VARCHAR(50) NOT NULL,
      "nro_llantas" NUMBER NOT NULL,
      "repuesto_llantas" NUMBER,
      "foto" VARCHAR(150) NULL,
      "id_estado" NUMBER(1,0) REFERENCES TB_ESTADO_VEHICULO -- POR DEFECTO 1
    ); 
 * */

