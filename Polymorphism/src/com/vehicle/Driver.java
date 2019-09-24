package com.vehicle;

public class Driver {
//	public void drive(Vehicle vehicle) {
//		vehicle.run();
//	}
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus obj = (Bus)vehicle;
			obj.run();
			System.out.println("Bus Ŭ���� Ÿ�� ��ü!-------");
		}else if(vehicle instanceof Taxi) {
			Taxi obj = (Taxi)vehicle;
			obj.run();
			System.out.println("Taxi Ŭ���� Ÿ�� ��ü!------");
		}else {
			vehicle.run();
			System.out.println("Vehicle Ÿ�� ��ü!-------");
		}
	}
}
