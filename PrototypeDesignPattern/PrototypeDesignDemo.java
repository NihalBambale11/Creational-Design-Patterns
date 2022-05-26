package PrototypeDesignPattern;

import java.util.List;



public class PrototypeDesignDemo {

	public static void main(String[] args) {
		Vehicle a  = new Vehicle();
		a.insertData();
		
		Vehicle b = (Vehicle)a.clone();
		List<String> list =b.getVehicle();
		list.add("Toyota Innova");
		
		System.out.println(a.getVehicle());
		System.out.println(b.getVehicle());
		
		b.getVehicle().remove("Maruti Omni");
		System.out.println(a.getVehicle());
		System.out.println(b.getVehicle());
	}

}
