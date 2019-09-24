package chap07;

public class Ex2 {

	public static void main(String[] args) {

//		int arr[] = new int[3];	// primitive 타입에서는 값을 저장 
//		arr[0] = 10;            // 1번째 방법
//		arr[1] = 20;
//		arr[2] = 30;
//		
//		int arr[] = {10, 20, 30}; //2번째 방법
		
		int arr[];
		arr = new int[] {10, 20, 30}; //3번째
		
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println("hap = " + hap);
	}

}
