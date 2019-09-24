package hash;
import java.util.HashMap;

public class HashMap_Ex {
	 public static void main(String[] args) {
		 HashMap<Name, Integer> hashtable = new HashMap<Name, Integer>();
		 hashtable.put(new Name("해리", "포터"), new Integer(95));
		 hashtable.put(new Name("헤르미온느", "그레인져"), new Integer(100));
		 hashtable.put(new Name("론", "위즐리"), new Integer(85));
		 hashtable.put(new Name("드레이코", "알포이"), new Integer(93));
		 hashtable.put(new Name("네빌", "롱버텀"), new Integer(70));
		 
		 //해쉬코드 - 통 번호 계산 . 
		 Integer num = hashtable.get((new Name("헤르미온느", "그레인져")));
		 
		 System.out.println("헤르미온느 그레인져의 성적은? " + num);
	 }
}
