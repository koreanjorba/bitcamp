import java.util.Scanner;

public class Sangpum {

	//필드//기본값으로 초기화 된다(배열과 동일 - primitive(0) reference(null)
	String code, irum;
	int su, dan, price;
	String grade;
	static int total_price = 0;
	public Sangpum() {
		
	}
	
//	디폴트 생성자 - 생성 안 할 시 기본 생성됨 / 반환 값이 없다 / 객체 생성시 초기화
	public Sangpum(String code, String irum) {
		this.code = code; 
		this.irum = irum;
		System.out.println("Sangpum(String code, String irum)");
	}
//  This is 생성자 overloading	(개수, 타입, 순서(타입별)가 다르다)
	public Sangpum(String code, String irum, int su) // 가인수. 형식 매개변수.
	{	  
		this(code, irum);
		this.su = su;
		System.out.println("Sangpum(String code, String irum, int su)");
	}
	
	public Sangpum(String code, String irum, int su, int dan) // 가인수. 형식 매개변수.
	{	  
//		this.code = code; 
//		this.irum = irum;
//		this.su = su;
		this(code,irum,su); //Line21 생성자 호출
		this.dan = dan;
		System.out.println("Sangpum(String code, String irum, int su, int dan)");
	}
	
	
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
