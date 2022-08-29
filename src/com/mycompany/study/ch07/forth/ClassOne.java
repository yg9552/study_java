package com.mycompany.study.ch07.forth;


public class ClassOne {

	

	int[] Array = new int[3];
	public int sum = 0;
	
	public void SortByAsc(int Array[]) {
		for (int i = 0; i<Array.length; i++) {
			for(int j = 0; j<Array.length; j++) {
				if (Array[i]<Array[j]) {
					int temp = Array[i];
					Array[i] = Array[j];
					Array[j] = temp;
				}
			}
		}
	}

	public int getSum(int Array[]) {
		sum = Array[0] * Array[1] + Array[2];
		return sum;
	}
	
	public void arr(int Array[]) {
		for (int i = 0; i <Array.length; i++) {
			System.out.println(Array[i]+" ");
		}
		System.out.println(" ");
	}
	
}
