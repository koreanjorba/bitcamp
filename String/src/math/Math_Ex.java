package math;

import java.util.Random;

public class Math_Ex {

	public static void main(String[] args) {
		System.out.println(Math.pow(2,3));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.max(3, 7));
		System.out.println(Math.min(3,7));
		
		Random random = new Random(); //�� ������ ��� ����, ���ָ� ���� ���� ���
		
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}

}
