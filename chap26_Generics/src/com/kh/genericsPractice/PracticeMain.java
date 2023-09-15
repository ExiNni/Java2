package com.kh.genericsPractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain run = new PracticeMain();
		// run.practice1();
		run.practice2();
	}
/*
	public void practice1() {

		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);

		ArrayList<String> strList = new ArrayList<>();
		strList.add("���");
		strList.add("��");
		strList.add("����");

		printList(intList);
		printList(strList);

	}
	

	public static <T> void printList(ArrayList<T> a) {
		for (T item : a) {
			System.out.println(item);
		}
	}
	*/
	public void practice2() {
		// Box ��ü�� com.kh.genericspractice; �ؿ� ����
		// ������ �����͸� �����ϴ� box �ν��Ͻ� ����
		// ���ڿ� �����͸� �����ϴ� box �ν��Ͻ� ����
		// �� �� ���
		// ���� for�� �̿��ؼ� �� ��� ���

		Box<Integer> intBox = new Box<>();
		intBox.put(1);
		intBox.put(2);
		intBox.put(3);

		int intValue = intBox.get();

		Box<String> strBox = new Box<>();
		strBox.put("����ڽ�");
		strBox.put("��ڽ�");
		strBox.put("�����ڽ�");

		String stringValue = strBox.get();
		
		printList(intValue);
		printList(stringValue);

		System.out.print("Int value: " + intValue);
		System.out.print("String value : " + stringValue);

	}
	
	public static <T> void printList(generics<T> a) {
		for (T item : a) {
			System.out.println(item);
		}

	
	}
	}