
public class Sanpum_ex2 {

		public static void main(String[] args) {
			
		
			int i = 0;
			int cnt = 0;
			Sangpum[] obj = new Sangpum[100] ; //객체배열 주소 저장 할 공간 생성
			
			for(i = 0; i<100; i++) 
			{
				obj[i]= new Sangpum(); //객체 생성
				if(obj[i].input())
					break;
				
				obj[i].process();
				cnt++;
			}
			
			System.out.println("      *** 판매 현황 ***");
			System.out.println("========================");
			System.out.printf("   코드     이름   수량    단가   금액  평가\n");
			System.out.println("========================");
			for(i = 0; i<cnt; i++) {
				obj[i].output();
			}		
			System.out.println("========================\n\n");
			
		}
}
