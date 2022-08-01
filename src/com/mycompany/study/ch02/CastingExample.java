package com.mycompany.study.ch02;

public class CastingExample {

	public static void main(String[] args) {

//		강제 형변환 Casting (원하는 형) 변수명
		
		double doublevalue = 1234567;
		double doublevalue2 = 1234567891;
		System.out.println(doublevalue);
		System.out.println(doublevalue2); //7자리 이상일때 표현함

//		double -> float
		
//		float floatValue = (float) doublevalue;
//		System.out.println(floatValue);
		float floatValue = (float) doublevalue2;
		System.out.println(floatValue);
		
//		float -> long
		
		float floatValue1 = 1224354356.6123F;
		long longValue = (long) floatValue1;
		System.out.println(longValue);
		
//		long -> short
		long longvalue1 = 124654611;
		short shortvalue = (short) longvalue1;
		System.out.println(shortvalue);
		
//		short -> byte
		short shortvalue1 = 12345;
		byte bytevalue = (byte) shortvalue1;
		System.out.println(bytevalue);
		
//		int -> String
	    int i2 = 30;
	    String str = String.valueOf(i2);
	    System.out.println(str + 1);
	    
//	    String -> int
	    String str2 = "30";
	    int i = Integer.parseInt(str2);
	    System.out.println(i + 1);
	    
	}

}
