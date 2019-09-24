package com.sungjuk;
//
//public class Sungjuk_Ex2 {
////학생수와, 전체 평균
////학생수는 정적필드 이용, 전체 평균은 정적메소드로 출력
//	public static void main(String[] args) 
//	{		
//		int cnt = 0;
//		Sungjuk[] obj = new Sungjuk[100]; 	// 	 		 obj >> Sungjuk배열을 참조하는 obj(main)
//		
//		cnt = input_sungjuk(obj);
//		ouput_sungjuk(obj, cnt);
//	}
//	
//	static int input_sungjuk(Sungjuk[] obj) // Sungjuk[] obj = obj >> Sungjuk배열을 참조하는 obj(main과다름)
//	{
//		int i=0 ;
//		int cnt = 0;
//		for(i = 0; i < 100; i++)
//		{
//			obj[i] = new Sungjuk();
//			if(obj[i].input())
//				break;
//			obj[i].process();
//			cnt++;
//		}	
//		return cnt;
//	}
//	static void ouput_sungjuk(Sungjuk[] obj, int cnt) 
//	{
//		int i = 0;
//		System.out.println("\n       ***성적표***        ");
//		System.out.println("==========================");
//		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급");
//		System.out.println("==========================");
//		for(i = 0; i < cnt; i++)
//		obj[i].output();
//		System.out.println();
//	}
//
//}
