package chap05;

import java.util.Scanner;

public class Ex07_dowhile {

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
		
		int i = min;
		do {
			System.out.print("*** "+ i + "��***    ");
			i++;
		}	while(i <= max); 
		System.out.println();
		
		
		int j = 1;
		do {i = min;
			do { 
				System.out.printf("%d * %d = %2d    ", i, j, i*j);
				i++;
				} while(i <= max);
					System.out.println();
					j++;
			}while(j <= 9);
		
//		int j = 1;
//		while(j <= 9) {								//1,2,3,4~  ���߿� �ٲ�� �� - �ٱ���
//			
//			i = min;
//			while(i <= max) {
//				System.out.printf("%d * %d = %2d    ", i, j, i*j);
//				i++;
//			}
//			System.out.println();
//			j++;
//		}
	

	}

}
