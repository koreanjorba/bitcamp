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
		System.out.print("학번 입력=> ");
		
		this.hakbun = scan.next();
			if(hakbun.equals("exit"))
			return true;
		System.out.print("이름 입력=> ");
		this.irum = scan.next();
		System.out.print("국어 입력=> ");
		this.kor = scan.nextInt();
		System.out.print("영어 입력=> ");
		this.eng = scan.nextInt();
		System.out.print("수학 입력=> ");
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
			this.grade = "수";
			break;
		case 8:
			this.grade = "우";
			break;
		case 7:
			this.grade = "미";
			break;
		case 6:
			this.grade = "양";
			break;
		default:
			this.grade = "가";
			break;		
		}
	}
	void output()
	{
		System.out.printf("%4s  %3s  %3d   %3d   %3d  %4d   %.2f  %s\n", 
				//6.2f 는 총 6자리, 소수점 2자리(반올림)
						hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	void update()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("새로운 국어");
		kor =  scan.nextInt();
		
		System.out.println("새로운 영어");
		eng = scan.nextInt();
		
		System.out.println("새로운 수학");
		math = scan.nextInt();
	}
	static double print_total_avg() 
	{
		return total_avg / total_cnt;
	}
}
