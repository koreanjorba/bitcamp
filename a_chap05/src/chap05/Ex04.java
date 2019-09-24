package chap05;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		if (first < second) {
			int min = first;
			int max = second;
		
			for(int i = min ; i<max; i++) {
				for(int j = 1; j < 10; j++) {
					System.out.println(i+ "*" +j);
				}
			}
		}
		
	}
}
