package com.kh.example.pracitce1.run;

import com.kh.example.pracitce1.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		
		Product myProduct1 = new Product("ÃÊÄÝ·¿", 3000, "·Ôµ¥");
		Product myProduct2 = new Product("¶ó¸é", 5000, "¿À¶Ñ±â");
		Product myProduct3 = new Product("°úÀÚ", 1000, "³ó½É");
		
		myProduct1.information();
		myProduct2.information();
		myProduct3.information();
	
	}

}
