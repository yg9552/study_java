package com.mycompany.study.ch02;

public class Hello {

	public static void main(String[] args) {

//		데이터타입	변수명 = 초기값;
//		데이터타입 변수명
		
		boolean a = false;
		boolean x;
		x = false;
		
		int width = 100;
		String name= "양진용";
		
		
		String prodnm = "반팔티셔츠";
		int price = 50000;
		int reserve = 500;
		int deliverycost = 3000;
		String deliveryinfo = "해외배송";
		String orgin = "베트남";
		int installment = 10;
		
		System.out.println("이름 : " + name);

		System.out.println(prodnm);
		System.out.println("가격 "+ price + "원");
		System.out.println("적립금 "+ reserve + "원");
		System.out.println("무이자할부 최대" + installment);
		System.out.println("배송비 " + deliverycost);
		System.out.println("배송정보 " + deliveryinfo);
		System.out.println("원산지 " + orgin);
		
	}

}
