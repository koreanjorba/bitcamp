package chap06;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			
		System.out.println("** �޴� **");
		System.out.println("1. ����(+) ");
		System.out.println("2. ����(-) ");
		System.out.println("3. ����(*) ");
		System.out.println("4. ����(/) ");
		System.out.println("5. ���α׷� ���� ");
		
		System.out.println("\n�޴� �����ϼ���");
		int menu = scan.nextInt();	 		// ��ĳ�� ���� ������ ��� ����
		int num1, num2;
		
		System.out.println("ù��°");
		 num1 = scan.nextInt();
		System.out.println("�ι�°");
		 num2 = scan.nextInt();
		
		 if(menu == 5) {
			 System.out.println("The End...");
			 break;
		 }
		 if(menu <1 || menu >5) {
			 System.out.println("�޴��� �߸� �����߾��\n");
			 continue;
		 }
		 
		 switch(menu) {
		 
		 case 1:
			 System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
			 break;
		 case 2:
			 System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
			 break;
		 case 3:
			 System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
			 break;
		 case 4:
			 System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
			 break;
			 
		 }
		
	
		}
	}

}
