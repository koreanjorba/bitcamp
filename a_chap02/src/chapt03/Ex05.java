package chapt03;

public class Ex05 {

	public static void main(String[] args) {
		char c1 = 'A' + 1; //'A'는 상수라서 인트값 아님
		char c2 = 'A'; // char c2 = 65 와 같음
		int c3 = c2 + 1; // 문자에 대한 유니코드 값 저장
		char c4 = (char)(c2 + 1); // 문자로 값 저장
		System.out.println("c1 :" + c1);
		System.out.println("c2 :" + c2);
		System.out.println("c3 :" + c3);
		System.out.println("c4 :" + c4);
		
	}

}
