package com.mycompany.study.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car abc = new Car();
		
		
		System.out.println("abc.name : " + abc.name);
		System.out.println("abc.name2[0] : " + abc.name2[0]);
		System.out.println("abc.name2[1] : " + abc.name2[1]);
		
		
		HyundaiCar hyundaicar = new HyundaiCar();
		
		for(int i = 0; i < hyundaicar.name.length; i++) {
			
			System.out.println(hyundaicar.name[i]);
		}
		
	}

}
