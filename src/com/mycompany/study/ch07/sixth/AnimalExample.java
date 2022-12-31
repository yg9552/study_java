package com.mycompany.study.ch07.sixth;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icelandic i1 = new Icelandic();
        Icelandic i2 = new Icelandic();
       Icelandic i3 = new Icelandic();
       i3 = i1; i1 = i2; i2 = null; i3 = i1;
       
       StringBuilder sb1 = new StringBuilder("123");
 	  String s1 = "123";
 	  // insert code here
 	 sb1.append("abc"); s1 = s1.concat("abc");
 	  System.out.println(sb1 + " " + s1);
       
       
	}
	
}
