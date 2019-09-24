package com.vehicle;

public class Driver {
//	public void drive(Vehicle vehicle) {
//		vehicle.run();
//	}
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus obj = (Bus)vehicle;
			obj.run();
			System.out.println("Bus 클래스 타입 객체!-------");
		}else if(vehicle instanceof Taxi) {
			Taxi obj = (Taxi)vehicle;
			obj.run();
			System.out.println("Taxi 클래스 타입 객체!------");
		}else {
			vehicle.run();
			System.out.println("Vehicle 타입 객체!-------");
		}
	}
}
