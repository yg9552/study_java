package com.mycompany.study.ch06;

public class Arithmetic {
	
	public int sum (int a, int b) {
		return a + b ;
	}
	public int minus (int a, int b) {
		return a - b;
	}
	public int multiplication (int a, int b) {
		return a * b;
	}
	public int division(int a, int b) {
		return a / b;
	}
	public int divid(int a, int b) {
		return a % b;
	}
	public double d (double a, double b) {
		return a / b;
	}
	
	public void name(double result) {
		System.out.println("값은 " + result + " 입니다");
	}
	
	static void statictest() {
		System.out.println("스테틱테스트!!");
	}
	
}
