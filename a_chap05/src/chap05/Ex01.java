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
		
//		int cnt = 0;	//����, �ʱ�ȭ
//		while(true) {	//���ǽ�
//			if(cnt >10)	//���ǽ�
//				break;
//			System.out.println(cnt);//���๮
//			cnt++;		//������
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
//		System.out.println("1~" + (i-1) + " ��: " + sum);
		
//		int odd = 0, even = 0;
//		int i = 0;
//		for( i = 1; i <= 100; i++) {
//			if( i%2 != 0)
//				odd += i;
//			else
//				even += i;
//		}
//		System.out.println("1~" + (i-1) + "¦�� ��: " + even);
//			
//		System.out.println("1~" + (i-1) + "Ȧ�� ��: " + odd);
		
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
		System.out.println("1~" + (i-1) + "¦�� ��: " + even);
			
		System.out.println("1~" + (i-1) + "Ȧ�� ��: " + odd);
		
	}
}
	
