package com.sgv.demo.repositories;

import java.util.List;

import com.sgv.demo.model.Vehiculo_estado;


public interface EstadoVehiculoRepository{
	
	public List<Vehiculo_estado> findAllVehiculoEstado();
}
