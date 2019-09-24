package selfstudy;

public class Ex04 {

	public static void main(String[] args) {
		int value;
		
		value = (int)Math.random()*6 + 1;
	
	

	//2i +4j = 10 ÀÇ ÇØ
	
	
	for(int i = 0; i<=10; i++) {
		for(int j = 0; j <= 10; j++) {
			if(2*i + 4*j == 10) {
				System.out.println(i + " " + j);	
			}
		}
	}
			
}	
}
