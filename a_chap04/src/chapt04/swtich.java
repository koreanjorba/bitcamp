package chapt04;

public class swtich {

	public static void main(String[] args) {
				
			int num = (int)(Math.random()*6) + 1;
			
			switch(num) {
				case 1:
					System.out.println("1번이 나왔습니다");
					break;
				case 2:
					System.out.println("2번이 나왔습니다.");
					break;
				case 3:
					System.out.println("3번이 나왔습니다.");
					break;
				case 4:
					System.out.println("4번이 나왔습니다.");
					break;
				default:
					System.out.println("5번이 나왔습니다.");
					break;
			}
			
			char grade = 'B';
			
			switch(grade) {
				case 'A':
				case 'a':
					System.out.println("우수 회원입니다.");
					break;
					
				case 'B':	//break 생략 시 아래로 계속 실행
				case 'b':
					System.out.println("일반 회원입니다.");
					break;
				
				default:
					System.out.println("손님입니다.");
					break;	
			
			
			}
			
			String position = "과장";
			
			switch(position) {
				case "부장":
				
					System.out.println("700만원");
					break;
					
				case "과장":
					System.out.println("500만원");
					break;
				
				default:
					System.out.println("300만원");
					break;	
			}
	}

}
