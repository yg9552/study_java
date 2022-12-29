package com.mycompany.study.ch07.fifth;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
		Cat cat = (Cat)animal;
		System.out.println(cat.noise());
	}

}
