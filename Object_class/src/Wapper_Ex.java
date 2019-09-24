
public class Wapper_Ex {

	public static void main(String[] args) {
		
		//Integer 객체를 생성해 객체 안의 int값을 가져옴
		Integer obj1= new Integer(12); 					// 박싱    : 인트타입 >> 개체
		Integer obj2= new Integer(7);
		int sum = obj1.intValue() + obj2.intValue();	// 언박싱 : 개체 >> 인트타입
		System.out.println(sum);
		
		
		//명령형 파라미터로 받은 문자열을 int타입의 값으로 변환해 합산
		int total = 0 ;
		for( int cnt = 0; cnt < args.length; cnt++)
			//정적 메소드(클래스명.파스인트)
			total += Integer.parseInt(args[cnt]);
		System.out.println(total);
		
		//박싱과 언박싱
		printDouble(new Double(123.45));	//객체로 대입
		printDouble(123.45); 				//프리미티브로 대입(박싱 후 언박싱)
				
	}
	static void printDouble(Double obj) { 	//박싱
		System.out.println(obj);			//자동 언박싱  123.45 출력
	}

}
