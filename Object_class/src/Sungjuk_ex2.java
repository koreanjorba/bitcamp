
public class Sungjuk_ex2 {

	public static void main(String[] args) {
		Sungjuk obj1 = new Sungjuk();
		obj1.input();
		obj1.process();
		
		System.out.println(obj1.toString());
		Sungjuk obj2 = new Sungjuk();
		obj2.input();
		obj2.process();
		System.out.println(obj2.toString());
		
		if(obj1 == obj2)
			System.out.println("����");
		else
			System.out.println("�ٸ���");
		
		if(obj1.equals(obj2))				//������ ��ü�� �ּ�
			System.out.println("����");
		else
			System.out.println("�ٸ���");

	}

}
