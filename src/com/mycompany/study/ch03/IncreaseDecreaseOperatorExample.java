package com.mycompany.study.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {

//		++/-- 피연산자 : 다른 연산 수행 전에 피연산자 1증가/감소
//		피연산자 ++/-- : 다른 연산 수행 후에 피연산자 1증가/감소
		
//		int i = 0;
//		++i;
//		i++;
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println(a);
		System.out.println(b);
		
		int k = i++;
		System.out.println(k);
		System.out.println(i);
		
		int m = ++j;
		System.out.println(m);
		System.out.println(j);
		
		int z = ++i + j++;
		System.out.println(z);
	}

}
