package com.sungjuk;
import java.util.Scanner;

public class Sungjuk_Ex3 {
//�л�����, ��ü ���
//�л����� �����ʵ� �̿�, ��ü ����� �����޼ҵ�� ���
	
	public static void main(String[] args) 
	{		
		int cnt = 0;
		int menu = 0;
		Sungjuk[] obj = new Sungjuk[100]; 	
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("�Է��ϼ���");
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
	{	System.out.println("*** �������� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����\n");
	}
	static void input_sungjuk(Sungjuk[] obj)
	{
		//��ü �迭����
		obj[Sungjuk.total_cnt] = new Sungjuk(); // cnt�� �Ű������� �޴� obj ��ü ����?
		obj[Sungjuk.total_cnt].input();
		
		for(int i = 0; i < Sungjuk.total_cnt; i++)
		{
			if(obj[i].hakbun.equals(obj[Sungjuk.total_cnt].hakbun))
				System.out.println("�ڵ� �ߺ�");
		}

		obj[Sungjuk.total_cnt].process();
		
		System.out.println("�Է¼���?");
		Sungjuk.total_cnt++;
		
	}
	static void output_sungjuk(Sungjuk[] obj) 
	{
		int i ;
		System.out.println("\n       ***����ǥ***        ");
		System.out.println("==========================");
		System.out.println("�й�     �̸�      ����      ����      ����     ����      ���     ��� ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for(i = 0; i < Sungjuk.total_cnt; i++) 
		{
			obj[i].output();
			Sungjuk.total_avg += obj[i].avg;
			
		}
		System.out.println("�� �л��� : " + Sungjuk.total_cnt);
		System.out.println("�� ���: " + Sungjuk.print_total_avg());
		System.out.println();
		
	}

}
