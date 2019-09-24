package chapt04;

import java.util.Scanner;

public class scan_if_ex {

	public static void main(String[] args) {
	
		String code, irum, grade;
		int su, danga;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("코드를 입력하세요 =>");
		code = scan.next();
		
		System.out.print("상품명을 입력하세요 =>");
		irum = scan.next();
		
		System.out.print("수량을 입력하세요 =>");
		su = scan.nextInt();
		
		System.out.print("단가를 입력하세요 =>");
		danga = scan.nextInt();
		
		int price = danga * su ;
		
		
		if(su >= 100) {
			grade = "우수";
		}else if(su >= 70) {
			grade = "보통";
		}else
			grade = "분발";
		
		System.out.println("       ***판매현황***\n=========================");
		System.out.println("코드    상품명    수량    단가    금액    평가");
		System.out.println("=========================");
		System.out.printf("%3s  %s   %d  %d  %d  %s\n" , code, irum, su, danga, price, grade );
		System.out.println("=========================");
		

	}

}
