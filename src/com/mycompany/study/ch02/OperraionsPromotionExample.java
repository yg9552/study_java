package com.mycompany.study.ch02;

public class OperraionsPromotionExample {

	public static void main(String[] args) {

		byte byteValue = 12;
		byte byteValue2 = 12;
//		byte byteValue3 = byteValue + byteValue2;
		int intValue = byteValue + byteValue2;
		System.out.println(intValue);
		
		short shortValue = 384;
		short shortValue2 = 384;
//		short shortValue3 = shortValue + shortValue2;
		int shortValue3 = shortValue + shortValue2;
		System.out.println(shortValue3);
		
		int intValue1 = 24;
		int intValue2 = 24;
		int intValue3 = intValue1 + intValue2;
		System.out.println(intValue3);
		
		long longValue = 48;
		long longValue2 = 48;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 96;
		float floatValue2 = 96;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 192;
		double doubleValue2 = 192;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
//		byte byteValue4 = intValue + byteValue;
		int byteValue4 = intValue + byteValue;
		
		int intValue4 = intValue + byteValue;
		
		System.out.println(byteValue4);
		System.out.println(intValue4);
		
	}

}
