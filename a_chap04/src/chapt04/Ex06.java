package chapt04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0;
		if (++num1 > 0 || ++num2 > 0) //num2 no execute
			System.out.println("num1�� 0���� ũ�ų� num2�� 0���� Ů�ϴ�.");
 		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2); //num2 = 0
	}

}
