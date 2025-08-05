package com.shristi.java.OopsExample.override;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.Scanner;

public class Showroom {

	public static void main(String[] args) {
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter the input : ");
//		
//		String choice = input.next().toLowerCase();
//		
//		Vehicle vehicle = null;
//		
//		if(choice.equals("c")) {
//			vehicle = new Car();
//		}else {
//			vehicle = new Bike();
//		}
//		vehicle.getMileage();
		Vehicle vehicle = new Vehicle("A", "B");
		System.out.println(vehicle.type);
		Car car = new Car("BMW", "M2");
		System.out.println(vehicle.type);   //Luxury output since variable reference type is vehicle
		car.showFeatures();
		
//		Vehicle vehicle1 = new Bike("BMW", "S1000RR");
//		Bike bike = (Bike)vehicle1;
//		bike.showFeatures();
		
//		Bike bike = (Bike)vehicle;   //ClassCastException, since bike is pointing to car obj
//		bike.showFeatures();
	}
}