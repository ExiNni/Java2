package com.kh.instance.tv;

public class TvMain {
	public static void main(String[] args) {
		Tv  tv; // Tv인스턴스를 참조하기 위해서 변수 tv 선언
		tv = new Tv(); // Tv인스턴스를 생성 객체의 주소를 참조변수에 저장한다
		// Tv tv1 = new Tv();
		
		tv.power();
		tv.channel = 7; // Tv 인스턴스의 멤버변수 channel 의 값을 7로 설정
		tv.channelDown(); // Tv 인스턴스의 메서드 channelDown 호출
		System.out.println("Channel : " + tv.channel);
	}

}
