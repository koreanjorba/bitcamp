package chap07;

public class Ex1 {

	public static void main(String[] args) {
	
		String strVar1 = "신민철"; // 객체 생성. 참조변수-100번지(stack에 저장) "신민철" (heap에 저장)
		String strVar2 = "신민철"; // 		똑같이 100번지 주소 값 가짐	
	
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같은");
			
		}
		
		String strVar3 = new String("신민철"); // 객체 생성
		String strVar4 = new String("신민철"); // 또 다른 객체 생성
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같은");
		}
		
		String strVar5 = null; //null은 객체 생성 x. 따라서 equals(메소드)를 불러올 수 없다. 참조하는 주소도 없다.
		String strVar6 = "신민철"; //
		
		if(strVar5 == strVar6) {
			System.out.println("strVar5과 strVar6는 참조가 같음");
		}else {
			System.out.println("strVar5과 strVar6는 참조가 다름");
		}
		if(strVar5.equals(strVar6)) {
			System.out.println("strVar5과 strVar6는 문자열이 같은");
		}
		
		

	}

}
