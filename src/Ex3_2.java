
public class Ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 5, j = 0;
		//j = i++; // 후위
		j = i;
		i++;
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		i = 5;
		j = 0;
		
		++i;
		j = i; // 전위
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
		

	int a  = 1_000_000;
	int b = 2_000_000;
	
	long c = (long)a * b;
	System.out.println(c);
	
	double pi = 3.141592;
	double shortPi = Math.round(pi * 1000) / 1000.0;
	System.out.println(shortPi);
				
		
	}

}
