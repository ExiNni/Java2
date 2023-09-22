import java.util.Arrays;

public class practice5 {
	public static void main(String[] args) {
		long answer = 119372;
		long answer2;
		String s = Long.toString(answer);
		String[] arr = s.split("");
		
		for(int i = arr.length -1; i >= 0; i--) {
			String answer1 = arr[i];
			answer1.replace(",", "");
			answer2 = Long.parseLong(answer1);  
			System.out.print(answer2);

		}
	
		
	}

}
