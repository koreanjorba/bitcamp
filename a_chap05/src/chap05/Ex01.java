package chap05;

public class Ex01 {

	public static void main(String[] args) {
		
//		for(int cnt = 0; cnt < 10; cnt++) {
//			System.out.println(cnt);
//		}
//		System.out.println("done");
	
//		int cunt = 0;
//		while(cunt <= 10) {
//			System.out.println(cunt);
//			cunt++;
//		}
		
//		int cnt = 0;	//선언, 초기화
//		while(true) {	//조건식
//			if(cnt >10)	//조건식
//				break;
//			System.out.println(cnt);//실행문
//			cnt++;		//증감문
//		}
		
		int cnt = 0;
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt < 10);
		System.out.println("Done");
		
		
//		int sum = 0;
//		int i = 0;
//		for( i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println("1~" + (i-1) + " 합: " + sum);
		
//		int odd = 0, even = 0;
//		int i = 0;
//		for( i = 1; i <= 100; i++) {
//			if( i%2 != 0)
//				odd += i;
//			else
//				even += i;
//		}
//		System.out.println("1~" + (i-1) + "짝수 합: " + even);
//			
//		System.out.println("1~" + (i-1) + "홀수 합: " + odd);
		
		int odd = 0, even = 0;
		int i = 1;
		for(; ; ) {
			if ( i <= 100) {
				if(( i % 2 ) != 0)
					odd += i;
				else
					even += i;
				i++;
			}else
				break;
		}
		System.out.println("1~" + (i-1) + "짝수 합: " + even);
			
		System.out.println("1~" + (i-1) + "홀수 합: " + odd);
		
	}
}
	
