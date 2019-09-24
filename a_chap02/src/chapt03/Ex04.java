package chapt03;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JDK" + 6.0; //str1은 참조변수(객체이름이자/주소 저장)
		String str2 = str1 + "AAA" ;
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
	}
 
}
