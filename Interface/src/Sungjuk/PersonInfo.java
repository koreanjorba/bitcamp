package Sungjuk;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable {

	String phone;
	String addr;
	
	@Override
	public boolean input() {
			Scanner scan = new Scanner(System.in);
			System.out.print("학번 입력=> ");
			this.hakbun = scan.next();
				if(hakbun.equals("exit"))
				return true;
			System.out.print("이름 입력=> ");
			this.irum = scan.next();
			System.out.print("번호 입력=> ");
			this.phone = scan.next();
			System.out.print("주소 입력=> ");
			this.addr = scan.next();
		
			return false;
		}
	@Override
	public void output() {
			System.out.printf("%4s  %3s  %s   %s   \n", 
					//6.2f 는 총 6자리, 소수점 2자리(반올림)
							hakbun, irum, phone, addr);
	}
	

}
