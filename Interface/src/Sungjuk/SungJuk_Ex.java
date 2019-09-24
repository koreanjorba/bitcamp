package Sungjuk;

import java.util.Scanner;

public class SungJuk_Ex {
	final static int MAX = 100;
	static int cnt = 0;
	static int cnt1 = 0;
	
	public static void main(String[] args) {
		
	Sungjuk_[] obj = new Sungjuk_[100];
	PersonInfo[] obj1 = new PersonInfo[100];
	
	input(obj, obj1);
	
	System.out.println("\n       ***성적표***        ");
	System.out.println("==========================");
	System.out.println("학번     이름      국어      영어      수학     총점      평균     등급 ");
	output(obj, cnt);	
	System.out.println("==========================");
	
	System.out.println("\n    ***개인정보***       ");
	System.out.println("===================");
	System.out.println("학번  이름  번호  주소 ");
	output(obj1, cnt1);
	System.out.println("===================");
	}
	
	static void input(Sungjuk_[] arr, PersonInfo[] arr1) {
		for(int i = 0; i < MAX; i++)
		{
			arr[i] = new Sungjuk_();					
			if(arr[i].input())
				break;
			arr[i].process();
			cnt++;
		}
		for(int i = 0; i < MAX; i++)
		{
			arr1[i] = new PersonInfo();					
			if(arr1[i].input())
				break;
			cnt1++;
		}
	}
	
	static void output(Personable[] arr, int cnt0) 
	{
		for(int i = 0; i < cnt0; i++) 
		{
			arr[i].output();			
		}
	}

}

		
	

