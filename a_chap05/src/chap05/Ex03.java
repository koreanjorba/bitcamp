package chap05;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("ù��° ���� �Է�");
		int i = scan.nextInt();
		System.out.println("�ι�° ���� �Է�");
		int k = scan.nextInt();
		
		int temp;
		
		if(i < k) {
		}else{
			 temp = i;
			 i = k;
			 k = temp;
		}
		
		for(  ; i <= k; i++) {
				System.out.println("*** " + i +"��***");
			for(int j=1  ; j < 10; j++ ) {
				System.out.println("i*j = " + i + "*" + j +"=" + i*j);
			}
		}
	
	}

}
