package com.mbc;

public class A {
////필드
//	A a1 = new A(true);
//	A a2 = new A(1);
//	A a3 = new A("문자열");
////생성자
//	public A(boolean b) {} 
//	A(int b){}				//디폴트 - 패키지가 같은 경우에 가능
//	private A(String s) {}
	
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() 
	{
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	//method
	public void method1() {}
	void method2() {}			//같은 패키지까지만 허용
	private void method3() {} //같은 클래스만 허용
}
