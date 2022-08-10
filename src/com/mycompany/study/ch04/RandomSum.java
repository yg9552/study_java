package com.mycompany.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

//		1~100사이의 랜덤 정수 2개를 발생시켜
//		두 수 사이의 합을 구하라
		
		double min = 1;
		double max = 100;
		int random = (int) (Math.random() * (max + min) + min);
		System.out.println(random);
		
		
		
		
//		로또 번호 추출기
//		double min = 1.0;
//		double max = 45.0;
//		
//		for (int i = 1; i <= 6; i++) {
//			int random = (int) (Math.random() * (max + min) + min);
//			System.out.println(i + " = " + random);
//		}
		
	}

}
