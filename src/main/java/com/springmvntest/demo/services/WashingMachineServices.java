package com.springmvntest.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.springmvntest.demo.model.WashingMachine;
import com.springmvntest.demo.model.WashingMachineResponse;

@Service
public class WashingMachineServices {
	Map<Integer, WashingMachine> allWashingList = new HashMap<>();

	public WashingMachineResponse addWashingMachine(WashingMachine washingMachine) {
		int id = allWashingList.size() + 1;
		washingMachine.setId(id);
		washingMachine.setState("STOP");
		allWashingList.put(id, washingMachine);
		return new WashingMachineResponse(id);

	}

	public List<WashingMachine> getAllWashingMachine() {
		return new ArrayList<WashingMachine>(allWashingList.values());
	}
	public WashingMachine getWashingMachine(int washingMachineId) throws IllegalAccessException {
		if(allWashingList.containsKey(washingMachineId)) {
			return allWashingList.get(washingMachineId);
		}else {
			throw new IllegalAccessException("Cannot find washing machine");
		}
		
	}

	public String doCalcuation(int washingMachineId, String state) throws IllegalAccessException {
		if (allWashingList.containsKey(washingMachineId)) {
			WashingMachine currentwashingMachine = allWashingList.get(washingMachineId);
			String currentState = currentwashingMachine.getState();
			if (currentState.equalsIgnoreCase("STOP")) {
				if (state.equalsIgnoreCase("START")) {
					currentwashingMachine.setState("START");
				} else {
					throw new IllegalAccessException("Cannot convert to respective state");
				}
			} else if (currentState.equalsIgnoreCase("START")) {
				if (state.equalsIgnoreCase("WASHING")) {
					currentwashingMachine.setState("WASHING");
				} else {
					throw new IllegalAccessException("Cannot convert to respective state");
				}

			} else if(currentState.equalsIgnoreCase("WASHING")) {
				if (state.equalsIgnoreCase("DRYING")) {
					currentwashingMachine.setState("DRYING");
				} else {
					throw new IllegalAccessException("Cannot convert to respective state");
				}
			}
			else if(currentState.equalsIgnoreCase("DRYING ")) {
				if (state.equalsIgnoreCase("STOP")) {
					currentwashingMachine.setState("STOP");
				} else {
					throw new IllegalAccessException("Cannot convert to respective state");
				}
			}else {
				throw new IllegalAccessException("Cannot convert to respective state");
			}

		} else {
			throw new IllegalAccessException("Cannot find washing machine");
		}
		return state;
	}
	

}
