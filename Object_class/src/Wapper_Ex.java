
public class Wapper_Ex {

	public static void main(String[] args) {
		
		//Integer ��ü�� ������ ��ü ���� int���� ������
		Integer obj1= new Integer(12); 					// �ڽ�    : ��ƮŸ�� >> ��ü
		Integer obj2= new Integer(7);
		int sum = obj1.intValue() + obj2.intValue();	// ��ڽ� : ��ü >> ��ƮŸ��
		System.out.println(sum);
		
		
		//����� �Ķ���ͷ� ���� ���ڿ��� intŸ���� ������ ��ȯ�� �ջ�
		int total = 0 ;
		for( int cnt = 0; cnt < args.length; cnt++)
			//���� �޼ҵ�(Ŭ������.�Ľ���Ʈ)
			total += Integer.parseInt(args[cnt]);
		System.out.println(total);
		
		//�ڽ̰� ��ڽ�
		printDouble(new Double(123.45));	//��ü�� ����
		printDouble(123.45); 				//������Ƽ��� ����(�ڽ� �� ��ڽ�)
				
	}
	static void printDouble(Double obj) { 	//�ڽ�
		System.out.println(obj);			//�ڵ� ��ڽ�  123.45 ���
	}

}
