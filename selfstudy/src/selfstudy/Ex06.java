package selfstudy;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;	//1 2 3 4 5 ���� �� ����ϱ�. ���ڷθ�??
		int sum = 0;
		
		for(; num > 0; num/=10) {
			
			sum += num%10;
		}
		System.out.println(sum);
		
	}

}
