
import java.util.ArrayList;
import java.util.Scanner;

public class Sungjuk_Ex {
//�л�����, ��ü ���
//�л����� �����ʵ� �̿�, ��ü ����� �����޼ҵ�� ���
	
	public static void main(String[] args) 
	{		
		int cnt = 0;
		int menu = 0;
		
		ArrayList<Sungjuk> obj = new ArrayList<Sungjuk>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("�Է��ϼ���");
			menu = scan.nextInt();
			if( menu == 6) {
				System.out.println("The End...");
				break;
			}
			switch(menu) {
			case 1: input_sungjuk(obj);
			break;
			case 2: output_sungjuk(obj);
			break;
			case 3: search_sungjuk(obj);
			break;
			case 4: update_sungjuk(obj);
			break;
			case 5: delete_sungjuk(obj);
			break;
			}
		}
	}
	static void printMenu() 
	{	System.out.println("*** �������� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����\n");
	}
	static void input_sungjuk(ArrayList<Sungjuk> list)
	{
		//��ü �迭����
		Sungjuk sungjuk = new Sungjuk(); // cnt�� �Ű������� �޴� obj ��ü ����?
		sungjuk.input();
		
		for(Sungjuk dat : list) //arraylist�� �ִ� �ּҸ� dat�� �ϳ��� ����	
		{
			if(dat.hakbun.equals(sungjuk.hakbun)) {
				System.out.println("�ڵ� �ߺ�");
				return;
			}
		}
		sungjuk.process();
		list.add(sungjuk);
		
		System.out.println("�Է¼���?");
		//Sungjuk.total_cnt++;
		
	}
	static void output_sungjuk(ArrayList<Sungjuk> list) 
	{
		int i ;
		System.out.println("\n       ***����ǥ***        ");
		System.out.println("==========================");
		System.out.println("�й�     �̸�      ����      ����      ����     ����      ���     ��� ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for(Sungjuk dat : list) 
		{
			dat.output();
			Sungjuk.total_avg += dat.avg;
			Sungjuk.total_cnt = list.size();
		}
		System.out.println("�� �л��� : " + list.size());
		System.out.println("�� ���: " + Sungjuk.print_total_avg());
		System.out.println();
	}
	static void search_sungjuk(ArrayList<Sungjuk> list) 
	{
		Scanner search = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String result = search.next();
						
		for(Sungjuk dat : list) {
			if(dat.hakbun.equals(result)) {
				System.out.println(" �й�     �̸�      ����      ����      ����     ����      ���     ���\n");
				System.out.println("========================");
				dat.output();
				System.out.println("========================\n\n");
				return;
			}
		}
		System.out.println("�ڵ����");
	}
	static void update_sungjuk(ArrayList<Sungjuk> list) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String result = scan.next();
		
		for(Sungjuk dat : list) {
			if(result.equals(dat.hakbun)) 
			{					
				dat.update();
				System.out.println("��ǰ���� �Է¼���");
				return;
			}
		}
		System.out.println("�Է¿���");
	}
	static void delete_sungjuk(ArrayList<Sungjuk> list)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String result = scan.next();
		int i;
		for(Sungjuk dat : list) {
			if(result.equals(dat.hakbun)) { 
				list.remove(dat);			//�ش� �ּҰ�(dat)�� ���� ����
				System.out.println("�������� ��������");
				return;
			}
		}
		System.out.println("�ڵ� ����");
	}
}
