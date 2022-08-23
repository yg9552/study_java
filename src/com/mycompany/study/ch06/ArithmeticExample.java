package com.mycompany.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {

		Arithmetic arithmetic = new Arithmetic();
		
		int result1 = arithmetic.sum(1, 3);
		int result2 = arithmetic.minus(1, 3);
		int result3 = arithmetic.multiplication(16, 32);
		int result4 = arithmetic.division(14, 3);
		int result5 = arithmetic.divid(14, 3);
		double result6 = arithmetic.d(14, 3);
		
		arithmetic.name(result1);
		arithmetic.name(result2);
		arithmetic.name(result3);
		arithmetic.name(result4);
		arithmetic.name(result5);
		arithmetic.name(result6);

		
	}

}
