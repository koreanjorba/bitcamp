package egoing;

class C1 {

	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		System.out.println(static_variable);
	}
	static void static_instance() {
		//system.out.println(instance_variable); Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ����x
	}
	
	void instance_static() {
		System.out.println(static_variable); 	//�ν��Ͻ� �޼ҵ忡�� Ŭ���� ���� ����x
	}

}
