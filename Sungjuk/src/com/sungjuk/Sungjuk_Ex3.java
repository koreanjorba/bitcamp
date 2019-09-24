package com.sungjuk;
import java.util.Scanner;

public class Sungjuk_Ex3 {
//학생수와, 전체 평균
//학생수는 정적필드 이용, 전체 평균은 정적메소드로 출력
	
	public static void main(String[] args) 
	{		
		int cnt = 0;
		int menu = 0;
		Sungjuk[] obj = new Sungjuk[100]; 	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("입력하세요");
			menu = scan.nextInt();
			if( menu == 6) {
				System.out.println("The End...");
				break;
			}
			switch(menu) {
			case 1: input_sungjuk(obj);
			break;
			case 2: output_sungjuk(obj);
			break;
			case 3: input_sungjuk(obj);
			break;
			case 4: input_sungjuk(obj);
			break;
			case 5: input_sungjuk(obj);
			break;
			}
			
		}
		

	}
	
	static void printMenu() 
	{	System.out.println("*** 성적관리 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 성적정보 출력");
		System.out.println("3. 성적정보 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료\n");
	}
	static void input_sungjuk(Sungjuk[] obj)
	{
		//객체 배열생성
		obj[Sungjuk.total_cnt] = new Sungjuk(); // cnt를 매개변수로 받는 obj 객체 생성?
		obj[Sungjuk.total_cnt].input();
		
		for(int i = 0; i < Sungjuk.total_cnt; i++)
		{
			if(obj[i].hakbun.equals(obj[Sungjuk.total_cnt].hakbun))
				System.out.println("코드 중복");
		}

		obj[Sungjuk.total_cnt].process();
		
		System.out.println("입력성공?");
		Sungjuk.total_cnt++;
		
	}
	static void output_sungjuk(Sungjuk[] obj) 
	{
		int i ;
		System.out.println("\n       ***성적표***        ");
		System.out.println("==========================");
		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급 ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for(i = 0; i < Sungjuk.total_cnt; i++) 
		{
			obj[i].output();
			Sungjuk.total_avg += obj[i].avg;
			
		}
		System.out.println("총 학생수 : " + Sungjuk.total_cnt);
		System.out.println("총 평균: " + Sungjuk.print_total_avg());
		System.out.println();
		
	}

}
