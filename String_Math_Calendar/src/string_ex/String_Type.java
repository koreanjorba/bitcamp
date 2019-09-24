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
		
		//기존 객체에 값 덮어쓰기
		StringBuilder sb= new StringBuilder("역사를 하노라고 맨땅으 파다가 ");
		System.out.println(sb);
		System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니"));
		System.out.println(sb.insert(26, "하나"));
		System.out.println(sb.delete(21, 23));
		System.out.println(sb.deleteCharAt(9));
		System.out.println(sb);
		System.out.println();
		//공백단위로 추출
		StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
			System.out.println(stok.nextToken());
			System.out.println(stok.nextToken());
			System.out.println(stok.nextToken());
		
			while(stok.hasMoreTokens()) {
				String str = stok.nextToken();
				System.out.println(str);
			}
			System.out.println();
			
		StringTokenizer stok1 = new StringTokenizer("사과, 배, 복숭아",",",true); //true 는 구획문자도 토큰으로 반활할지 여부
			while(stok1.hasMoreTokens()) {
				String str = stok1.nextToken();
				System.out.println(str);
			}
			System.out.println();
			
		StringTokenizer stok2 = new StringTokenizer("사과=10|초콜렛=3|샴페인=1","=|",true); //true 는 구획문자도 토큰으로 반활할지 여부
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
