
public class Singleton_Ex {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); 접근 불가(컴파일 에러)
		//Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체 입니다");
		}else {
			System.out.println("다른 싱글톤 객체 입니다");
		}


	}

}
