package com.mycompany.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {

		boolean p = true;
		
		System.out.println(p);
		
//		논리부정연산자 : !
		p = !p;
		System.out.println(p);
		
		p= !p;
		System.out.println(p);
		p= !p;
		System.out.println(p);
		p= !p;
		System.out.println(p);
		
		int j = 3;
		
		if (!(j==3)) {
			System.out.println("3이 아님");
		} else {
				System.out.println("3");
			}
		}
	}


