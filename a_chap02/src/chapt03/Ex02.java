package chapt03;

public class Ex02 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = (byte)~a;
		System.out.println("a=" + a + ", b=" + b);
		a = -10;
		b = (byte)~a;
		System.out.println("a=" + a + ", b=" + b);
		
	}
	
}
