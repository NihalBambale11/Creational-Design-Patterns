package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {
	private List<String> vehicleList;
	
	public Vehicle() {
		this.vehicleList = new ArrayList<String>();
	}
	
	public Vehicle(List<String> list) {
		this.vehicleList=list;
	}
	
	public void insertData() {
		vehicleList.add("Maruti Omni");
		vehicleList.add("Tata Sumo");
		vehicleList.add("Renault Duster");
		vehicleList.add("Honda City");
		vehicleList.add("Jeep Compass");

	}
	
	public List<String> getVehicle(){
		return this.vehicleList;
	}
	
	public Object clone() {
		List<String> tempList = new ArrayList<String>();
		for(String s : this.getVehicle()) {
			 tempList.add(s);
		}
		Vehicle b = new Vehicle(tempList);
		return b;
	}
}
