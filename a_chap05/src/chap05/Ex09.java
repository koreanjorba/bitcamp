package chap05;

public class Ex09 {

	public static void main(String[] args) {
		
		outerLoop:
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.println("(" + row + "," + col + ")");
				if((row == 1) && (col == 1))
					break outerLoop;
			}
		}
		System.out.println("Done");
		
		outerLoop:
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.println("(" + row + "," + col + ")");
				if((row == 1) && (col == 1))
					continue outerLoop;
			}
		}
		System.out.println("Done");

	}

}
