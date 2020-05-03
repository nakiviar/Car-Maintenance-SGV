package com.sgv.demo.controller.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgv.demo.model.Conductor;
import com.sgv.demo.model.Licencia;
import com.sgv.demo.services.ConductorService;

@RestController
@RequestMapping("/conductores")
public class ConductorControllerRest {

	@Autowired
	private ConductorService conductorService;

	// LISTA LOS TIPOS DE LICENCIAS
	@RequestMapping(value = "licencias", method = RequestMethod.GET)
	public List<Licencia> getAllUsers() {
		return conductorService.getAllLicencias();
	}

	// LISTADO DE CONDUCTORES - GET
	@GetMapping
	public List<Conductor> getAllConductores() {
		return conductorService.getAll();
	}

	// REGISTRO DE CONDUCTOR - POST
	// @ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public ResponseEntity<Map<String, String>> crear(@RequestBody Conductor conductor) {
		String resultado = null;
		resultado = conductorService.create(conductor);
		Map<String, String> map = new HashMap<String, String>();
		map.put("resultado", resultado);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Conductor", "OK");
		return new ResponseEntity<Map<String, String>>(map, headers, HttpStatus.CREATED);
	}

	// CONDUCTORES POR ID - GET
	@GetMapping("/buscar/{conductorId}")
	public Conductor getConductor(@PathVariable String conductorId) {
		Conductor conductor = conductorService.get(conductorId);
		return conductor;
	}

	// ACTUALIZARn
	@PutMapping("/actualizar")
	public String updateConductor(@RequestBody Conductor con) {
		Conductor nuevo = conductorService.update(con);
		return "se actualizo : " + nuevo.toString();

	}

	// CAMBIAR ESTADO A INACTIVO
	@DeleteMapping("/eliminar/{conductorId}")
	public String deleteCliente(@PathVariable String conductorId) {
		conductorService.delete(conductorId);
		return "CLIENTE INACTIVO";
	}

}
