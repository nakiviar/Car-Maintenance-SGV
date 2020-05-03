package com.sgv.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgv.demo.model.Vehiculo;
import com.sgv.demo.repositories.VehiculoRepository;
import com.sgv.demo.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{


	@Autowired
	private VehiculoRepository vehiculoRepository;
	
	
	
	@Override
	public String create(Vehiculo t) {
		vehiculoRepository.save(t);
		return "Vehiculo Creado";
	}

	@Override
	public Vehiculo get(String id) {
		// TODO Auto-generated method stub
		return vehiculoRepository.get(id);
	}

	@Override
	public List<Vehiculo> getAll() {
		// TODO Auto-generated method stub
		return vehiculoRepository.all();
	}

	@Override
	public Vehiculo update(Vehiculo t) {
		// TODO Auto-generated method stub
		int i =vehiculoRepository.update(t);
		if(i==1) {
			System.out.println(t.getMatricula()+t.getMarca_vehiculo());
			return vehiculoRepository.get(t.getMatricula());
		
		}
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		vehiculoRepository.changeState(id);
	}

}
