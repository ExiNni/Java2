package com.kh.api.exam1;
/*
	StringBuffer
	���ڿ��� ȿ�������� �ٷ�� ���� Ŭ����
	�ٱͰų� �ٲ� �� �ִ� ���ڿ��� ��Ÿ����, ���ڿ��� �����̳� ������ �ʿ��� ��� ���
	
*/
public class StringBufferMain {

	public static void main(String[] args) {
		// �� StringBuffer ��ü ����
		StringBuffer sb = new StringBuffer();
		
		sb.append("Hello, ");
		sb.append("JAVA ");
		sb.append("StringBuffer!");
		System.out.println(sb.toString());
		
		// ���ڿ� ����
		sb.insert(6, "Eclipse");
		System.out.println(sb.toString());
		sb.replace(13, 17, "WOW");
		System.out.println(sb.toString());
		
		// ���ڿ� ����
		sb.delete(13, 20);
		System.out.println(sb.toString());
		
		// ���ڿ� ������
		sb.reverse();
		System.out.println(sb.toString());
	}

}