package chapt04;

public class Ex05 {

	public static void main(String[] args) {
	
		String strVar1 = "�Ź�ö"; //������ �� ��ü ���� - 100����
		String strVar2 = "�Ź�ö"; // ��ü �ּҸ� ��ȯ(���� ����  x) - 100����
		String strVar3 = new String("�Ź�ö"); // ���ο� ��ü ���� - 200����
		System.out.println( strVar1 == strVar2);
		System.out.println( strVar1 == strVar3); //false
		System.out.println( "----------------");
		System.out.println( strVar1.equals(strVar2)); // equals - ���ڿ� ���� ��(�ּҰ� �ƴ�)
		System.out.println( strVar1.equals(strVar3));
		
		
	}

}
