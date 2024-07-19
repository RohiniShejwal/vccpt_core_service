package com.BikkadIT.FlightApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.FlightApp.model.Flight;
import com.BikkadIT.FlightApp.service.FlightServiceI;

@RestController
public class FlightController {

	@Autowired
	private FlightServiceI flightServiceI;
	
	
	// Save Data
	
	@PostMapping(value = "/SaveData", consumes = "application/json")
	public ResponseEntity<Flight> savedata(@RequestBody Flight flt) {
		 Flight saveData = flightServiceI.SaveData(flt);
		return new ResponseEntity<Flight>(saveData, HttpStatus.OK);
	}
	
	//Get Data
	
	@GetMapping(value = "/getAllData", produces = "application/json")
	public ResponseEntity <List<Flight>> getalldata(){
		List<Flight> getalldata = flightServiceI.Getalldata();
		return new ResponseEntity <List<Flight>>(getalldata, HttpStatus.OK);
		
		
	}
}
