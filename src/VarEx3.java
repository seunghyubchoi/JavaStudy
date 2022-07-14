
public class VarEx3 {

	public static void main(String[] args) {
		final int score; // = 100;
		score = 200;

		boolean power = true;

		byte b = 127; // -128~127

		float f = 3.14f; // float에는 항상 f를 뒤에 붙여줘야
		double d = 3.14;

		long I = 10_000_000_000L; // integer 최댓값 20억

		int oct = 010; // 8진수, 10수로 8
		int hex = 0x10; // 16진수ㅡ 10진수로 16
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f); // 10.0
		System.out.println(1e3); // 1000.0

		char ch = 'A';
		int i = 'A'; // 65

		String str = ""; // 빈 문자
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		System.out.println("" + 7 + 7);
		System.out.println(7 + 7 + "");


	}

}
