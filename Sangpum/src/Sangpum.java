import java.util.Scanner;

public class Sangpum {

	//�ʵ�//�⺻������ �ʱ�ȭ �ȴ�(�迭�� ���� - primitive(0) reference(null)
	String code, irum;
	int su, dan, price;
	String grade;
	static int total_price = 0;
	public Sangpum() {
		
	}
	
//	����Ʈ ������ - ���� �� �� �� �⺻ ������ / ��ȯ ���� ���� / ��ü ������ �ʱ�ȭ
	public Sangpum(String code, String irum) {
		this.code = code; 
		this.irum = irum;
		System.out.println("Sangpum(String code, String irum)");
	}
//  This is ������ overloading	(����, Ÿ��, ����(Ÿ�Ժ�)�� �ٸ���)
	public Sangpum(String code, String irum, int su) // ���μ�. ���� �Ű�����.
	{	  
		this(code, irum);
		this.su = su;
		System.out.println("Sangpum(String code, String irum, int su)");
	}
	
	public Sangpum(String code, String irum, int su, int dan) // ���μ�. ���� �Ű�����.
	{	  
//		this.code = code; 
//		this.irum = irum;
//		this.su = su;
		this(code,irum,su); //Line21 ������ ȣ��
		this.dan = dan;
		System.out.println("Sangpum(String code, String irum, int su, int dan)");
	}
	
	
	//method
	boolean input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��ǰ �ڵ� =>");
		this.code = scan.next();
			if(code.equals("exit"))
			return true;
		System.out.print("��ǰ �̸�=>");
		this.irum = scan.next();
		System.out.print("����=>");
		this.su= scan.nextInt();
		System.out.print("�ܰ�=>");
		this.dan= scan.nextInt();
		System.out.println();
		price = su*dan;
		return false;
	}
	
	void update()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���ο� ����");
		su =  scan.nextInt();
		
		System.out.println("���ο� �ܰ�");
		dan = scan.nextInt();
	}
	
	void process()
	{
		total_price += price;
		if(this.su >= 100) {
			this.grade = "���";
		}else if(su >= 70) {
			this.grade = "����";
		}else
			this.grade = "�й�";
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
