package egoing;

class Calculator{
	
	static double PI = 3.14;	//클래스 멤버
	static int base = 0;
	int left, right;
	
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	public void avg() {
		System.out.println((this.left + this.right + base)/2);
	}
}

public class CalDemo {

 
	public static void main(String[] args) {
		
		
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		System.out.println(c1.PI);			//인스턴스를 통한 접근
		
//		Calculator c2 = new Calculator();
//		c2.setOperands(10, 20);
//		c2.sum();
//		c2.avg();
		
		Calculator.base = 10;
		
		c1.sum();
		
		
		
		System.out.println(Calculator.PI);	//클래스를 통한 접근(메소드 안 씀)
	
		
	}

}
