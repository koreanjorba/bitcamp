
public class Inheritance_Ex {
	 public static void main(String[] args) {
		 BonusPointAccount obj = new BonusPointAccount("333-33-333333", "김미영", 0, 0);
		
 // 생성된 객체(자식인 BonusPointAccount)에서 오버라이딩 된 메소드가 출력됨(deposit)
 // 데이터타입 Account에 있는 필드/메소드에만 접근 가능
//		 Account obj = new BonusPointAccount("333-33-333333", "김미영", 0, 0);
		
		 obj.deposit(1000000);
		 System.out.println("잔액: " + obj.balance);
		 //Account 에는 bonusPoint 필드가 없다!
		 System.out.println("누적 포인트:" + obj.bonusPoint);
		 
		 CreditLineAccount obj2 = new CreditLineAccount("000-11-111111", "김선달", 10000, 20000000);
		 
		 try {
			 int amount = obj2.withdraw(50000);
			 System.out.println("인출액:" + amount);
			 System.out.println("잔액:" + obj2.balance);
			 System.out.println("마이너스 한도:" + obj2.creditLine);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
}
