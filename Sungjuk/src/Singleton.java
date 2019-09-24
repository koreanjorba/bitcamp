
public class Singleton {
	//static 단 하나의 객체만 생성
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//외부 접근용 겟인스턴스 생성(default)
	static Singleton getInstance() {
		return singleton;
	}
	
}
