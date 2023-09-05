package com.kh.example.pracitce1.model.vo;

public class Product {

	String pName;
	int price;
	String brand;
	
	public Product(String pName, int price, String brand) {
		this.brand = brand;
		this.pName = pName;
		this.price = price;
	}
	public void information() {
		System.out.println("상품 이름: " + pName);
		System.out.println("상품 가격: " + price + "원");
		System.out.println("상품 브랜드: " + brand);
	}
}
