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
		//��ũ�������� ���� �и�
		Loop: 
		while(check)
		{	System.out.println("�Է�");
			String str = scan.next();
			StringTokenizer token = new StringTokenizer(str, "+*-/", true);
			
			//ù��° �� �ޱ�
			tokened = token.nextToken(); 
			num = numcheck(tokened);
			if(num == 1) {
				 continue Loop;
			 }
			 
			 result = Integer.parseInt(tokened); //ù��° �� �Է�
			 
			//�ι�° ���� ������ ��ȣ
			while(token.hasMoreTokens()) 
			{	
				val1 = token.nextToken();	//�ι�° (��ȣ)
//				if(!val1.equals("+")&& !val1.equals("/")&& !val1.equals("*")&& !val1.equals("-"))
//					{System.out.println("���Ŀ���");
//					continue Loop;
//					}
				
				val2 = token.nextToken();  //����°(����)
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
					break;					//���ڸ� 0
				else { 
					System.out.println("����");
					return 1;				//��ȣ�� 1
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
//			if('0'< ch | '9' > ch)   //��ȣ�̸�(���ڰ� �ƴϸ� ����)
//				System.out.println("����");
//				break;
//	}break;
//}

//for(int i = 0; i < tokened.length(); i++) {
//	char ch = tokened.charAt(i);
//	if('0'> ch | '9' < ch) {
//		
//	}
//}

