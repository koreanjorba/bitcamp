package chapt04;

import java.util.Scanner;

public class scan_if_ex {

	public static void main(String[] args) {
	
		String code, irum, grade;
		int su, danga;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ڵ带 �Է��ϼ��� =>");
		code = scan.next();
		
		System.out.print("��ǰ���� �Է��ϼ��� =>");
		irum = scan.next();
		
		System.out.print("������ �Է��ϼ��� =>");
		su = scan.nextInt();
		
		System.out.print("�ܰ��� �Է��ϼ��� =>");
		danga = scan.nextInt();
		
		int price = danga * su ;
		
		
		if(su >= 100) {
			grade = "���";
		}else if(su >= 70) {
			grade = "����";
		}else
			grade = "�й�";
		
		System.out.println("       ***�Ǹ���Ȳ***\n=========================");
		System.out.println("�ڵ�    ��ǰ��    ����    �ܰ�    �ݾ�    ��");
		System.out.println("=========================");
		System.out.printf("%3s  %s   %d  %d  %d  %s\n" , code, irum, su, danga, price, grade );
		System.out.println("=========================");
		

	}

}
