package com.BikkadIT.FlightApp.service;

import java.util.List;

import com.BikkadIT.FlightApp.model.Flight;


public interface FlightServiceI {

	public Flight SaveData(Flight flt);
	
	public List<Flight> Getalldata();
}
