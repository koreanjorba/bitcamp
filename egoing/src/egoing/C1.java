package egoing;

class C1 {

	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//system.out.println(instance_variable); 클래스 메소드에서 인스턴스 변수에 접근x
	}
	
	void instance_static() {
		System.out.println(static_variable); 	//인스턴스 메소드에서 클래스 변수 접근x
	}

}
