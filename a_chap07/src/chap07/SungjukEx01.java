package chap07;
import java.util.Scanner;

public class SungjukEx01 {
	
	static int MAX = 2;
	public static void main(String[] args) {
		
		int i, cnt = 0;
		String[] hakbun = new String[MAX];
		String[] irum = new String[MAX];
		int[] kor = new int[MAX];
		int[] eng = new int[MAX];
		int[] math = new int[MAX];
		int[] tot = new int[MAX];
		double[] avg = new double[MAX];
		String[] grade = new String[MAX];
		
		Scanner scan = new Scanner(System.in);
		
		for(i = 0; i < MAX; i++) {
			System.out.print("�й� �Է�=> ");
			hakbun[i] = scan.next();
		
			if( hakbun[i].equals("exit")) break;
			
			System.out.print("�̸� �Է�=> ");
			irum[i] = scan.next();
			System.out.print("���� �Է�=> ");
			kor[i] = scan.nextInt();
			System.out.print("���� �Է�=> ");
			eng[i] = scan.nextInt();
			System.out.print("���� �Է�=> ");
			math[i] = scan.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.;
		
			switch((int)avg[i]/10) {
				case 9:
					grade[i] = "��";
					break;
				case 8:
					grade[i] = "��";
					break;
				case 7:
					grade[i] = "��";
					break;
				case 6:
					grade[i] = "��";
					break;
				case 5:
					grade[i] = "��";
					break;
					
			}
			cnt++;
			System.out.println();
		}
		
		
		System.out.println("\n       ***����ǥ***        ");
		System.out.println(" ========================");
		System.out.println("�й�  �̸�  ����  ����  ����  ����  ��� ���");
		System.out.println("=========================");
		for(i = 0; i< cnt; i++) {
		System.out.printf("%4s  %3s  %3d  %3d  %3d  %4d  %6.2f %s\n", 
				//6.2f �� �� 6�ڸ�, �Ҽ��� 2�ڸ�(�ݿø�)
				hakbun[i], irum[i], kor[i], eng[i], math[i], tot[i], avg[i], grade[i]);
		}
		System.out.println(" =========================");
		
//		int arr[] = new int[3];
//		int arr1[];
//		arr1 = new int[3];
		
		//str 100 >>>>  str[0]  str[1]  str[2]
//						200����     300����     400����	
		//				
				
		
	}
}
