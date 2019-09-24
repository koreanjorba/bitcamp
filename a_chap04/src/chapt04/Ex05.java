package chapt04;

public class Ex05 {

	public static void main(String[] args) {
	
		String strVar1 = "신민철"; //컴파일 시 객체 생성 - 100번지
		String strVar2 = "신민철"; // 객체 주소만 반환(따로 생성  x) - 100번지
		String strVar3 = new String("신민철"); // 새로운 객체 생성 - 200번지
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3); //false
		System.out.println( "----------------");
		System.out.println( strVar1.equals(strVar2)); // equals - 문자열 값의 비교(주소가 아님)
		System.out.println( strVar1.equals(strVar3));
		
		
	}

}
