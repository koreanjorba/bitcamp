import java.util.Scanner;

public class Sungjuk {
	String hakbun, irum;
	int kor, eng, math, tot;
	double avg;
	String grade;
	
	public Sungjuk() {
		
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번 입력 => ");
		hakbun = scan.next();
		System.out.print("이름 입력 => ");
		irum = scan.next();
		System.out.print("국어 입력 => ");
		kor = scan.nextInt();
		System.out.print("영어 입력 => ");
		eng = scan.nextInt();
		System.out.print("수학 입력 => ");
		math = scan.nextInt();
	}
	
	void process()
	{
		tot = kor + eng + math;
		avg = tot / 3.;
				
		switch ((int)avg / 10) {
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
	}
	
	void output()
	{
		System.out.printf("%4s %3s  %3d  %3d  %3d  %3d %6.2f %2s\n",
			hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
	public String toString() {
		String str = "학번 : " + hakbun +
					"\n이름 : " + irum + 
					"\n국어 : " + kor + 
					"\n영어 : " + eng + 
					"\n수학 : " + math;
		
		return str;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Sungjuk))
			return false;
		Sungjuk sung = (Sungjuk) obj;
		if(hakbun.equals(sung.hakbun)  && irum.equals(sung.irum) && kor == sung.kor 
				&& eng == sung.eng && math == sung.math)
			return true;
		else
			return false;
	}
	

}