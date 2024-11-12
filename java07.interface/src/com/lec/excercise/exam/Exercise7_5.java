package com.lec.excercise.exam;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}


class Tv extends Product {

	
	Tv(int price) {
		super(price);
	}

	public String toString() {  // toString 메소드 재정의
		return "Tv";
	}
	
}

/////////////실행문/////////////////
class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv(1000);
		System.out.println("가격 = " + t.price + ", " + "보너스 = " + t.bonusPoint);
	}
}