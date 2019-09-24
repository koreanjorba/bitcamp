package chapt04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode<= 90)) {
			System.out.println("대문자 이군요");
		}
		if((charCode >= 97) && (charCode<= 122)) {
			System.out.println("소문자 이군요");
		}
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 문자 이군요");
		}
		int value = 6;
		
		if((value%2 == 0)| (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
		if((value%2 == 0)|| (value%3==0)) {
			System.out.println("2또는 3의 배수");
		}
	}

}
