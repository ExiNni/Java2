package com.kh.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("abcde.txt"); // 생성
			writer.write("아니야ㅋㅋ 재미 있어"); // 파일 안에 내용을 다쓰면 닫기
			writer.close();

			FileReader reader = new FileReader("abcde.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			
			bufferedReader.close(); // 파일을 다 읽으면 닫아주기.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
