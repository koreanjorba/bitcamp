package Basic_Ex;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex02 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		/*
		 * int num = list.size(); for(int cnt = 0; cnt < num; cnt++) { String str =
		 * list.get(cnt); System.out.println(str); }
		 */
		
		Iterator<String> iterator = list.iterator(); //iterator 객체를 리턴하는 메소드
		while (iterator.hasNext()) {
			String str= iterator.next();
			System.out.println(str);
		}
		
		//향상된 for문 - 효율적인 데이터 처리
		for(String str : list) {
			System.out.println(str);
		}
	}
}
