package com.mycompany.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

		CarSecond carsecond = new CarSecond();
		System.out.println("cc : " + carsecond.cc);
		System.out.println("color : " + carsecond.color);
		System.out.println("타이어 사이즈 : " + carsecond.tire + "인치");
		
		
		CarSecond carsecond2 = new CarSecond("white");
		System.out.println("color : " + carsecond2.color);
		
		
		CarSecond carsecond3 = new CarSecond(2000);
		System.out.println("cc : " + carsecond3.cc);
		
		CarSecond carsecond4 = new CarSecond("G80");
		System.out.println("name : " + carsecond4.name);
		
		CarSecond carsecond5 = new CarSecond(21);
		System.out.println("타이어 사이즈 : " + carsecond5.tire + "인치");
	}

}
