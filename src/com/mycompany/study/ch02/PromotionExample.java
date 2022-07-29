package com.mycompany.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		작은 형이 큰 형으로 변환하는건 문제없다
//		큰 형이 작은 형으로 변환되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이난다.
//		byte < short < int < long < float <double
		
		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue);
		
		int intValue = 10;
		System.out.println("intValue: " + intValue);
	}

}
