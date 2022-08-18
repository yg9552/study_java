package com.mycompany.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		
		Week abc;
		Week xyz;
		abc = Week.Sunday;
		xyz = Week.Tuesday;

		System.out.println(abc);
		System.out.println(xyz);
		
		String name1 = abc.name();				//.name() -> String 으로 casting
		System.out.println("name1 : " + name1);
		
		int ordinal1 = abc.ordinal();		//ordinal() -> 몇번째에 있는지? 숫자로 표현
		System.out.println(ordinal1);
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		System.out.println(result1);
		System.out.println(result2);
		
		Week[] days = Week.values();		// .values() -> 자동으로 열거해줌
		
		int index = 0;
		for (Week day: days) {
			System.out.println(index+ " : " +day);
			index++;
		}
		
	}

}
