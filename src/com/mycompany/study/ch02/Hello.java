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
		System.out.println("무이자할부 최대" + installment + "개월");
		System.out.println("배송비 " + deliverycost + "원");
		System.out.println("배송정보 " + deliveryinfo);
		System.out.println("원산지 " + orgin);
		
		String nm = "송강호";
		String id = "yg4583";
		String pw = "비밀번호";
		String email = "exemail@example.net";
		String gender = "남성";
		int age = 53;
		
		System.out.println("이름 " + nm);
		System.out.println("아이디 " + id);
		System.out.println("이메일 " + email);
		System.out.println("성별 " + gender);
		System.out.println("나이 " + age);
		
		
		
	}

}
