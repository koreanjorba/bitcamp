package chapt04;

import java.util.Scanner;

public class scan_if {

	public static void main(String[] args) {
		
		String hakbun, irum;
		int kor, eng, math, tot;
		double avg;
		String grade; //지역 변수는 초기화
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력=> ");
		hakbun = scan.next();
		System.out.print("이름 입력=> ");
		irum = scan.next();
		System.out.print("국어 입력=> ");
		kor = scan.nextInt();
		System.out.print("영어 입력=> ");
		eng = scan.nextInt();
		System.out.print("수학 입력=> ");
		math = scan.nextInt();

		
		tot = kor + eng + math;
		avg = (tot / 3.0);
//		
//		if ( avg >= 90 && 100 <= avg) {
//			grade = "수";
//		}else if (avg >= 80 && 90 < avg) {
//			grade = "우";
//		}else if( avg >= 70 && 80 < avg) {
//			grade = "미";
//		}else if( avg >= 60 && 70< avg) {
//			grade = "양";
//		}else 
//			grade = "가";
		
			

		
		switch((int)avg/10) {
		case 10:
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		case 6:
			grade = "양";
			break;
		default:
			grade = "가";
			break;
							
		}
		
		System.out.println("\n       ***성적표***        ");
		System.out.println("==========================");
		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급");
		System.out.println("==========================");
		System.out.printf("%4s  %3s  %3d  %3d  %3d  %4d  %d %s\n", 
				//6.2f 는 총 6자리, 소수점 2자리(반올림)
				hakbun, irum, kor, eng, math, tot, avg, grade);
		System.out.println(" =========================");
		
		
	
	}
	
	
}
