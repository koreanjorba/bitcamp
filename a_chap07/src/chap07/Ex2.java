package chap07;

public class Ex2 {

	public static void main(String[] args) {

//		int arr[] = new int[3];	// primitive Ÿ�Կ����� ���� ���� 
//		arr[0] = 10;            // 1��° ���
//		arr[1] = 20;
//		arr[2] = 30;
//		
//		int arr[] = {10, 20, 30}; //2��° ���
		
		int arr[];
		arr = new int[] {10, 20, 30}; //3��°
		
		int hap = 0;
		for(int i = 0; i < arr.length; i++) {
			hap += arr[i];
		}
		System.out.println("hap = " + hap);
	}

}
