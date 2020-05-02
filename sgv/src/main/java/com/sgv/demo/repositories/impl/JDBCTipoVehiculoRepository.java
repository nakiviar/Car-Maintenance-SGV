package com.sgv.demo.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sgv.demo.model.Vehiculo_tipo;
import com.sgv.demo.repositories.TipoVehiculoRepository;

@Repository
public class JDBCTipoVehiculoRepository implements TipoVehiculoRepository  {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	@Override
	public List<Vehiculo_tipo> findallTiposVehiculos() {
		// TODO Auto-generated method stub
		return jdbctemplate.query("SELECT * FROM tb_tipo_vehiculo", 
				(rs, rowNum)-> new Vehiculo_tipo(
						rs.getInt("id_tipo_vehiculo"),
						rs.getString("nombre_tipo")));
	}

}
