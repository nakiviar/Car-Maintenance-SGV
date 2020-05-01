package com.sgv.demo.repositories.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sgv.demo.model.Licencia;
import com.sgv.demo.repositories.LicenciaRepository;

@Repository
public class JDBCLicenciaRepository implements LicenciaRepository{

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	@Override
	public int count() {
		   return jdbctemplate
	                .queryForObject("select count(*) from TB_TIPO_LICENCIA", Integer.class);
	}

	@Override
	public List<Licencia> findAll() {
		
		return jdbctemplate.query("SELECT * FROM TB_TIPO_LICENCIA", 
				(rs, rowNum)-> new Licencia(
						
						rs.getString("id_tipoLicen"),
						rs.getString("alcance_licencia"),
						rs.getString("vehiculos_licencia")
						
						));
	}

	
	@Override
	public String getNameById(Long id) {
		   return jdbctemplate.queryForObject(
	                "select vehiculos_licencia from books where id_tipoLicen = ?",
	                new Object[]{id},
	                String.class
	        );
	}

	
}
