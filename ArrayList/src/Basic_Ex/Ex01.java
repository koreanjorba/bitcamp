package Basic_Ex;
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2, "Ű��");
		list.set(0, "������");
		list.remove(1);
		list.remove("Ű��");
		
		int num = list.size();
		for(int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
		System.out.println(num);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("���");
		list1.add("�ӷ�");
		list1.add("���");
		list1.add("�޵�");
		list1.add("���");
		list1.add("�ڵ�");
		list1.add("���");
		//int index1 = list1.indexOf("���");
		//int index2 = list1.lastIndexOf("���");
		//System.out.println("ù��° ���:" + index1);
		//System.out.println("������ ���:" + index2);
		
		//�ι�° ��� ��ġ
		
		int index1, cnt = 0;
		
		for( index1 =0; index1 < list1.size(); index1++) 
		{
			//String str = list1.get(index);
			if(list1.get(index1).equals("���")) 
				cnt++;
			if(cnt == 2)
				break;
		}
		System.out.println("����� ��ġ��~ " + index1);
	
		
		//str�̶� ������ list1�� ������ ����
		for(String str : list1)
		{
			System.out.println(str);
		}
	}
}
