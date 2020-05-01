package com.sgv.demo.repositories;

import java.util.List;

import com.sgv.demo.model.Licencia;

public interface LicenciaRepository {
		
		int count();

	    List<Licencia> findAll();

	    String getNameById(Long id);
	
	
}
