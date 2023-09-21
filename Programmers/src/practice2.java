
public class practice2 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 1234;
		String arr = Integer.toString(n);

		for (int i = 0; i < arr.length(); i++) {
			answer += Integer.parseInt(arr.substring(i, i + 1));
		}
		System.out.println(answer);
	}
}
 