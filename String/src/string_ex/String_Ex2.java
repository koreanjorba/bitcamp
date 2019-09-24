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
	
		
		//��ũ�������� ���� �и�
		Loop: 
		while(check)
		{	
			System.out.println("�Է�");
			str = scan.next().trim(); //��������
			StringTokenizer token = new StringTokenizer(str, "+*-/", true);
			
			//ù��° �� �ޱ�
			tokened = token.nextToken(); 
		
			if(numcheck(tokened)) {
				System.out.println("ù��°�� ���ڰ� �ƴ� ����"); 
				continue;
			 }
			 
			 result = Integer.parseInt(tokened); //ù��° �� �Է�
			 
			
			while(token.hasMoreTokens()) 
			{	
				tokened = token.nextToken();	//�ι�° (������)
				char ch = tokened.charAt(0);	//���ڿ����� ������ ����
				
				if(token.hasMoreTokens())	
					tokened = token.nextToken();	//����°(����)
				else
				{
					System.out.println("���Ŀ��� �����ڷ� ���� ����");
					continue Loop;
				}
				
				if(numcheck(tokened))
				{
					System.out.println("���Ŀ��� ��ū�� ����");
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
					return false; //���ڸ� 	
			}
			return true; //���ڸ�
		}
}




