package com.sgv.demo.services;

import java.util.List;

import com.sgv.demo.model.Conductor;
import com.sgv.demo.model.Licencia;

public interface ConductorService extends CRUDServices<Conductor, String>
{

	public List<Licencia> getAllLicencias();
	
	
}
