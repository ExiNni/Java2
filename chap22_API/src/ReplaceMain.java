
public class ReplaceMain {

	public static void main(String[] args) {

		ReplaceMain r1 = new ReplaceMain();
		r1.replace1();
		r1.replace2();
		r1.replace3();
		r1.replace4();
		r1.replace5();
		r1.replaceAll();

	}

	public void replace1() {
		String input = "Hello, World";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : " + input2);
	}

	public void replace2() {
		String input = "Hello World";
		String reInput = input.replace("World", "JAVA");
		System.out.println(reInput);
	}

	public void replace3() {
		String originName = "Hello world";
		// o로 적혀있는 문자열들 x로 치환하기
		String reInput = originName.replace("o", "x");
		System.out.println(reInput);
	}

	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reInput = originString.replace("fox", "cat");
		System.out.println(reInput);

	}

	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		String reInput = originString.replace(" ", "");
		System.out.println(reInput);

	}

	public void replaceAll() {
		String originString = "Hello World";
		String replaceAll = originString.replaceAll("(?i)world", "Java");
		System.out.println(replaceAll);
	}
}
