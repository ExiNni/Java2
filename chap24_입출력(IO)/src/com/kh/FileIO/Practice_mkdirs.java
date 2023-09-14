package com.kh.FileIO;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
		pm.practice1();
		pm.Practice2();
		pm.Practice3();

	}

	public void practice1() {
		// 폴더 연속으로 2개 만들기
		// 폴더 연속으로 3개 만들기
		// 폴더 연속으로 5개 만들기
		String dirPath = "C:\\Users\\user1\\Desktop\\new\\new1";

		File dir = new File(dirPath);
		boolean success = dir.mkdirs();

		if (success) {
			System.out.println("폴더 생성 성공!");
		} else {
			System.out.println("폴더 생성 실패!");
		}
	}
	
	public void Practice2() {
		String dirPath = "C:\\Users\\user1\\Java_Workspace\\chap25";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		if(success) {
			System.out.println("완성!");
		}else {
			System.out.println("실패!!");
		}
	}
	
	public void Practice3() {
		String dirPath = "C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group";
		
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("5개 완성");
		} else {
			System.out.println("실패");
		}
	}

}
