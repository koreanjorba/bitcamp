
import java.util.ArrayList;
import java.util.Scanner;

public class Sungjuk_Ex {
//학생수와, 전체 평균
//학생수는 정적필드 이용, 전체 평균은 정적메소드로 출력
	
	public static void main(String[] args) 
	{		
		int cnt = 0;
		int menu = 0;
		
		ArrayList<Sungjuk> obj = new ArrayList<Sungjuk>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("입력하세요");
			menu = scan.nextInt();
			if( menu == 6) {
				System.out.println("The End...");
				break;
			}
			switch(menu) {
			case 1: input_sungjuk(obj);
			break;
			case 2: output_sungjuk(obj);
			break;
			case 3: search_sungjuk(obj);
			break;
			case 4: update_sungjuk(obj);
			break;
			case 5: delete_sungjuk(obj);
			break;
			}
		}
	}
	static void printMenu() 
	{	System.out.println("*** 성적관리 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 성적정보 출력");
		System.out.println("3. 성적정보 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료\n");
	}
	static void input_sungjuk(ArrayList<Sungjuk> list)
	{
		//객체 배열생성
		Sungjuk sungjuk = new Sungjuk(); // cnt를 매개변수로 받는 obj 객체 생성?
		sungjuk.input();
		
		for(Sungjuk dat : list) //arraylist에 있는 주소를 dat에 하나씩 대입	
		{
			if(dat.hakbun.equals(sungjuk.hakbun)) {
				System.out.println("코드 중복");
				return;
			}
		}
		sungjuk.process();
		list.add(sungjuk);
		
		System.out.println("입력성공?");
		//Sungjuk.total_cnt++;
		
	}
	static void output_sungjuk(ArrayList<Sungjuk> list) 
	{
		int i ;
		System.out.println("\n       ***성적표***        ");
		System.out.println("==========================");
		System.out.println("학번     이름      국어      영어      수학     총점      평균     등급 ");
		System.out.println("==========================");
		Sungjuk.total_avg = 0;
		for(Sungjuk dat : list) 
		{
			dat.output();
			Sungjuk.total_avg += dat.avg;
			Sungjuk.total_cnt = list.size();
		}
		System.out.println("총 학생수 : " + list.size());
		System.out.println("총 평균: " + Sungjuk.print_total_avg());
		System.out.println();
	}
	static void search_sungjuk(ArrayList<Sungjuk> list) 
	{
		Scanner search = new Scanner(System.in);
		System.out.println("학번 입력");
		String result = search.next();
						
		for(Sungjuk dat : list) {
			if(dat.hakbun.equals(result)) {
				System.out.println(" 학번     이름      국어      영어      수학     총점      평균     등급\n");
				System.out.println("========================");
				dat.output();
				System.out.println("========================\n\n");
				return;
			}
		}
		System.out.println("코드오류");
	}
	static void update_sungjuk(ArrayList<Sungjuk> list) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력");
		String result = scan.next();
		
		for(Sungjuk dat : list) {
			if(result.equals(dat.hakbun)) 
			{					
				dat.update();
				System.out.println("상품정보 입력성공");
				return;
			}
		}
		System.out.println("입력오류");
	}
	static void delete_sungjuk(ArrayList<Sungjuk> list)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("학번 입력");
		String result = scan.next();
		int i;
		for(Sungjuk dat : list) {
			if(result.equals(dat.hakbun)) { 
				list.remove(dat);			//해당 주소값(dat)을 통해 제거
				System.out.println("성적정보 삭제성공");
				return;
			}
		}
		System.out.println("코드 오류");
	}
}
