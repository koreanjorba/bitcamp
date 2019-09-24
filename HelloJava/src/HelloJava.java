
public class HelloJava {
	// byte: 주소 부여 최소단위/ 문자 최소단위
	// 접근지정자 : public default / protected private
	public static void main(String[] args) {
		byte e = (byte)-128; //상수도 데이타타입 있다(int)
		byte a = (byte)127;
		int b = a;
		a = (byte)b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("a+b= " +(a + b));
				
		byte c = 10, d = 20; 
		int f = (byte)(c+d);
		System.out.println(f);
				System.out.println("Hi, Java");  
//		System(class)out(field)println(method)
//		             in	       print
//					 err	   printf
	}

	/* 클래스 = 속성(필드) + 메서드(함수)
	 * 객체    = 속성 + 메서드
	 */
	//Thread - cpu가 실행 할 수 있는 최소 단위  
	//변수 - 숫자로 시작 x 특수문자x ($ _ 제외 )
	  
}
