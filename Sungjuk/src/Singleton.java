
public class Singleton {
	//static �� �ϳ��� ��ü�� ����
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//�ܺ� ���ٿ� ���ν��Ͻ� ����(default)
	static Singleton getInstance() {
		return singleton;
	}
	
}
