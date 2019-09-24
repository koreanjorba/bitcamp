package chap06;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		

		outerLoop:
		while(true) {
			
		System.out.println("** ¸Þ´º **");
		System.out.println("1. µ¡¼À(+) ");
		System.out.println("2. µ¡¼À(-) ");
		System.out.println("3. µ¡¼À(*) ");
		System.out.println("4. µ¡¼À(/) ");
		System.out.println("5. ÇÁ·Î±×·¥ Á¾·á ");
		
		System.out.println("¸Þ´º ¼±ÅÃ");
		int menu = scan.nextInt();
		int num1, num2;
		
		System.out.println("Ã¹¹øÂ°");
		 num1 = scan.nextInt();
		System.out.println("µÎ¹øÂ°");
		 num2 = scan.nextInt();
		
		switch(menu){
		case 1:
			System.out.println(num1 + num2);
			break;
		case 2:
			System.out.println(num1 - num2);
			break;
		case 3:
			System.out.println(num1 * num2);
			break;
		case 4:
			System.out.println(num1 / (float)num2);
			break;
		case 5:
			System.out.println("Á¾·á");
			break outerLoop;
		}
		
	
		}
	}

}
