package com.kbs;

import com.mbc.A;

public class C {
	public C() {
		
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	다른 패키지 - 디폴트
//		a.field3 = 1;	다른 패키지 - 프라이빗
		
		a.method1();
		//a.method2();
		//a.method3();
		
		
	}
	
	
}
