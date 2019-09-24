package string_ex;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Ex2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = null;
		String tokened = null;
		boolean check = true;
		int result = 0;
	
		
		//토크나이저를 통해 분리
		Loop: 
		while(check)
		{	
			System.out.println("입력");
			str = scan.next().trim(); //공백제거
			StringTokenizer token = new StringTokenizer(str, "+*-/", true);
			
			//첫번째 값 받기
			tokened = token.nextToken(); 
		
			if(numcheck(tokened)) {
				System.out.println("첫번째가 숫자가 아닌 오류"); 
				continue;
			 }
			 
			 result = Integer.parseInt(tokened); //첫번째 수 입력
			 
			
			while(token.hasMoreTokens()) 
			{	
				tokened = token.nextToken();	//두번째 (연산자)
				char ch = tokened.charAt(0);	//문자열에서 연산자 추출
				
				if(token.hasMoreTokens())	
					tokened = token.nextToken();	//세번째(숫자)
				else
				{
					System.out.println("수식오류 연산자로 수식 끝남");
					continue Loop;
				}
				
				if(numcheck(tokened))
				{
					System.out.println("수식오류 토큰이 숫자");
					continue Loop;
				}
				
				
				switch(ch)
				{
					case '*' :
						result = result *Integer.parseInt(tokened);
						break;
					case '-' :
						result = result -Integer.parseInt(tokened);
						break;
					case '+' :
						result = result +Integer.parseInt(tokened);
						break;
					case '/' :
						result = result/Integer.parseInt(tokened);
						break;
				}//switch
			}//while
			break;
		}//while(check)
		System.out.println(str + "=" + result );
	}
		static boolean numcheck(String a) 
		{			
			for(int i = 0; i <a.length(); i++) 
			{
				char ch = a.charAt(i);
				if('9' >= ch && '0' <= ch)
					return false; //숫자면 	
			}
			return true; //문자면
		}
}




