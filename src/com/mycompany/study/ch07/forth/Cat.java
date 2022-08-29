package com.mycompany.study.ch07.forth;

public class Cat extends Animal{

	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void sound(String aaa) {
		// TODO Auto-generated method stub
		System.out.println("야옹" + aaa);
	}
	
}
