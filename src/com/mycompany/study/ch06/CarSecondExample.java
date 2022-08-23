package com.mycompany.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

//		CarSecond carsecond = new CarSecond();
//		System.out.println("cc : " + carsecond.cc);
//		System.out.println("color : " + carsecond.color);
//		System.out.println("타이어 사이즈 : " + carsecond.tire + "인치");
//		
//		
//		CarSecond carsecond2 = new CarSecond("white");
//		System.out.println("color : " + carsecond2.color);
//		
//		
//		CarSecond carsecond3 = new CarSecond(2000);
//		System.out.println("cc : " + carsecond3.cc);
//		
//		CarSecond carsecond4 = new CarSecond("G80");
//		System.out.println("name : " + carsecond4.name);
//		
//		CarSecond carsecond5 = new CarSecond(21);
//		System.out.println("타이어 사이즈 : " + carsecond5.tire + "인치");

		CarSecond carSecond = new CarSecond();
		System.out.println("모델명 : " + carSecond.name);
		
		CarSecond carSecond1 = new CarSecond("그랜저",3000,"White");
		System.out.println("모델명 : " + carSecond1.name + " | CC : " + carSecond1.cc + " | 색상 : " + carSecond1.color);
	
		CarSecond carSecond2 = new CarSecond("쏘나타", 1600);
		System.out.println("모델명 : " + carSecond2.name + " | CC : " + carSecond2.cc);

		CarSecond carSecond3 = new CarSecond("캐스퍼");
		System.out.println("모델명 : " + carSecond3.name);
		
	}

}
