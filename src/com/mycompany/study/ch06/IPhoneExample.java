package com.mycompany.study.ch06;

public class IPhoneExample {

	public static void main(String[] args) {

		IPhone iphone = new IPhone();
		
		System.out.println("IPhone.name[0] : " + iphone.name[0]);
		System.out.println(iphone.name.length);

		iphone.pr();

		
		Car car = new Car();
		System.out.println("car.name : "+ car.name);
		
	}

}
