package chap05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("첫번째 숫자 입력");
		int i = scan.nextInt();
		System.out.println("두번째 숫자 입력");
		int k = scan.nextInt();
		
		int temp;
		
		if(i < k) {
		}else{
			 temp = i;
			 i = k;
			 k = temp;
		}
		
		for(  ; i <= k; i++) {
				System.out.println("*** " + i +"단***");
			for(int j=1  ; j < 10; j++ ) {
				System.out.println("i*j = " + i + "*" + j +"=" + i*j);
			}
		}
	
	}

}
