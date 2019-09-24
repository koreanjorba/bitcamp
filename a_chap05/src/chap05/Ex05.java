package chap05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	
		int max;
		int min;
		
		if (num1 < num2) {
			 min = num1;
			 max = num2;
		}else {
			max = num1;
			min = num2;
		}
		
		for(int i = min; i <= max; i++) {
			System.out.print("*** "+ i + "단***    ");
		}
		System.out.println();
		for(int j=1 ; j <= 9; j++) {								//1,2,3,4~  나중에 바뀌는 수 - 바깥쪽
			
			for(int i = min ; i <= max; i++) {						//3,4,5,6,7 먼저 바뀌는 수 - 안쪽
				System.out.printf("%d * %d = %2d    ", i, j, i*j);
			}
			System.out.println();
			
		}
	}

}
