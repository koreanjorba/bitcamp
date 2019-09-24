package hash;
import java.util.HashMap;

public class Ex05 {

	public static void main(String[] args) {
		
		//키 값(String)으로 통번호를 계산하고 , 통번호는 중복 가능하기에, 다시 키 값을 비교해 데어터(Integer)를 리턴 
		HashMap<String, Integer> hashtable = new HashMap<String, Integer>();
		hashtable.put("해리", new Integer(95));
		hashtable.put("헤르미온느", new Integer(100));
		hashtable.put("론", new Integer(85));
		hashtable.put("드레이코", new Integer(93));
		hashtable.put("네빌", new Integer(70));
		Integer num = hashtable.get("헤르미온느");
		System.out.println("헤르미온느 성적은? " + num);
		
		//
		String obj1 = new String("헤르미온느");
		String obj2 = new String("헤르미온느");
		int hash1 = obj1.hashCode();
		int hash2 = obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
	}

}
