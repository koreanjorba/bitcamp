package chap07;
public class Ex8 {
	public static void main(String[] args) {
							
//		int[] scores = {95, 71, 84, 93, 87};
//		
//		int sum = 0;
//		for(int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("���� ����= " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("���� ��� = " + avg);
		
		int[][] scores = {{95, 71, 84, 93, 87},{0, 1, 2, 3}};
		
		int sum = 0;
		for(int score : scores[0]) {
			sum = sum + score;
		}
		System.out.println("���� ����= " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���� ��� = " + avg);

	}
}
	
