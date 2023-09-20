package com.kh.tcpMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

	public static void main(String[] args) {
		try {
			// 서버 주소와 포트번호는 동일해야함
			Socket socket = new Socket("Local Host", 8080);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// 서버 되는지 테스트 메세지
			out.println("Hi server?");
			
			// 서버로 부터 메세지 전달되는지 확인 테스트
			String response = in.readLine();
			System.out.println("서버 응답: " + response);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
