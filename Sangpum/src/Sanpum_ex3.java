import java.util.Scanner;

public class Sanpum_ex3 {
	static int MAX = 100;
	public static void main(String[] args) {
		int i = 0;
		int cnt = 0;
		int menu = 0;
		Sangpum[] obj = new Sangpum[100] ; // obj - Ŭ���� ����?
		
		Scanner scan = new Scanner(System.in);
				
			while(true) 
			{	 printMenu();
				 System.out.println("�޴�����");
				 menu = scan.nextInt();
				 System.out.println();
					
				if( menu == 6) {
					System.out.println("The End...");
					break;
				}
				
				switch(menu)
				{
				case 1:
					cnt = input_sangpum(obj, cnt);
					break;
				case 2:
					output_sangpum(obj, cnt);
					break;
				case 3:
					search_sangpum(obj, cnt);
					break;
				case 4:
					update_sangpum(obj, cnt);
					break;
				case 5:
					cnt = delete_sangpum(obj, cnt);
					break;
				default:
				}
			}
	}

	
//	cnt = input_sangpum(obj);
//	output_sangpum(obj, cnt);
//	System.out.println(obj);

	
	
		static void printMenu() 
		{
			System.out.println("*** ��ǰ���� ***");
			System.out.println("1. ��ǰ���� �Է�");
			System.out.println("2. ��ǰ���� ���");
			System.out.println("3. ��ǰ���� ��ȸ");
			System.out.println("4. ��ǰ���� ����");
			System.out.println("5. ��ǰ���� ����");
			System.out.println("6. ���α׷� ����\n");
	
		}
		static int delete_sangpum(Sangpum[] obj, int cnt)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = scan.next();
			
				for(int i = 0; i < cnt; i++) {
					if(result.equals(obj[i].code)) 
					{
						for(int j=i; j<cnt-1; j++) {
							obj[j] = obj[j+1];
						}
					}
//					cnt--;
//					return cnt;
					System.out.println("��ǰ���� ��������");
					return cnt -1;
				}
				System.out.println("�ڵ� ����");
				return cnt;
				
		}
		
		static void update_sangpum(Sangpum[] obj, int cnt) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = scan.next();
			
			for(int i = 0; i < cnt; i++) {
				if(result.equals(obj[i].code)) 
				{					
					obj[i].update();
					obj[i].process();
					System.out.println("��ǰ���� �Է¼���");
					return;
				}
			}
			System.out.println("�Է¿���");
		}
		
		static void search_sangpum(Sangpum[] obj, int cnt) 
		{
			Scanner search = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = search.next();
							
			for(int i = 0; i < cnt; i++) {
				if(result.equals(obj[i].code)) 
				{			
					System.out.println("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
					System.out.println("========================");
					obj[i].output();
					System.out.println("========================\n\n");
					return;
				} 
			}
			System.out.println("�ڵ����");
				
		}
		
		
		
		static int input_sangpum(Sangpum[] obj, int cnt)   //��������
		{
			obj[cnt] = new Sangpum(); 						//���������� ���ؼ� ��ü ����.
			obj[cnt].input();
//			for(int i = 0; i < cnt; i++)
//			{
//				if(obj[i].code.equals(obj[cnt].code)) 
//				{
//					System.out.println("\n��ǰ�ڵ� �Է� ����(�ߺ�)\n");
//					return cnt;
//				}
//			}
			obj[cnt].process();
			cnt++;
			System.out.println("��ǰ���� �Է¼���");
			return cnt;
		}
		
		static void output_sangpum(Sangpum[] obj, int cnt)
		{
			int i;
			
			if(cnt == 0)
			{
				System.out.println("����� ��ǰ������ �����ϴ�!!\n");
				return;
			}
			
			System.out.println("      *** �Ǹ� ��Ȳ ***");
			System.out.println("========================");
			System.out.printf("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
			System.out.println("========================");
			for(i = 0; i<cnt; i++) 
			{
				obj[i].output();
			}		
			System.out.println("========================");
			System.out.println(" \t\t ���Ǳݾ�=" + Sangpum.print_total_price()+"\n");
		}	
}
