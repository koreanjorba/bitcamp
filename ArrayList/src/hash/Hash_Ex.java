package hash;

import java.util.HashMap;

public class Hash_Ex {

	public static void main(String[] args) {
		
		//Ű ��(String)���� ���ȣ�� ����ϰ� , ���ȣ�� �ߺ� �����ϱ⿡, �ٽ� Ű ���� ���� ������(Integer)�� ���� 
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("�ظ�", new Integer(95));
		hashtable.put("�츣�̿´�", new Integer(100));
		hashtable.put("��", new Integer(85));
		hashtable.put("�巹��Su��", new Integer(93));
		hashtable.put("�׺�", new Integer(70));
		Integer num = hashtable.get("�츣�̿´�");
		System.out.println("�츣�̿´� ������? " + num);
		
		//hascode �޼ҵ� �������̵� ���� �ٸ� �� �Ĵ� ���� �� 
		Name obj1 = new Name("�츣�̿´�", "�׷�����");
		Name obj2 = new Name("�츣�̿´�", "�׷�����");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
	}

}
