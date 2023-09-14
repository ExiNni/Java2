package com.kh.FileIO;

import java.io.File;

public class File_Rename_Main {
	public static void main(String[] args) {
		String mainPath = "C:\\Users\\user1\\Desktop\\cute.png";
		String originFile = mainPath + "cute.png";
		String newFile = "C:\\Users\\user1\\Desktop\\cute2222222.png";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		
		// 파일 이름 변경하기
		// 만약에 파일이 있다면!
		if(currentFile.renameTo(renameFile)) {
			System.out.println("파일 이름 변경 성-공");
			
		}else {
			System.out.println("파일 이름 변경 대실패");
		}
	}

}
