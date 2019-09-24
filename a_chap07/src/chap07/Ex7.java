package chap07;
public class Ex7 {
	public static void main(String[] args) {
							
		int[][] mathScores = new int[2][3]; //2행 3열
		for(int i = 0; i < mathScores.length; i++) {
			for(int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int [2][]; //2행만 선언
		englishScores[0]= new int[1]; // 1행은 1열
		englishScores[1]= new int[3]; // 2행은 3열
		for(int i = 0; i < englishScores.length; i++) {
			for(int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} }; // 1행 2열 2행 3열
		for(int i = 0; i < javaScores.length; i++) {
			for(int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
	}
}
	
