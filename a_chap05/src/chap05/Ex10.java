package chap05;

public class Ex10 {

	public static void main(String[] args) {
		
		for ( int cnt = 0; cnt < 10; cnt++) {
			if (cnt == 5)
				continue; // 5면 cnt++로 이동(아래 실행문 건너뜀)
			
			System.out.println(cnt);
		}
		System.out.println("Done");

		int ant = 0;
		while(ant < 10) {
			if(ant == 5)
				continue; //5면  (ant < 10) 조건문으로 다시 이동(무한 루프)
			System.out.println(ant);
			ant++;
		
		}
		System.out.println("Done");
	}

}
