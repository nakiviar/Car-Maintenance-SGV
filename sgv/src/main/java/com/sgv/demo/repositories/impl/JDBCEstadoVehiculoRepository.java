package com.sgv.demo.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sgv.demo.model.Vehiculo_estado;
import com.sgv.demo.model.Vehiculo_tipo;
import com.sgv.demo.repositories.EstadoVehiculoRepository;

@Repository
public class JDBCEstadoVehiculoRepository implements EstadoVehiculoRepository{

	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Override
	public List<Vehiculo_estado> findAllVehiculoEstado() {
		return jdbctemplate.query("SELECT * FROM TB_ESTADO_VEHICULO", 
				(rs, rowNum)-> new Vehiculo_estado(
						rs.getInt("id_estado"),
						rs.getString("estado")));
	}
}
