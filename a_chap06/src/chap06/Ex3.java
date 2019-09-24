package chap06;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			
		System.out.println("** ¸Þ´º **");
		System.out.println("1. µ¡¼À(+) ");
		System.out.println("2. µ¡¼À(-) ");
		System.out.println("3. µ¡¼À(*) ");
		System.out.println("4. µ¡¼À(/) ");
		System.out.println("5. ÇÁ·Î±×·¥ Á¾·á ");
		
		System.out.println("\n¸Þ´º ¼±ÅÃÇÏ¼¼¿ä");
		int menu = scan.nextInt();	 		// ½ºÄ³³Ê °ªÀÌ ³ª¿À¸é Ãâ·Â Á¤Áö
		int num1, num2;
		
		System.out.println("Ã¹¹øÂ°");
		 num1 = scan.nextInt();
		System.out.println("µÎ¹øÂ°");
		 num2 = scan.nextInt();
		
		 if(menu == 5) {
			 System.out.println("The End...");
			 break;
		 }
		 if(menu <1 || menu >5) {
			 System.out.println("¸Þ´º¸¦ Àß¸ø ¼±ÅÃÇß¾î¿ä\n");
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
