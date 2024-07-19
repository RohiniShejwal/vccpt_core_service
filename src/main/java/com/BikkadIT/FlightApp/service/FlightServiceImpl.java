package com.BikkadIT.FlightApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.FlightApp.model.Flight;
import com.BikkadIT.FlightApp.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightServiceI {

	@Autowired
	private FlightRepository flightRepository;

	@Override
	public Flight SaveData(Flight flt) {
		Flight save = flightRepository.save(flt);
		return save;
	}


	@Override
	public List<Flight> Getalldata() {
		List<Flight> findAll = flightRepository.findAll();
		return findAll;
	}



	}
