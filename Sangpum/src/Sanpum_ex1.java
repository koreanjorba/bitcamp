
public class Sanpum_ex1 {

		public static void main(String[] args) {
			
		
			
			Sangpum obj = new Sangpum();  // obj - Ŭ���� ����
			
			Sangpum obj2 = new Sangpum("C002", "�޴���", 90, 90000); //�� �Ű�����. �� �μ�.
			
		
			obj.input();
			obj.process();


			obj2.process();
			//System.out.println(obj == obj2);
			//Sangpum.process();
			
			System.out.println("      *** �Ǹ� ��Ȳ ***");
			System.out.println("========================");
			System.out.printf("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
			System.out.println("========================");
			obj.output();
			obj2.output();
			System.out.println("========================\n\n");
			
		}
}
