package com.sgv.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgv.demo.model.Conductor;
import com.sgv.demo.model.Licencia;
import com.sgv.demo.repositories.ConductorRepository;
import com.sgv.demo.repositories.LicenciaRepository;
import com.sgv.demo.services.ConductorService;


@Service
public class ConductorServiceImpl implements ConductorService {

	
	@Autowired
	private LicenciaRepository licenciarepository;
	
	@Autowired
	private ConductorRepository conductorRepository;
	
	@Override
	public List<Licencia> getAllLicencias() {
		// TODO Auto-generated method stub
		return licenciarepository.findAll(); 
	}

	@Override
	public String create(Conductor conductor) {

		conductorRepository.save(conductor);
		return "Conductor creado";
	}

	@Override
	public Conductor get(String id) {
		// TODO Auto-generated method stub
		return conductorRepository.get(id);
	}

	@Override
	public List<Conductor> getAll() {
		// TODO Auto-generated method stub
		return conductorRepository.all();
	}

	@Override
	public Conductor update(Conductor t) {
		// TODO Auto-generated method stub
		int i =conductorRepository.update(t);
		if(i==1) {
			System.out.println(t.getId_empleado()+t.getNombre()+"");
			return conductorRepository.get(t.getId_empleado());
		
		}
		return null;
		
	}
	

	@Override
	public void delete(String id) {
	
		conductorRepository.changeState(id);
	
	}

	
	
	
}
