package chap06;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// ���� �� ������ �Է� �޾� ���������� ū�� ���̿� �����ϴ� �Ҽ��� ���ؼ� ����ϴ� ���α׷� 
		// 1.���ٿ� �Ҽ��� 10���� ���
		// 2. �������� �� �Ҽ��� ������ ��� �� �յ� ���

		Scanner scan = new Scanner(System.in);
		
		//�� �Է¹ޱ�
		int a, b;
		System.out.println("a");
		a = scan.nextInt();
		System.out.println("b");
		b = scan.nextInt();
		
		//ū ��, ���� ��
		int min, max;
		if(a < b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		//3 �Ҽ����ϱ�
		int count = 0;
		int j = 0;
		int sum = 0;
		int i = 0;
		
		for( i = min; i <= max; i++) 
		{			
			for( j = 2; j < i; j++) 
			{	
				if( i % j == 0) 
					break; //�Ҽ��� �ƴ�
			}
			if(i == j) //�Ҽ���
			{
				sum += i;
				count++;
				System.out.printf("%5d  ", i);
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.printf("\nsum = %2d \nȽ����=  %2d", sum, count);
	}
}
