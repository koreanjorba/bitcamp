package chap06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		outerLoop:
		{
		
		System.out.println("** �޴� **");
		System.out.println("1. ����(+) ");
		System.out.println("2. ����(-) ");
		System.out.println("3. ����(*) ");
		System.out.println("4. ����(/) ");
		System.out.println("5. ���α׷� ���� ");
		
		System.out.println("�޴� ����");
		int menu = scan.nextInt();
		int num1, num2;
			
		switch(menu){
		
		case 1:
			System.out.println("ù��°");
			 num1 = scan.nextInt();
			System.out.println("�ι�°");
			 num2 = scan.nextInt();
			System.out.println(num1 + num2);
			
			
		case 2:
			System.out.println("ù��°");
			 num1 = scan.nextInt();
			System.out.println("�ι�°");
			 num2 = scan.nextInt();
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println("ù��°");
			 num1 = scan.nextInt();
			System.out.println("�ι�°");
			 num2 = scan.nextInt();
			System.out.println(num1 * num2);
			break;
		case 4:
			System.out.println("ù��°");
			 num1 = scan.nextInt();
			System.out.println("�ι�°");
			 num2 = scan.nextInt();
			System.out.println(num1 / num2);
			break;
		case 5:
			System.out.println("����");
			break;
		}
		}
	
		
	}

}
