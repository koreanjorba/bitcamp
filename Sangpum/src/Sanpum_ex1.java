
public class Sanpum_ex1 {

		public static void main(String[] args) {
			
		
			
			Sangpum obj = new Sangpum();  // obj - 클래스 변수
			
			Sangpum obj2 = new Sangpum("C002", "휴대폰", 90, 90000); //실 매개변수. 실 인수.
			
		
			obj.input();
			obj.process();


			obj2.process();
			//System.out.println(obj == obj2);
			//Sangpum.process();
			
			System.out.println("      *** 판매 현황 ***");
			System.out.println("========================");
			System.out.printf("   코드     이름   수량    단가   금액  평가\n");
			System.out.println("========================");
			obj.output();
			obj2.output();
			System.out.println("========================\n\n");
			
		}
}
