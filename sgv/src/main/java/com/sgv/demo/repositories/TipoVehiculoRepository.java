package com.sgv.demo.repositories;

import java.util.List;

import com.sgv.demo.model.Vehiculo_tipo;

public interface TipoVehiculoRepository {
	
	List<Vehiculo_tipo> findallTiposVehiculos();
}
