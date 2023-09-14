package com.kh.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {
	public static void main(String[] args) {
		PracticeCopy run = new PracticeCopy();
		run.Practice1();
	}

	public void Practice1() {
		String Inputfile = "C:\\Users\\user1\\Desktop\\cute.png";
		String dirPath = "C:\\Users\\user1\\Desktop\\img";
		String Outputfile = "C:\\Users\\user1\\Desktop\\img\\NewCute.jpg";

		File dir = new File(dirPath);
		boolean success = dir.mkdirs();

		if (success) {
			try (FileInputStream fis = new FileInputStream(Inputfile);
					FileOutputStream fos = new FileOutputStream(Outputfile)) {
				byte[] buffer = new byte[1024];
				int byteRead;
				while ((byteRead = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, byteRead);
				}
				System.out.println("파일이 img 폴더에 새롭게 복사되었습니다");

			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("실패!");
		}
	}
	
	public void Practice2() {
		
	}

}