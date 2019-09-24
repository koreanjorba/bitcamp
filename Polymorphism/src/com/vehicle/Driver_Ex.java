package com.vehicle;

public class Driver_Ex {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Vehicle ve = new Vehicle();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(ve);
	}
}
