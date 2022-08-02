package com.mycompany.study.ch02;

public class OperraionsPromotionExample {

	public static void main(String[] args) {

		byte byteValue = 12;
		byte byteValue2 = 12;
//		byte byteValue3 = byteValue + byteValue2;
		int intValue = byteValue + byteValue2;
		System.out.println(intValue);
		
		short shortValue = 24;
		short shortValue2 = 24;
//		short shortValue3 = shortValue + shortValue2;
		int shortValue3 = shortValue + shortValue2;
		System.out.println(shortValue3);
		
		int intValue1 = 48;
		int intValue2 = 48;
		int intValue3 = intValue1 + intValue2;
		System.out.println(intValue3);
		
		long longValue = 96;
		long longValue2 = 96;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 192;
		float floatValue2 = 192;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 384;
		double doubleValue2 = 384;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
//		byte byteValue4 = intValue + byteValue;
		int intValue4 = intValue + byteValue;
		System.out.println(intValue4);
		
//		int intValue5 = intValue + doubleValue;
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
		
	}

}
