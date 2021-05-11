package com.springmvntest.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springmvntest.demo.model.WashingMachine;

@Service
public class WashingMachineServices {
	Map<Integer, WashingMachine> allWashingList = new HashMap<>();

	public int addWashingMachine(WashingMachine washingMachine) {
		int id = allWashingList.size() + 1;
		washingMachine.setId(id);

		allWashingList.put(id, washingMachine);
		return id;

	}
	
	
	public List<WashingMachine> getAllWashingMachine(){
		return new ArrayList<WashingMachine>(allWashingList.values());
	}

}
