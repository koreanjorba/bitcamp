package chap07;

public class Ex1 {

	public static void main(String[] args) {
	
		String strVar1 = "�Ź�ö"; // ��ü ����. ��������-100����(stack�� ����) "�Ź�ö" (heap�� ����)
		String strVar2 = "�Ź�ö"; // 		�Ȱ��� 100���� �ּ� �� ����	
	
		if(strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
			
		}
		
		String strVar3 = new String("�Ź�ö"); // ��ü ����
		String strVar4 = new String("�Ź�ö"); // �� �ٸ� ��ü ����
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}
		
		String strVar5 = null; //null�� ��ü ���� x. ���� equals(�޼ҵ�)�� �ҷ��� �� ����. �����ϴ� �ּҵ� ����.
		String strVar6 = "�Ź�ö"; //
		
		if(strVar5 == strVar6) {
			System.out.println("strVar5�� strVar6�� ������ ����");
		}else {
			System.out.println("strVar5�� strVar6�� ������ �ٸ�");
		}
		if(strVar5.equals(strVar6)) {
			System.out.println("strVar5�� strVar6�� ���ڿ��� ����");
		}
		
		

	}

}
