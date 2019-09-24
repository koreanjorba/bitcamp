package chap06;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 임의 두 정수를 입력 받아 작은수에서 큰수 사이에 존재하는 소수를 구해서 출력하는 프로그램 
		// 1.한줄에 소수를 10개씩 출력
		// 2. 마지막에 총 소수의 갯수를 출력 후 합도 출력

		Scanner scan = new Scanner(System.in);
		
		//값 입력받기
		int a, b;
		System.out.println("a");
		a = scan.nextInt();
		System.out.println("b");
		b = scan.nextInt();
		
		//큰 수, 작은 수
		int min, max;
		if(a < b) {
			min = a;
			max = b;
		}else {
			min = b;
			max = a;
		}
		
		//3 소수구하기
		int count = 0;
		int j = 0;
		int sum = 0;
		int i = 0;
		
		for( i = min; i <= max; i++) 
		{			
			for( j = 2; j < i; j++) 
			{	
				if( i % j == 0) 
					break; //소수가 아닌
			}
			if(i == j) //소수인
			{
				sum += i;
				count++;
				System.out.printf("%5d  ", i);
				if(count % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		System.out.printf("\nsum = %2d \n횟수는=  %2d", sum, count);
	}
}
