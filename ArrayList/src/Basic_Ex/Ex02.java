package Basic_Ex;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		/*
		 * int num = list.size(); for(int cnt = 0; cnt < num; cnt++) { String str =
		 * list.get(cnt); System.out.println(str); }
		 */
		
		Iterator<String> iterator = list.iterator(); //iterator ��ü�� �����ϴ� �޼ҵ�
		while (iterator.hasNext()) {
			String str= iterator.next();
			System.out.println(str);
		}
		
		//���� for�� - ȿ������ ������ ó��
		for(String str : list) {
			System.out.println(str);
		}
	}
}
