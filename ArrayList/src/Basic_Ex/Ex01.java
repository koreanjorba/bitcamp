package Basic_Ex;
import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		list.set(0, "오렌지");
		list.remove(1);
		list.remove("키위");
		
		int num = list.size();
		for(int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}
		System.out.println(num);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("사과");
		list1.add("머루");
		list1.add("사과");
		list1.add("앵두");
		list1.add("사과");
		list1.add("자두");
		list1.add("사과");
		//int index1 = list1.indexOf("사과");
		//int index2 = list1.lastIndexOf("사과");
		//System.out.println("첫번째 사과:" + index1);
		//System.out.println("마지막 사과:" + index2);
		
		//두번째 사과 위치
		
		int index1, cnt = 0;
		
		for( index1 =0; index1 < list1.size(); index1++) 
		{
			//String str = list1.get(index);
			if(list1.get(index1).equals("사과")) 
				cnt++;
			if(cnt == 2)
				break;
		}
		System.out.println("사과의 위치는~ " + index1);
	
		
		//str이란 변수에 list1의 값들을 저장
		for(String str : list1)
		{
			System.out.println(str);
		}
	}
}
