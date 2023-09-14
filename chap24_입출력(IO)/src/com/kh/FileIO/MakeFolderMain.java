package com.kh.FileIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MakeFolderMain {

	public static void main(String[] args) {

		MakeFolderMain run = new MakeFolderMain();
		run.practice2();

	}

	public void practice1() {
		// 폴더를 생성할 경로 지정
		String folderPath = "C:\\Users\\user1\\Desktop\\image"; // 원하는 경로 설정
		// 폴더 만들기
		// MakeFolderMain run = new MakeFolderMain();

		File folder = new File(folderPath);

		// exists 이미 존재하는지 확인
		if (!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		} else {
			System.out.println("폴더가 이미 존재합니다");
		}
		folder.mkdir();

		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\image.txt");
			w.write("유저의 정보를 담는 곳입니다.");
			w.write("KH 학생");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void practice2() {
		String folderPath = "C:\\Users\\user1\\Desktop\\new_FOLDER1";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("새폴더 완성");
		}else {
			System.out.println("이미 폴더가 있다.");
		}
		try {
			FileWriter w = new FileWriter("C:\\\\Users\\\\user1\\\\Desktop\\\\new_FOLDER1\\new.txt");
			w.write("Testing.\n");
			w.write("Testing2\n");
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
