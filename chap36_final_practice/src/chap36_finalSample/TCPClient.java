package chap36_finalSample;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {

	public static void main(String[] args) {
		int port = 3333;
		String serverIP;

		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();
			Socket socket = new Socket(serverIP, port);
			OutputStream outStream = socket.getOutputStream();
			PrintStream printStream = new PrintStream(outStream);

			InputStream InStream = socket.getInputStream();
			Scanner sc = new Scanner(InStream);
			System.out.println("[Client] server : " + sc.nextLine());

			socket.close();
			System.out.println("Bye Server");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
