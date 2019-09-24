package chapt04;

public class Ex07 {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		if(score < 90) 
			System.out.println("점수가 90보다 작습니다.");
	 	System.out.println("등급은 B입니다."); //계속 수행 됨
	 	
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다."); 
		}
	}

}
