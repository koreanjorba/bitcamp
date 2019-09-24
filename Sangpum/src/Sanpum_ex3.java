import java.util.Scanner;

public class Sanpum_ex3 {
	static int MAX = 100;
	public static void main(String[] args) {
		int i = 0;
		int cnt = 0;
		int menu = 0;
		Sangpum[] obj = new Sangpum[100] ; // obj - 클래스 변수?
		
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
					cnt = input_sangpum(obj, cnt);
					break;
				case 2:
					output_sangpum(obj, cnt);
					break;
				case 3:
					search_sangpum(obj, cnt);
					break;
				case 4:
					update_sangpum(obj, cnt);
					break;
				case 5:
					cnt = delete_sangpum(obj, cnt);
					break;
				default:
				}
			}
	}

	
//	cnt = input_sangpum(obj);
//	output_sangpum(obj, cnt);
//	System.out.println(obj);

	
	
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
		static int delete_sangpum(Sangpum[] obj, int cnt)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = scan.next();
			
				for(int i = 0; i < cnt; i++) {
					if(result.equals(obj[i].code)) 
					{
						for(int j=i; j<cnt-1; j++) {
							obj[j] = obj[j+1];
						}
					}
//					cnt--;
//					return cnt;
					System.out.println("상품정보 삭제성공");
					return cnt -1;
				}
				System.out.println("코드 오류");
				return cnt;
				
		}
		
		static void update_sangpum(Sangpum[] obj, int cnt) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = scan.next();
			
			for(int i = 0; i < cnt; i++) {
				if(result.equals(obj[i].code)) 
				{					
					obj[i].update();
					obj[i].process();
					System.out.println("상품정보 입력성공");
					return;
				}
			}
			System.out.println("입력오류");
		}
		
		static void search_sangpum(Sangpum[] obj, int cnt) 
		{
			Scanner search = new Scanner(System.in);
			System.out.println("상품코드 입력");
			String result = search.next();
							
			for(int i = 0; i < cnt; i++) {
				if(result.equals(obj[i].code)) 
				{			
					System.out.println("   코드     이름   수량    단가   금액  평가\n");
					System.out.println("========================");
					obj[i].output();
					System.out.println("========================\n\n");
					return;
				} 
			}
			System.out.println("코드오류");
				
		}
		
		
		
		static int input_sangpum(Sangpum[] obj, int cnt)   //지역변수
		{
			obj[cnt] = new Sangpum(); 						//지역변수를 통해서 객체 생성.
			obj[cnt].input();
//			for(int i = 0; i < cnt; i++)
//			{
//				if(obj[i].code.equals(obj[cnt].code)) 
//				{
//					System.out.println("\n상품코드 입력 오류(중복)\n");
//					return cnt;
//				}
//			}
			obj[cnt].process();
			cnt++;
			System.out.println("상품정보 입력성공");
			return cnt;
		}
		
		static void output_sangpum(Sangpum[] obj, int cnt)
		{
			int i;
			
			if(cnt == 0)
			{
				System.out.println("출력할 상품정보가 없습니다!!\n");
				return;
			}
			
			System.out.println("      *** 판매 현황 ***");
			System.out.println("========================");
			System.out.printf("   코드     이름   수량    단가   금액  평가\n");
			System.out.println("========================");
			for(i = 0; i<cnt; i++) 
			{
				obj[i].output();
			}		
			System.out.println("========================");
			System.out.println(" \t\t 총판금액=" + Sangpum.print_total_price()+"\n");
		}	
}
