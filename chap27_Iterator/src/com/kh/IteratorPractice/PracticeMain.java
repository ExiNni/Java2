package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<>();
		name.add("홍길동");
		name.add("강감찬");
		name.add("이순신");
		name.add("홍범도");
		
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
			String nm = itr.next();
			System.out.println(nm);
		}
		System.out.println();

		itr = name.iterator();
		while(itr.hasNext()) {
			String nm = itr.next();
			if(nm.equals("홍길동")) {
				itr.remove();
			}
			
			System.out.println(nm);
		}
		
		System.out.println();
		System.out.println("제거 후:");
		for(String a : name) {
			System.out.println(a);
		}
	}

}
