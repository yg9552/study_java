package com.mycompany.study.ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		System.out.println(arr1.length);
		int[] arr2;
		arr2 = new int[5];
		System.out.println(arr2.length);
		
		arr1[0] = 77;
		System.out.println("arr1[0] : "+arr1[0]);
		arr1[1] = 88;
		System.out.println("arr1[1] : "+arr1[1]);
		arr1[2] = 99;
		System.out.println("arr1[2] : "+arr1[2]);
		
		
	}

}
