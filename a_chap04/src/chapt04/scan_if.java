package chapt04;

import java.util.Scanner;

public class scan_if {

	public static void main(String[] args) {
		
		String hakbun, irum;
		int kor, eng, math, tot;
		double avg;
		String grade; //���� ������ �ʱ�ȭ
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�й� �Է�=> ");
		hakbun = scan.next();
		System.out.print("�̸� �Է�=> ");
		irum = scan.next();
		System.out.print("���� �Է�=> ");
		kor = scan.nextInt();
		System.out.print("���� �Է�=> ");
		eng = scan.nextInt();
		System.out.print("���� �Է�=> ");
		math = scan.nextInt();

		
		tot = kor + eng + math;
		avg = (tot / 3.0);
//		
//		if ( avg >= 90 && 100 <= avg) {
//			grade = "��";
//		}else if (avg >= 80 && 90 < avg) {
//			grade = "��";
//		}else if( avg >= 70 && 80 < avg) {
//			grade = "��";
//		}else if( avg >= 60 && 70< avg) {
//			grade = "��";
//		}else 
//			grade = "��";
		
			

		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = "��";
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		case 6:
			grade = "��";
			break;
		default:
			grade = "��";
			break;
							
		}
		
		System.out.println("\n       ***����ǥ***        ");
		System.out.println("==========================");
		System.out.println("�й�     �̸�      ����      ����      ����     ����      ���     ���");
		System.out.println("==========================");
		System.out.printf("%4s  %3s  %3d  %3d  %3d  %4d  %d %s\n", 
				//6.2f �� �� 6�ڸ�, �Ҽ��� 2�ڸ�(�ݿø�)
				hakbun, irum, kor, eng, math, tot, avg, grade);
		System.out.println(" =========================");
		
		
	
	}
	
	
}
