package chap07;

import java.util.Scanner;

public class Ex5 {
	static int MAX = 2; // 필드(속성) 클래스 내부 사용 가능
	public static void main(String[] args) {
		
		String[] code = new String[MAX];
		String[] name = new String[MAX];
		int[] num = new int[MAX];
		int[] price = new int[MAX];
		int[] total = new int[MAX];
		String[] grade = new String[MAX];
		
		int[] arr = new int[MAX];
		
		
		Scanner scan = new Scanner(System.in);
		
		for( int i = 0; i < arr.length; i++) {
			System.out.print("상품 코드 =>");
			code[i] = scan.next();
			System.out.print("상품 이름=>");
			name[i] = scan.next();
			System.out.print("수량=>");
			num[i] = scan.nextInt();
			System.out.print("단가=>");
			price[i] = scan.nextInt();
			System.out.println();
			total[i] = price[i]*num[i];
		
		
			if(num[i] >= 100) {
				grade[i] = "우수";
			}else if(num[i] >= 70) {
				grade[i] = "보통";
			}else
				grade[i] = "분발";
		}
		
		System.out.println("      *** 판매 현황 ***");
		System.out.println("========================");
		System.out.printf("   코드     이름   수량    단가   금액  평가\n");
		System.out.println("========================");
		for( int i = 0; i < arr.length; i++) {
			System.out.printf("%4s %4s %3d %d %d  %s\n", code[i], name[i], num[i], price[i], total[i], grade[i]);
		}
		System.out.println("========================\n\n");
	
		System.out.println("Done");
	}

}
