package com.springmvntest.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WashingMachine {
	@JsonIgnore
	int id;

	@JsonIgnore
	int cloth;

	@JsonIgnore
	String state;

	@JsonProperty("washingmachinename")
	String name;

	@JsonProperty("washingmachineregister")
	String registerId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCloth() {
		return cloth;
	}

	public void setCloth(int cloth) {
		this.cloth = cloth;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterId() {
		return registerId;
	}

	public void setRegisterId(String registerId) {
		this.registerId = registerId;
	}

	@Override
	public String toString() {
		return "WashingMachine [id=" + id + ", cloth=" + cloth + ", state=" + state + ", name=" + name + ", registerId="
				+ registerId + "]";
	}

	

}
