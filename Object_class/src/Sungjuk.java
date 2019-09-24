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
		
		System.out.print("�й� �Է� => ");
		hakbun = scan.next();
		System.out.print("�̸� �Է� => ");
		irum = scan.next();
		System.out.print("���� �Է� => ");
		kor = scan.nextInt();
		System.out.print("���� �Է� => ");
		eng = scan.nextInt();
		System.out.print("���� �Է� => ");
		math = scan.nextInt();
	}
	
	void process()
	{
		tot = kor + eng + math;
		avg = tot / 3.;
				
		switch ((int)avg / 10) {
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
	}
	
	void output()
	{
		System.out.printf("%4s %3s  %3d  %3d  %3d  %3d %6.2f %2s\n",
			hakbun, irum, kor, eng, math, tot, avg, grade);
	}
	
	public String toString() {
		String str = "�й� : " + hakbun +
					"\n�̸� : " + irum + 
					"\n���� : " + kor + 
					"\n���� : " + eng + 
					"\n���� : " + math;
		
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