
public class practice1 {
	public static void main(String[] args) {
		boolean answer = true;
		String s = "poooyY";
		int a = 0;
		int b = 0;

		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("p") || arr[i].equals("P")) {
				a += 1;
			} else if (arr[i].equals("y") || arr[i].equals("Y")) {
				b += 1;
			}
		}

		if (a == b) {
			answer = true;
		} else {
			answer = false;
		}
		
		System.out.println(answer);
	}
}
