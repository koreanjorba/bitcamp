
public class Inheritance_Ex {
	 public static void main(String[] args) {
		 BonusPointAccount obj = new BonusPointAccount("333-33-333333", "��̿�", 0, 0);
		
 // ������ ��ü(�ڽ��� BonusPointAccount)���� �������̵� �� �޼ҵ尡 ��µ�(deposit)
 // ������Ÿ�� Account�� �ִ� �ʵ�/�޼ҵ忡�� ���� ����
//		 Account obj = new BonusPointAccount("333-33-333333", "��̿�", 0, 0);
		
		 obj.deposit(1000000);
		 System.out.println("�ܾ�: " + obj.balance);
		 //Account ���� bonusPoint �ʵ尡 ����!
		 System.out.println("���� ����Ʈ:" + obj.bonusPoint);
		 
		 CreditLineAccount obj2 = new CreditLineAccount("000-11-111111", "�輱��", 10000, 20000000);
		 
		 try {
			 int amount = obj2.withdraw(50000);
			 System.out.println("�����:" + amount);
			 System.out.println("�ܾ�:" + obj2.balance);
			 System.out.println("���̳ʽ� �ѵ�:" + obj2.creditLine);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
}
