package com.kh.classAM;

public class OtherAM {
	// AM 생성
	public static void main(String[] args) {
		
		AM am = new AM();
		am.publicMethod();
		am.protectMethod();
		am.defaultMethod();
//		am.privateMethod(); 다른 클래스에 존재하기 때문에 출력이 안됨.
	}
	

}
