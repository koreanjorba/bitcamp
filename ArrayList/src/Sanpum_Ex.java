import java.util.ArrayList;
import java.util.Scanner;

public class Sanpum_Ex {
	static int MAX = 100;
	//static Sangpum_ sangpum;
	public static void main(String[] args) {
		int i = 0;	
		int menu = 0;
		
		ArrayList<Sangpum> obj = new ArrayList<Sangpum>();
	
		Scanner scan = new Scanner(System.in);
				
			while(true) 
			{	 printMenu();
				 System.out.println("메뉴선택");
				 menu = scan.nextInt();
				 System.out.println();
					
				if( menu == 6) {
					System.out.println("The End...");
					break;
				}
				switch(menu)
				{
				case 1:
					input_sangpum(obj);
					break;
				case 2:
					output_sangpum(obj);
					break;
				case 3:
					search_sangpum(obj);
					break;
				case 4:
					update_sangpum(obj);
					break;
				case 5:
					delete_sangpum(obj);
					break;
				default:
				}
			}
	}
		static void printMenu() 
		{
			System.out.println("*** 상품관리 ***");
			System.out.println("1. 상품정보 입력");
			System.out.println("2. 상품정보 출력");
			System.out.println("3. 상품정보 조회");
			System.out.println("4. 상품정보 수정");
			System.out.println("5. 상품정보 삭제");
			System.out.println("6. 프로그램 종료\n");
	
		}
		static void input_sangpum(ArrayList<Sangpum> list)
		{
		
			Sangpum sangpum = new Sangpum();
			sangpum.input();
			sangpum.process();
			
//			for(int i = 0; i < obj.size() ; i++) {
//				if(obj.get(i).code.equals(sangpum.code)) 
//				{			
//					System.out.println("코드 중복");
//					return;
//				}
//			}
			for( Sangpum dat : list) {
				if(sangpum.code.equals(dat.code)) {
					System.out.println("\n중복오류\n");
					return;
				}
			}
			list.add(sangpum);	//새로 만들어진 sangpum 주소값을 obj 어레이리스트에 add해준다
			System.out.println("\n상품정보 입력성공\n");
			
		}
		static void output_sangpum(ArrayList<Sangpum> obj)
		{
			if(obj.size() == 0)
			{
				System.out.println("출력할 상품정보가 없습니다!!\n");
				return;
			}
			System.out.println("      *** 판매 현황 ***");
			System.out.println("========================");
			System.out.printf("   코드     이름   수량    단가   금액  평가\n");
			System.out.println("========================");
			Sangpum.total_price = 0;
			for(Sangpum dat : obj) 
			{
				dat.output();
				Sangpum.total_price += dat.price;
			}		
			System.out.println("========================");
			System.out.println(" \t\t 총판금액=" + Sangpum.print_total_price()+"\n");
		}	
		static void search_sangpum(ArrayList<Sangpum> obj) 
		{
			Scanner search = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = search.next();
							
			for(Sangpum dat : obj) {
				if(dat.code.equals(result)) {
					System.out.println("   코드     이름   수량    단가   금액  평가\n");
					System.out.println("========================");
					dat.output();
					System.out.println("========================\n\n");
					return;
				}
			}
			System.out.println("코드오류");
		}
		static void update_sangpum(ArrayList<Sangpum> obj) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = scan.next();
			
			for(Sangpum dat : obj) {
				if(result.equals(dat.code)) 
				{					
					dat.update();
					//dat.process();
					System.out.println("상품정보 입력성공");
					return;
				}
			}
			System.out.println("입력오류");
		}
		static void delete_sangpum(ArrayList<Sangpum> obj)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = scan.next();
			int i;
			for(Sangpum dat : obj) {
				if(result.equals(dat.code)) { 
					obj.remove(dat);			//해당 주소값(dat)을 통해 제거
					System.out.println("상품정보 삭제성공");
					return;
				}
			}
			System.out.println("코드 오류");
		}
}
