import java.util.Scanner;

public class Sangpum {

	//필드//기본값으로 초기화 된다(배열과 동일 - primitive(0) reference(null)
	String code, irum;
	int su, dan, price;
	String grade;
	static int total_price = 0;
	public Sangpum() {	}
	//method
	boolean input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("상품 코드 =>");
		this.code = scan.next();
			if(code.equals("exit"))
			return true;
		System.out.print("상품 이름=>");
		this.irum = scan.next();
		System.out.print("수량=>");
		this.su= scan.nextInt();
		System.out.print("단가=>");
		this.dan= scan.nextInt();
		System.out.println();
		price = su*dan;
		return false;
	}
	
	void update()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("새로운 수량");
		su =  scan.nextInt();
		
		System.out.println("새로운 단가");
		dan = scan.nextInt();
	}
	
	void process()
	{
		total_price += price;
		if(this.su >= 100) {
			this.grade = "우수";
		}else if(su >= 70) {
			this.grade = "보통";
		}else
			this.grade = "분발";
	}
	
	void output()
	{
	System.out.printf("%4s %4s %3d %d %d  %s\n", code, irum,
			su, dan, price, grade);
	}
	
	static int print_total_price() 
	{
		return total_price;
	}
}
