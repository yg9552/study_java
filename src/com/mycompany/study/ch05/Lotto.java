package com.mycompany.study.ch05;

public class Lotto {

	public static void main(String[] args) {

//		로또 번호 생성기
//		현재까지 나온 번호 중복 안되게
//		중복숫자제거
//		3연속번호불가
//		보너스번호는 제외
	
		String lottostring = "";
		
		int []lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * 45) + 1;
			lotto[i] = num;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			for(int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					int max = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = max;
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "/");
		}
		
	}

}
