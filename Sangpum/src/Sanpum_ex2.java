
public class Sanpum_ex2 {

		public static void main(String[] args) {
			
		
			int i = 0;
			int cnt = 0;
			Sangpum[] obj = new Sangpum[100] ; //��ü�迭 �ּ� ���� �� ���� ����
			
			for(i = 0; i<100; i++) 
			{
				obj[i]= new Sangpum(); //��ü ����
				if(obj[i].input())
					break;
				
				obj[i].process();
				cnt++;
			}
			
			System.out.println("      *** �Ǹ� ��Ȳ ***");
			System.out.println("========================");
			System.out.printf("   �ڵ�     �̸�   ����    �ܰ�   �ݾ�  ��\n");
			System.out.println("========================");
			for(i = 0; i<cnt; i++) {
				obj[i].output();
			}		
			System.out.println("========================\n\n");
			
		}
}
