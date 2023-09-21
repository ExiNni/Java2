package com.kh.example.practice2.model.vo;

public class Product {

	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	public void Information() {
		System.out.println("물건의 이름: " + pName);
		System.out.println("물건의 가격: " + price);
		System.out.println("물건의 브랜드: " + brand);
	}
}
