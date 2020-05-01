package com.sgv.demo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgv.demo.model.Licencia;
import com.sgv.demo.services.impl.ConductorServiceImpl;

@RestController
@RequestMapping("/conductores")
public class ConductorControllerRest {

	@Autowired    
	private ConductorServiceImpl conductorService;


	    @RequestMapping(value="", method=RequestMethod.GET)
	    public List<Licencia> getAllUsers() {
	        return conductorService.getAllLicencias();
	    }
}
