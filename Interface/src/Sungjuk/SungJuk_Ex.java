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
	
	System.out.println("\n       ***����ǥ***        ");
	System.out.println("==========================");
	System.out.println("�й�     �̸�      ����      ����      ����     ����      ���     ��� ");
	output(obj, cnt);	
	System.out.println("==========================");
	
	System.out.println("\n    ***��������***       ");
	System.out.println("===================");
	System.out.println("�й�  �̸�  ��ȣ  �ּ� ");
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

		
	

