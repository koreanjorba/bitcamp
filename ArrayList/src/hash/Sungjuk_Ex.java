package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sungjuk_Ex {
//�л�����, ��ü ���
//�л����� �����ʵ� �̿�, ��ü ����� �����޼ҵ�� ���

	public static void main(String[] args) {
		int cnt = 0;
		int menu = 0;

		HashMap<String, Sungjuk> hashmap = new HashMap<String, Sungjuk>();
		// ArrayList<Sungjuk> obj = new ArrayList<Sungjuk>();
		Scanner scan = new Scanner(System.in);

		while (true) {
			printMenu();
			System.out.println("�Է��ϼ���");
			menu = scan.nextInt();
			if (menu == 6) {
				System.out.println("The End...");
				break;
			}
			switch (menu) {
			case 1:
				input_sungjuk(hashmap);
				break;
			case 2:
				output_sungjuk(hashmap);
				break;
			case 3: search_sungjuk(hashmap);
			break;
			case 4: update_sungjuk(hashmap);
			break;
			case 5: delete_sungjuk(hashmap);
			break;
			}
		}
	}

	static void printMenu() {
		System.out.println("*** �������� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����\n");
	}

	static void input_sungjuk(HashMap<String, Sungjuk> hashmap) {
		// ��ü �迭����
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.input();
		for(Sungjuk dat : hashmap.values()) {
			 if(dat.hakbun.equals(sungjuk.hakbun)) { 
				 System.out.println("�ڵ� �ߺ�");
				 return;
			 } 			
		 }
		sungjuk.process();
		hashmap.put(sungjuk.hakbun, sungjuk);
		System.out.println("\n�Է¼���?\n");
	}
	
	static void output_sungjuk(HashMap<String, Sungjuk> hashmap) {
		int i;
		System.out.println("\n       ***����ǥ***        ");
		System.out.println("==========================");
		System.out.println("�й�     �̸�      ����      ����      ����     ����      ���     ��� ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for (Sungjuk dat : hashmap.values()) {
			dat.output();
			Sungjuk.total_avg += dat.avg;
			Sungjuk.total_cnt = hashmap.size();
		}
		System.out.println("�� �л��� : " + hashmap.size());
		System.out.println("�� ���: " + Sungjuk.print_total_avg());
		System.out.println();
	}

	static void search_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner search = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String result = search.next();

		for (Sungjuk dat : hashmap.values()) {
			if (dat.hakbun.equals(result)) {
				System.out.println(" �й�     �̸�      ����      ����      ����     ����      ���     ���\n");
				System.out.println("========================");
				dat.output();
				System.out.println("========================\n\n");
				return;
			}
		}
		System.out.println("�ڵ����");
	}

	static void update_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String hakbun = scan.next();

		Sungjuk sungjuk = hashmap.get(hakbun);
		if(sungjuk != null) {
				sungjuk.update();
				sungjuk.process();
				System.out.println("��ǰ���� �Է¼���");
				return;
		}
		System.out.println("�Է¿���");
	}

	static void delete_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�й� �Է�");
		String result = scan.next();
		int i;
		for (Sungjuk dat : hashmap.values()) {
			if (result.equals(dat.hakbun)) {
				hashmap.remove(dat.hakbun); // �ش� �ּҰ�()�� ���� ����
				System.out.println("�������� ��������");
				return;
			}
		}
		System.out.println("�ڵ� ����");
	}
}
