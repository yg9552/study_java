package com.mycompany.study.ch10.second;

public class ProductExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product <String, Integer> product = new Product<>();
		
		product.setKind("BMW");
		product.setModel(5);
		
		System.out.println(product.getKind() + " M" +product.getModel());
		
		Product<Tv, String> product2 = new Product<>();
		
		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("LG OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(product2.getKind() + " : " + rtString);
		System.out.println(rtTv + " : " + rtString);
		
		Product<Car, String> product3 = new Product<>();
		product3.setKind(new Car());
		product3.setModel("GV60");
		
		Car rtCar = product3.getKind();
		String rtString2 = product3.getModel();
		
		System.out.println(rtCar + " : " + rtString2);

	}

}
