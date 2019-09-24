package string_ex;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Ex01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String tokened = null;
		boolean check = true;
		int numcheck = 0;
		int result = 0;
		int num = 0;
		String val1 = null;
		String val2 = null;
		//토크나이저를 통해 분리
		Loop: 
		while(check)
		{	System.out.println("입력");
			String str = scan.next();
			StringTokenizer token = new StringTokenizer(str, "+*-/", true);
			
			//첫번째 값 받기
			tokened = token.nextToken(); 
			num = numcheck(tokened);
			if(num == 1) {
				 continue Loop;
			 }
			 
			 result = Integer.parseInt(tokened); //첫번째 수 입력
			 
			//두번째 값은 어차피 부호
			while(token.hasMoreTokens()) 
			{	
				val1 = token.nextToken();	//두번째 (부호)
//				if(!val1.equals("+")&& !val1.equals("/")&& !val1.equals("*")&& !val1.equals("-"))
//					{System.out.println("수식오류");
//					continue Loop;
//					}
				
				val2 = token.nextToken();  //세번째(숫자)
				num = numcheck(val2);
				if(num == 1) {
					 continue Loop;
				 }
				
				switch(val1){
					case "*" :
						result = result *Integer.parseInt(val2);
						break;
					case "-" :
						result = result -Integer.parseInt(val2);
						break;
					case "+" :
						result = result +Integer.parseInt(val2);
						break;
					case "/" :
						result = result/Integer.parseInt(val2);
						break;
					}
			}
			System.out.println(str + "=" + result );
			check = false;
		}
	}
		static int numcheck(String a) {
			for(int i = 0; i <a.length(); i++) 
			{
				char ch = a.charAt(i);
				if('9' >= ch && '0' <= ch)
					break;					//숫자면 0
				else { 
					System.out.println("오류");
					return 1;				//부호면 1
					}
			}return 0;
		}
}


//if()
//{
//	String tokened = token.nextToken();
//	for(int i = 0; i < tokened.length(); i++) 
//	{
//		char ch = tokened.charAt(i);
//			if('0'< ch | '9' > ch)   //부호이면(숫자가 아니면 오류)
//				System.out.println("오류");
//				break;
//	}break;
//}

//for(int i = 0; i < tokened.length(); i++) {
//	char ch = tokened.charAt(i);
//	if('0'> ch | '9' < ch) {
//		
//	}
//}

