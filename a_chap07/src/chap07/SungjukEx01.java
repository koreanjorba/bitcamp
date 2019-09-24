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
			System.out.print("학번 입력=> ");
			hakbun[i] = scan.next();
		
			if( hakbun[i].equals("exit")) break;
			
			System.out.print("이름 입력=> ");
			irum[i] = scan.next();
			System.out.print("국어 입력=> ");
			kor[i] = scan.nextInt();
			System.out.print("영어 입력=> ");
			eng[i] = scan.nextInt();
			System.out.print("수학 입력=> ");
			math[i] = scan.nextInt();
			
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3.;
		
			switch((int)avg[i]/10) {
				case 9:
					grade[i] = "수";
					break;
				case 8:
					grade[i] = "우";
					break;
				case 7:
					grade[i] = "미";
					break;
				case 6:
					grade[i] = "양";
					break;
				case 5:
					grade[i] = "가";
					break;
					
			}
			cnt++;
			System.out.println();
		}
		
		
		System.out.println("\n       ***성적표***        ");
		System.out.println(" ========================");
		System.out.println("학번  이름  국어  영어  수학  총점  평균 등급");
		System.out.println("=========================");
		for(i = 0; i< cnt; i++) {
		System.out.printf("%4s  %3s  %3d  %3d  %3d  %4d  %6.2f %s\n", 
				//6.2f 는 총 6자리, 소수점 2자리(반올림)
				hakbun[i], irum[i], kor[i], eng[i], math[i], tot[i], avg[i], grade[i]);
		}
		System.out.println(" =========================");
		
//		int arr[] = new int[3];
//		int arr1[];
//		arr1 = new int[3];
		
		//str 100 >>>>  str[0]  str[1]  str[2]
//						200번지     300번지     400번지	
		//				
				
		
	}
}
