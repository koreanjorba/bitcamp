package chapt04;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b =30, max;
		max = a < b ? a : b;
		System.out.println(max);
		
		int score = 95;
		char grade = (score > 90)? 'A' : ( (score > 80) ? 'B' : 'C');
		System.out.println(score + "점은" + grade + "등급입니다.");
		
	}

}
