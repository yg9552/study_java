package com.mycompany.study.ch07.forth;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.sound();
		dog.sound();
		System.out.println("-------");
		cat.sound("aaa");
		cat.breathe();
		dog.breathe();

	}

}
