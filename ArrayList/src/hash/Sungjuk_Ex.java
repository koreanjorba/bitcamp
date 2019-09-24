package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sungjuk_Ex {
//학생수와, 전체 평균
//학생수는 정적필드 이용, 전체 평균은 정적메소드로 출력

	public static void main(String[] args) {
		int cnt = 0;
		int menu = 0;

		HashMap<String, Sungjuk> hashmap = new HashMap<String, Sungjuk>();
		// ArrayList<Sungjuk> obj = new ArrayList<Sungjuk>();
		Scanner scan = new Scanner(System.in);

		while (true) {
			printMenu();
			System.out.println("입력하세요");
			menu = scan.nextInt();
			if (menu == 6) {
				System.out.println("The End...");
				break;
			}
			switch (menu) {
			case 1:
				input_sungjuk(hashmap);
				break;
			case 2:
				output_sungjuk(hashmap);
				break;
			case 3: search_sungjuk(hashmap);
			break;
			case 4: update_sungjuk(hashmap);
			break;
			case 5: delete_sungjuk(hashmap);
			break;
			}
		}
	}

	static void printMenu() {
		System.out.println("*** 성적관리 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 성적정보 출력");
		System.out.println("3. 성적정보 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료\n");
	}

	static void input_sungjuk(HashMap<String, Sungjuk> hashmap) {
		// 객체 배열생성
		Sungjuk sungjuk = new Sungjuk();
		sungjuk.input();
		for(Sungjuk dat : hashmap.values()) {
			 if(dat.hakbun.equals(sungjuk.hakbun)) { 
				 System.out.println("코드 중복");
				 return;
			 } 			
		 }
		sungjuk.process();
		hashmap.put(sungjuk.hakbun, sungjuk);
		System.out.println("\n입력성공?\n");
	}
	
	static void output_sungjuk(HashMap<String, Sungjuk> hashmap) {
		int i;
		System.out.println("\n       ***성적표***        ");
		System.out.println("==========================");
		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급 ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for (Sungjuk dat : hashmap.values()) {
			dat.output();
			Sungjuk.total_avg += dat.avg;
			Sungjuk.total_cnt = hashmap.size();
		}
		System.out.println("총 학생수 : " + hashmap.size());
		System.out.println("총 평균: " + Sungjuk.print_total_avg());
		System.out.println();
	}

	static void search_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner search = new Scanner(System.in);
		System.out.println("학번 입력");
		String result = search.next();

		for (Sungjuk dat : hashmap.values()) {
			if (dat.hakbun.equals(result)) {
				System.out.println(" 학번     이름      국어      영어      수학     총점      평균     등급\n");
				System.out.println("========================");
				dat.output();
				System.out.println("========================\n\n");
				return;
			}
		}
		System.out.println("코드오류");
	}

	static void update_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력");
		String hakbun = scan.next();

		Sungjuk sungjuk = hashmap.get(hakbun);
		if(sungjuk != null) {
				sungjuk.update();
				sungjuk.process();
				System.out.println("상품정보 입력성공");
				return;
		}
		System.out.println("입력오류");
	}

	static void delete_sungjuk(HashMap<String, Sungjuk> hashmap) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력");
		String result = scan.next();
		int i;
		for (Sungjuk dat : hashmap.values()) {
			if (result.equals(dat.hakbun)) {
				hashmap.remove(dat.hakbun); // 해당 주소값()을 통해 제거
				System.out.println("성적정보 삭제성공");
				return;
			}
		}
		System.out.println("코드 오류");
	}
}
