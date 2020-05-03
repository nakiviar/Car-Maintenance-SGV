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
import org.springframework.web.bind.annotation.RestController;

import com.sgv.demo.model.Vehiculo;
import com.sgv.demo.services.VehiculoService;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoControllerRest {
	@Autowired    
	private VehiculoService vehiculoService;


	    //LISTADO DE VEHICULOS - GET
	    @GetMapping
	    public List<Vehiculo> getAllVehiculos() {
	        return vehiculoService.getAll();
	    }
	    
	    //REGISTRO DE VEHICULO - POST 
	    @PostMapping
	    public ResponseEntity<Map<String,String>> createVehiculo(@RequestBody Vehiculo veh) {
	    	String resultado= null;
	    	resultado = vehiculoService.create(veh);
	    	Map<String, String> map=new HashMap<String, String>();
	    	map.put("resultado", resultado);
	    	HttpHeaders headers= new HttpHeaders();
	    	headers.add("Vehiculo", "OK");
	    	return new ResponseEntity<Map<String,String>>(map, headers, HttpStatus.CREATED);
	    }
	    
	    //VEHICULOS POR ID - GET
		@GetMapping("/buscar/{vehiculoId}")
		public Vehiculo getVehiculo(@PathVariable String vehiculoId) {
			Vehiculo vehiculo= vehiculoService.get(vehiculoId);
			return vehiculo;
		}


		//ACTUALIZAR
		@PutMapping("/actualizar")
		public String updateVehiculo(@RequestBody Vehiculo veh) {
			//con=conductorService.get(conductorId);
			
			Vehiculo nuevo=vehiculoService.update(veh);
			return "se actualizo : "+nuevo.toString() ;
		
		}
		//CAMBIAR ESTADO A INACTIVO
		@DeleteMapping("/eliminar/{vehiculoId}")
		public String deleteVehiculo(@PathVariable String vehiculoId) {
			vehiculoService.delete(vehiculoId);
			return "AHORA EL VEHICULO ESTA NO DISPONIBLE";
		}
}
