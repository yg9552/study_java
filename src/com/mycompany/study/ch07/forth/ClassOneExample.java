package com.mycompany.study.ch07.forth;

public class ClassOneExample {

	public static void main(String[] args) {

		
		ClassOne classOne = new ClassOne();
		ClassSecond classSecond = new ClassSecond();
		
		int[] Array = {50 , 10 ,30 };
		
		classOne.arr(Array);
		classSecond.arr(Array);
		System.out.println(classOne.getSum(Array));
		System.out.println(classSecond.getSum(Array));
		System.out.println(classOne.getSum(Array) - classSecond.getSum(Array));
	}

}
