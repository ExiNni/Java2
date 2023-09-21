package chap36_finalSample;

import java.util.Scanner;

public class JavaSample1 {
	
	public static void main(String[] args) {
		JavaSample1 run = new JavaSample1();
		run.inputText();
	}
	
	public void inputText() {
		
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) {
			System.out.println("문자열을 입력해주세요:");
			String str = sc.nextLine();
			
			if(str == "out") {
				break;
			} else {
				System.out.println(str.length());
				
			}
		}
		System.out.println("program finish");
	}
}
