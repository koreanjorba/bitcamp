package string_ex;

import java.util.StringTokenizer;

public class String_Type {

	public static void main(String[] args) {
		String str1 = "   Let it be.   ";
		String str2 = str1.trim();
		System.out.println(str2);
		System.out.println(str2.concat(" speaking words of wisdom."));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str2.substring(0, 3));
		System.out.println(str2.charAt(2));
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		//���� ��ü�� �� �����
		StringBuilder sb= new StringBuilder("���縦 �ϳ��� �Ƕ��� �Ĵٰ� ");
		System.out.println(sb);
		System.out.println(sb.append("Ŀ�ٶ� ���ε��� ������ ������� ����"));
		System.out.println(sb.insert(26, "�ϳ�"));
		System.out.println(sb.delete(21, 23));
		System.out.println(sb.deleteCharAt(9));
		System.out.println(sb);
		System.out.println();
		//��������� ����
		StringTokenizer stok = new StringTokenizer("��� �� ������");
			System.out.println(stok.nextToken());
			System.out.println(stok.nextToken());
			System.out.println(stok.nextToken());
		
			while(stok.hasMoreTokens()) {
				String str = stok.nextToken();
				System.out.println(str);
			}
			System.out.println();
			
		StringTokenizer stok1 = new StringTokenizer("���, ��, ������",",",true); //true �� ��ȹ���ڵ� ��ū���� ��Ȱ���� ����
			while(stok1.hasMoreTokens()) {
				String str = stok1.nextToken();
				System.out.println(str);
			}
			System.out.println();
			
		StringTokenizer stok2 = new StringTokenizer("���=10|���ݷ�=3|������=1","=|",true); //true �� ��ȹ���ڵ� ��ū���� ��Ȱ���� ����
			while(stok2.hasMoreTokens()) {
				String str = stok2.nextToken();
				if(str.equals("="))
					System.out.print("\t");
				else if(str.equals("|"))
					System.out.print("\n");
				else
					System.out.print(str);
			}
		
	}

}
