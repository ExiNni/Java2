package com.kh.tcpMain;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) throws Exception {
			Socket socket = new Socket("Local Host", 6789);
			System.out.println("[ Server Connect ]");
			
			// 보낼 때 코드
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);
			printStream.print("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII SEERRRRRRRRRVVVVVVVVVEEEEEEERRRRRRR");
			printStream.flush();
			
			// 서버로 부터 읽어옴
			InputStream InStream = socket.getInputStream();
			Scanner sc = new Scanner(InStream);
			System.out.println("[Client] server : " + sc.nextLine());
			
			socket.close();
			System.out.println("Bye Server");
			
	}
}
