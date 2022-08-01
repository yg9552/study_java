package com.mycompany.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
	

//		자동타입변환
//		작은 형이 큰 형으로 변환하는건 문제없다
//		큰 형이 작은 형으로 변환되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이난다.
//		byte < short < int < long < float <double
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		
//		int intValue2 = 1234567890;
//		System.out.println("intValue2: " + intValue2);
//		byte byteValue2 = intValue2;
//		System.out.println("byteValue2: "+ byteValue2);
		
		int intValue3 = 200;
		System.out.println("intValue3: " + intValue3);
		
		double doubleValue = intValue3;
		System.out.println("doubleValue:" + doubleValue);
		
		
//		short를 int로 변환
		short shortvalue = 10000;
		int intvalue4 = shortvalue;
		System.out.println(intvalue4);
		
//		int를 long으로 변환
		int intvalue5 = 1000000000;
		long longvalue = intvalue5;
		System.out.println(longvalue);
		
//		long을 float으로 변환
		long longvalue1 = 5000000000000000000L;
		float floatvalue = longvalue1;
		System.out.println(floatvalue);
		
//		float을 double로 변환
		float floatvalue2 = 300000000000000000000000000000000000000F;
		double doublevalue1 = floatvalue2;
		System.out.println(doublevalue1);
	}

}
