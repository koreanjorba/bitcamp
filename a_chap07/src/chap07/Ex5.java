package chap07;

import java.util.Scanner;

public class Ex5 {
	static int MAX = 2; // �ʵ�(�Ӽ�) Ŭ���� ���� ��� ����
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
			System.out.print("��ǰ �ڵ� =>");
			code[i] = scan.next();
			System.out.print("��ǰ �̸�=>");
			name[i] = scan.next();
			System.out.print("����=>");
			num[i] = scan.nextInt();
			System.out.print("�ܰ�=>");
			price[i] = scan.nextInt();
			System.out.println();
			total[i] = price[i]*num[i];
		
		
			if(num[i] >= 100) {
				grade[i] = "���";
			}else if(num[i] >= 70) {
				grade[i] = "����";
			}else
				grade[i] = "�й�";
		}
		
		System.out.println("      *** �Ǹ� ��Ȳ ***");
		System.out.println("========================");
		System.out.printf("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
		System.out.println("========================");
		for( int i = 0; i < arr.length; i++) {
			System.out.printf("%4s %4s %3d %d %d  %s\n", code[i], name[i], num[i], price[i], total[i], grade[i]);
		}
		System.out.println("========================\n\n");
	
		System.out.println("Done");
	}

}
