package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM{

	public void am () {
		// A 생성자를 classBM 에서 만들고 싶어!
		AM am = new AM();
		
		publicMethod();
		protectMethod();
		// main 메서드에서 직접 호출을 하거나 뭔가를 통해 호출
		// 접근 제어자를 가지고 있어서 같은 패키지 내에서 호출
		// extends 사용해서 호출을 한다
//		defaultMethod(); 같은 패키지 안에서 사용이 가능함 - 다른 패키지 이므로 사용이 안됨
	}
}
