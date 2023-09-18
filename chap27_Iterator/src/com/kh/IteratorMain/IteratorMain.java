package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
	Iterator
		�÷���(������ �׷�)�� �ݺ�(iterate)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
		�پ��� �÷��� ����(ArrayList, HashSet��) ��� �� �� ����
		�÷����� ��Ҹ� �а� �����ϴµ� ���
		�÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ���� 
*/
	public static void main(String[] args) {
		// ArrayList ���� �� ��� �߰�
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("����");
		music.add("������");
		music.add("����");

		// Iterator ����
		Iterator<String> iter = music.iterator();
		
		// Iterator�� ����Ͽ� ��� �ݺ�
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}
		
		System.out.println();
		
		// Iterator �� ����Ͽ� ��� ����
		iter = music.iterator(); // �ٽ� iterator�� �ʱ�ȭ
		while(iter.hasNext()) {
			String msc = iter.next();
			// ���࿡ ������ ������ �����ϱ� ����
			if(msc.equals("����")) {
				iter.remove();
			}
			System.out.println(msc);
		}
		System.out.println();
	
		// ���� �Ŀ� ArrayList ���
		System.out.println("���� �� ���");
		for(String a : music) {
			System.out.println(a);
		}
	}

}