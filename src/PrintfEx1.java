
public class PrintfEx1 {
	public static void main(String[] args) {
//		System.out.println(10.0/3);
		
		System.out.printf("%d%n", 15);
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		float f = 123.456789f;
		System.out.printf("%f%n", f);
		
		double g = 123.456789;
		System.out.printf("%f%n", g);
		System.out.printf("%e%n", g);
		System.out.printf("%g%n", g);
		
		
		System.out.printf("[%5d]%n", 1234567);
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n", d);

		System.out.printf("[%s]%n", "www.codechobo.com");
		System.out.printf("[%20s]%n", "www.codechobo.com");
		System.out.printf("[%-20s]%n", "www.codechobo.com");
		System.out.printf("[%.10s]%n", "www.codechobo.com");

	}
}
