package com.springmvntest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmvntest.demo.model.WashingMachine;
import com.springmvntest.demo.services.WashingMachineServices;

@RestController
public class WashMachineController {
	
	@Autowired
	WashingMachineServices wsServices;

	@GetMapping(value = "api/washing-machines")
	public ResponseEntity<Object> getAllListWashingMachine() {
		
		return new ResponseEntity<Object>(wsServices.getAllWashingMachine(), HttpStatus.ACCEPTED);
	}

	@GetMapping(value = "api/washing-machines/{washingMachineId}")
	public ResponseEntity<Object> getWachingMachine(@PathVariable  int washingMachineId) {
		System.out.println(washingMachineId);
		return new ResponseEntity<Object>(washingMachineId, HttpStatus.ACCEPTED);
	}

	@PostMapping(value = "api/washing-machines")
	public ResponseEntity<Object> saveWashingMachine(@RequestBody WashingMachine washingMachine) {
		System.out.println("inside save washineMachine controller");
		
		return new ResponseEntity<Object>(wsServices.addWashingMachine(washingMachine), HttpStatus.ACCEPTED);
	}
	
	@PutMapping(value = "api/washing-machines/{washingMachineId}/{status}")
	public ResponseEntity<Object> washMachineStatus( @PathVariable int washingMachineId, @PathVariable String status){
		System.out.println(washingMachineId+ " "+ status);
		return new ResponseEntity<Object>(washingMachineId+" "+status, HttpStatus.ACCEPTED);
	}

}
