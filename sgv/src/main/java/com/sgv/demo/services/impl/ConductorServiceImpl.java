package com.sgv.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgv.demo.model.Licencia;
import com.sgv.demo.repositories.LicenciaRepository;
import com.sgv.demo.services.ConductorService;


@Service
public class ConductorServiceImpl implements ConductorService {

	
	@Autowired
	private LicenciaRepository licenciarepository;
	@Override
	public List<Licencia> getAllLicencias() {
		// TODO Auto-generated method stub
		return licenciarepository.findAll(); 
	}

	
	
	
}
