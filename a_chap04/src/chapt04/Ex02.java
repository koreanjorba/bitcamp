package chapt04;

public class Ex02 {
	public static void main(String[] args) {
		byte a = 10, b = -10;
		byte c, d, e, f;
		c = (byte)(a & b);
		d = (byte)(a | b);
		e = (byte)(a ^ b);
		f = (byte)(~a);
		System.out.println("a & b => " + c);
		System.out.println("a | b => " + d);
		System.out.println("a ^ b => " + e);
		System.out.println("~a  => " + f);
		
		c = (byte)(a << 2); // 2ÀÇ 2Á¦°ö
		d = (byte)(a >> 2);
		e = (byte)(b << 2);
		f = (byte)(b >> 2);
		System.out.println("a << 2=> " + c);
		System.out.println("a >> 2=> " + d);
		System.out.println("b << 2=> " + e);
		System.out.println("b >> 2 => " + f);
		
		c = (byte)(a >>> 2);
		d = (byte)(b >>> 2);
		System.out.println("a >>> 2 => " + c);
		System.out.println("a <<< 2 => " + d);
	}
}
