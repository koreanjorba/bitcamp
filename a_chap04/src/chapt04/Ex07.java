package chapt04;

public class Ex07 {

	public static void main(String[] args) {
		int score = 93;
		
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A �Դϴ�.");
		}
		
		if(score < 90) 
			System.out.println("������ 90���� �۽��ϴ�.");
	 	System.out.println("����� B�Դϴ�."); //��� ���� ��
	 	
		if(score < 90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�."); 
		}
	}

}
