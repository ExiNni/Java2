package com.kh.api.exam1;
/*
	StringBuidler
		문자열을 효율적으로 조작할 수 있게 해주는 클래스
		문자열을 변경할 떄마다 새로운 문자열 객체를 생성하는 것이 아니라
		기존 문자열을 수정하는 방식으로 동작 메모리 사용을 효율적이게 함
*/
public class StringBuilderMain {
	public static void main(String[] args) {
		StringBuilder strBuilder = new StringBuilder();
		
		// append 메서드를 사용하여 문자열 추가
		strBuilder.append("Hello, ");
		strBuilder.append("World");
		
		String result = strBuilder.toString();
		System.out.println(result);
		
		// 문자열 삽입
		strBuilder.insert(7, "JAVA ");
		System.out.println(strBuilder.toString());
		
		// 문자열 삭제
		strBuilder.delete(7, 12);
		System.out.println(strBuilder.toString());
		
		// 문자열 대체
		strBuilder.replace(7, 12, "JAVA 최고다!");
		System.out.println(strBuilder.toString());
		
		// 문자열 역순으로 만들기
		strBuilder.reverse();
		System.out.println(strBuilder.toString());
	}

}
