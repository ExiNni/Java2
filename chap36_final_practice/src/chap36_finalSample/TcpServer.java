package chap36_finalSample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	int port = 3333;
	static ServerSocket server;

	public void ServerSocket() {

		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				
				Socket client = server.accept();
				System.out.println("Connect Client");
				System.out.println(client.getInetAddress());
				 BufferedReader in = new BufferedReader(
			                new InputStreamReader(client.getInputStream()));

				client.close();
				System.out.println("Server " + client.getInetAddress().getHostAddress());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		TcpServer run = new TcpServer();
		run.ServerSocket();

	}

}