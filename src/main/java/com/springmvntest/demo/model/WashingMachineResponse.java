package com.springmvntest.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WashingMachineResponse {
	
	@JsonProperty("id")
	public int washingMachineId;
	
	@JsonProperty("error message")
	public String errorMessage;
	
	
	
	public WashingMachineResponse() {
		super();
	}

	public WashingMachineResponse(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public WashingMachineResponse(int washingMachineId) {
		super();
		this.washingMachineId = washingMachineId;
	}

	public int getWashingMachineId() {
		return washingMachineId;
	}

	public void setWashingMachineId(int washingMachineId) {
		this.washingMachineId = washingMachineId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	

}
