package Sungjuk;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable {

	String phone;
	String addr;
	
	@Override
	public boolean input() {
			Scanner scan = new Scanner(System.in);
			System.out.print("�й� �Է�=> ");
			this.hakbun = scan.next();
				if(hakbun.equals("exit"))
				return true;
			System.out.print("�̸� �Է�=> ");
			this.irum = scan.next();
			System.out.print("��ȣ �Է�=> ");
			this.phone = scan.next();
			System.out.print("�ּ� �Է�=> ");
			this.addr = scan.next();
		
			return false;
		}
	@Override
	public void output() {
			System.out.printf("%4s  %3s  %s   %s   \n", 
					//6.2f �� �� 6�ڸ�, �Ҽ��� 2�ڸ�(�ݿø�)
							hakbun, irum, phone, addr);
	}
	

}
