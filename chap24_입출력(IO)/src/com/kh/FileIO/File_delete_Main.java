package com.kh.FileIO;

import java.io.File;

public class File_delete_Main {
	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\";
		String originFile = mainPath + "RealCute.jpg";
		
		// 파일 객체 생성
		File fileToDelete = new File(originFile);
		
		// 파일 삭제 
		boolean deleted = fileToDelete.delete();
		if(deleted) {
			System.out.println("파일 삭제 완료");
		} else {
			System.out.println("파일 삭제 실패");
		}
	}
}
