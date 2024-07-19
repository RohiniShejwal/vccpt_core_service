package com.BikkadIT.FlightApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.FlightApp.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
