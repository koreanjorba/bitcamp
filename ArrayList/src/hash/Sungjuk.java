package hash;

import java.util.Scanner;

public class Sungjuk {

	String hakbun, irum, grade ;
	int kor, eng, math, tot;
	double avg;
	static double total_avg;
	static int total_cnt = 0;
	
	boolean input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�й� �Է�=> ");
		
		this.hakbun = scan.next();
			if(hakbun.equals("exit"))
			return true;
		System.out.print("�̸� �Է�=> ");
		this.irum = scan.next();
		System.out.print("���� �Է�=> ");
		this.kor = scan.nextInt();
		System.out.print("���� �Է�=> ");
		this.eng = scan.nextInt();
		System.out.print("���� �Է�=> ");
		this.math = scan.nextInt();
		
		return false;
	}
	void process() {
		tot = kor + eng + math;
		avg = (tot / 3.0);
//		total_avg += avg;
		
		switch((int)avg/10) {
		case 10:
		case 9:
			this.grade = "��";
			break;
		case 8:
			this.grade = "��";
			break;
		case 7:
			this.grade = "��";
			break;
		case 6:
			this.grade = "��";
			break;
		default:
			this.grade = "��";
			break;		
		}
	}
	void output()
	{
		System.out.printf("%4s  %3s  %3d   %3d   %3d  %4d   %.2f  %s\n", 
				//6.2f �� �� 6�ڸ�, �Ҽ��� 2�ڸ�(�ݿø�)
						hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	void update()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���ο� ����");
		kor =  scan.nextInt();
		
		System.out.println("���ο� ����");
		eng = scan.nextInt();
		
		System.out.println("���ο� ����");
		math = scan.nextInt();
	}
	static double print_total_avg() 
	{
		return total_avg / total_cnt;
	}
}
