package chap05;

public class Ex10 {

	public static void main(String[] args) {
		
		for ( int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
				continue; // 5�� cnt++�� �̵�(�Ʒ� ���๮ �ǳʶ�)
			
			System.out.println(cnt);
		}
		System.out.println("Done");

		int ant = 0;
		while(ant < 10) {
			if(ant == 5)
				continue; //5��  (ant < 10) ���ǹ����� �ٽ� �̵�(���� ����)
			System.out.println(ant);
			ant++;
		
		}
		System.out.println("Done");
	}

}
