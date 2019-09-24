import java.util.ArrayList;
import java.util.Scanner;

public class Sanpum_Ex {
	static int MAX = 100;
	//static Sangpum_ sangpum;
	public static void main(String[] args) {
		int i = 0;	
		int menu = 0;
		
		ArrayList<Sangpum> obj = new ArrayList<Sangpum>();
	
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
					input_sangpum(obj);
					break;
				case 2:
					output_sangpum(obj);
					break;
				case 3:
					search_sangpum(obj);
					break;
				case 4:
					update_sangpum(obj);
					break;
				case 5:
					delete_sangpum(obj);
					break;
				default:
				}
			}
	}
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
		static void input_sangpum(ArrayList<Sangpum> list)
		{
		
			Sangpum sangpum = new Sangpum();
			sangpum.input();
			sangpum.process();
			
//			for(int i = 0; i < obj.size() ; i++) {
//				if(obj.get(i).code.equals(sangpum.code)) 
//				{			
//					System.out.println("�ڵ� �ߺ�");
//					return;
//				}
//			}
			for( Sangpum dat : list) {
				if(sangpum.code.equals(dat.code)) {
					System.out.println("\n�ߺ�����\n");
					return;
				}
			}
			list.add(sangpum);	//���� ������� sangpum �ּҰ��� obj ��̸���Ʈ�� add���ش�
			System.out.println("\n��ǰ���� �Է¼���\n");
			
		}
		static void output_sangpum(ArrayList<Sangpum> obj)
		{
			if(obj.size() == 0)
			{
				System.out.println("����� ��ǰ������ �����ϴ�!!\n");
				return;
			}
			System.out.println("      *** �Ǹ� ��Ȳ ***");
			System.out.println("========================");
			System.out.printf("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
			System.out.println("========================");
			Sangpum.total_price = 0;
			for(Sangpum dat : obj) 
			{
				dat.output();
				Sangpum.total_price += dat.price;
			}		
			System.out.println("========================");
			System.out.println(" \t\t ���Ǳݾ�=" + Sangpum.print_total_price()+"\n");
		}	
		static void search_sangpum(ArrayList<Sangpum> obj) 
		{
			Scanner search = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = search.next();
							
			for(Sangpum dat : obj) {
				if(dat.code.equals(result)) {
					System.out.println("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
					System.out.println("========================");
					dat.output();
					System.out.println("========================\n\n");
					return;
				}
			}
			System.out.println("�ڵ����");
		}
		static void update_sangpum(ArrayList<Sangpum> obj) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = scan.next();
			
			for(Sangpum dat : obj) {
				if(result.equals(dat.code)) 
				{					
					dat.update();
					//dat.process();
					System.out.println("��ǰ���� �Է¼���");
					return;
				}
			}
			System.out.println("�Է¿���");
		}
		static void delete_sangpum(ArrayList<Sangpum> obj)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("��ǰ�ڵ� �Է�");
			String result = scan.next();
			int i;
			for(Sangpum dat : obj) {
				if(result.equals(dat.code)) { 
					obj.remove(dat);			//�ش� �ּҰ�(dat)�� ���� ����
					System.out.println("��ǰ���� ��������");
					return;
				}
			}
			System.out.println("�ڵ� ����");
		}
}
